from flask import Flask, request, jsonify
from flask_cors import CORS
import onnxruntime as ort
from PIL import Image
import numpy as np
import cv2
from flask_socketio import SocketIO, emit

app = Flask(__name__)
socketio = SocketIO(app,cors_allowed_origins=["http://localhost:5173"])
CORS(app, resources={r"/*": {"origins": "*"}})  # 启用 CORS 并允许所有来源

# 加载 ONNX 模型
session = ort.InferenceSession('vgg+ferplus_it60.onnx')
input_name = session.get_inputs()[0].name

emotion_list = ['angry', 'disgust', 'fear', 'happy', 'sad', 'surprise', 'neutral']
feeling = []
frame_count = 0
max_emotion = "null"
emotion_result = ""

def preprocess_image(image):
    height, width = image.size[:2]

    # 将PIL图像转换为NumPy数组
    image = np.array(image)

    # 将图像转换为灰度图
    gray_frame = cv2.cvtColor(image, cv2.COLOR_RGB2GRAY)
    
    # 加载人脸检测分类器
    face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
    
    # 检测人脸
    faces = face_cascade.detectMultiScale(gray_frame, scaleFactor=1.1, minNeighbors=5, minSize=(30, 30))
    
    if len(faces) == 0:
        return None,None  # 如果没有检测到人脸，返回None
    # 提取第一张检测到的人脸区域
    x, y, w, h = faces[0]
    face_roi = gray_frame[y:y + h, x:x + w]
    # 调整人脸区域的大小以适应模型输入尺寸
    face_roi = cv2.resize(face_roi, (48, 48))  # 假设模型输入尺寸为48x48
    # 归一化图像像素值
    face_roi = face_roi.astype('float32') / 255.0
    # 添加通道维度
    face_roi = np.expand_dims(face_roi, axis=0)  # 变成 (1, 48, 48)
    # 添加批次维度
    face_roi = np.expand_dims(face_roi, axis=0)  # 变成 (1, 1, 48, 48)

    return face_roi,image

@app.route('/predict', methods=['POST'])
def predict():
    global feeling, frame_count, emotion_result,max_emotion  # 声明这些变量为全局变量
    if 'file' not in request.files:
        return jsonify({'error': 'No file uploaded'}), 400
    file = request.files['file']
    image = Image.open(file.stream)
    input_data,ret_img = preprocess_image(image)

    # 如果没有检测到人脸，返回null作为表情结果
    if input_data is not None:
        result = session.run(None, {input_name: input_data})
        # 获取结果数组并找到最大值的下标
        result_array = result[0].tolist()
        max_index = int(np.argmax(result_array))  # 转换为int类型以确保可序列化

        # 获取对应的情感
        max_emotion = emotion_list[max_index]
    else:
        max_emotion = "null"
    frame_count += 1
    if len(feeling) < 90:
        feeling.append(max_emotion)
    else:
        feeling.pop(0)
        feeling.append(max_emotion)

    if frame_count >= 30:
        emotion_result = ""
        emo_dict = dict()
        for f in emotion_list:
            emo_dict[f] = 0
        emo_dict["null"] = 0
        for i in feeling:
            emo_dict[i] += 1

        happy_count = emo_dict["happy"] + emo_dict["surprise"]
        neutral_count = emo_dict["neutral"]
        sad_count = (emo_dict["sad"]+emo_dict["fear"]
                     +emo_dict["angry"]+emo_dict["disgust"])
        null_count = emo_dict["null"]

        if max(happy_count, neutral_count, sad_count, null_count) == happy_count:
            emotion_result = "go on!!!!!"
        elif max(happy_count, neutral_count, sad_count, null_count) == neutral_count:
            emotion_result = "hold on:)"
        elif max(happy_count, neutral_count, sad_count, null_count) == null_count:
            emotion_result = "please show in front of the camera"
        else:
            emotion_result = "relax-_-"
        frame_count = 0
    print(emotion_result)

    return jsonify({
        'emotion': max_emotion,
        'emotion_result': emotion_result
    })

def generate_video_stream(frame):
    if frame is None:
        return
    _, buffer = cv2.imencode('.jpg', frame)
    frame_bytes = buffer.tobytes()
    socketio.emit('video_stream', frame_bytes)
    socketio.sleep(0.1)  # 控制帧率

@app.route('/')
def index():
    return "Video Stream Server"

@socketio.on('connect')
def handle_connect():
    socketio.start_background_task(generate_video_stream)


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5001)
