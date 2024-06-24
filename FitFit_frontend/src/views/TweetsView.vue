<script setup>
import Navigator from '../components/NavigationBar.vue'
import { ref, h } from 'vue'
import { ElNotification } from 'element-plus'
import NotificationContent from '../components/NotificationContent.vue'
import NotificationContent2 from '../components/NotificationContent2.vue'
import NotificationContent3 from '../components/NotificationContent3.vue'
import NotificationContent4 from '../components/NotificationContent4.vue'
import NotificationContent5 from '../components/NotificationContent5.vue'
import NotificationContent6 from '../components/NotificationContent6.vue'
import NotificationContent7 from '../components/NotificationContent7.vue'

const items = ref([
    { src: new URL('@/assets/top1.png', import.meta.url).href, alt: 'Image 1' },
    { src: new URL('@/assets/top2.png', import.meta.url).href, alt: 'Image 2' },
    { src: new URL('@/assets/top3.png', import.meta.url).href, alt: 'Image 3' }
])

const showMask = ref(false)

const toggleMask = () => {
    showMask.value = !showMask.value
}

const showNotification = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🏋️‍♂️ 力量训练',
        message: h(NotificationContent),
        duration: 0,
        position: 'top-left',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification2 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🏃‍♀️ 跑步的魔力',
        message: h(NotificationContent2),
        duration: 0,
        position: 'top-right',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification3 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🚴‍♂️ 骑行的乐趣',
        message: h(NotificationContent3),
        duration: 0,
        position: 'top-left',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification4 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🏊‍♂️ 游泳的自由',
        message: h(NotificationContent4),
        duration: 0,
        position: 'top-left',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification5 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🥊 拳击的力量与速度',
        message: h(NotificationContent5),
        duration: 0,
        position: 'top-right',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification6 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🧘‍♀️ 瑜伽的宁静',
        message: h(NotificationContent6),
        duration: 0,
        position: 'top-left',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

const showNotification7 = () => {
    showMask.value = true; // 显示遮罩层
    document.documentElement.classList.add('blur-active'); // 添加 blur-active 类

    // 使用 Vue 组件作为通知内容
    ElNotification({
        title: '🧗‍♀️ 攀岩挑战',
        message: h(NotificationContent7),
        duration: 0,
        position: 'top-right',
        customClass: 'custom-notification',
        dangerouslyUseHTMLString: true,
        onClose: () => {
            showMask.value = false; // 通知关闭时隐藏遮罩层
            document.documentElement.classList.remove('blur-active'); // 移除 blur-active 类
        }
    })
}

function openInNewTab(url) {
    var win = window.open(url, '_blank');
    win.focus();
}
</script>

<template>
    <Navigator />
    <el-backtop :right="50" :bottom="50" />
    <div class="carousel-container-top">
        <el-carousel indicator-position="outside">
            <el-carousel-item v-for="(item, index) in items" :key="index">
                <img :src="item.src" :alt="item.alt" class="carousel-image" />
            </el-carousel-item>
        </el-carousel>
    </div>
    <div v-if="showMask" class="mask"></div>
    <div class="card_1">
        <el-card class="custom-card" style="max-width: 1000px; flex: 65;" shadow="hover" @click="showNotification">
            <img src="../assets/strength.png" class="hover-zoom" style="width: 100%; height: 300px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #ffffff; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px;">🏋️‍♂️ 力量训练</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px;">
                    力量训练不仅能让你更强壮，还能提高新陈代谢，帮助你燃烧更多的卡路里！今天就试试深蹲和硬拉，让自己更强大吧！
                </p><br><br><br>
            </div>
        </el-card>
        <el-card class="custom-card" style="max-width: 1000px; flex: 35;" shadow="hover" @click="showNotification2">
            <img src="../assets/running.png" class="hover-zoom" style="width: 100%; height: 200px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #33aee3; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px; color: white;">🏃‍♀️ 跑步的魔力</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px; color: white;">
                    研究表明，跑步可以促进大脑释放内啡肽，这种化学物质能让你感到愉悦和放松。无论是晨跑还是夜跑，让双脚带你去探索新的世界吧！
                </p><br><br><br><br><br><br>
            </div>
        </el-card>
    </div>
    <div class="card_2">
        <el-card class="custom-card" style="max-width: 1000px; flex: 32;" shadow="hover" @click="showNotification3">
            <img src="../assets/cycling.png" class="hover-zoom" style="width: 100%; height: 250px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #3453dd; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px; color: white;">🚴‍♂️ 骑行的乐趣</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px; color: white;">
                    骑行过程中，你可以选择不同的路线，探索城市或乡村的美景。周末来一场长途骑行，感受风在耳边呼啸的快感！
                </p><br><br><br><br><br><br><br>
            </div>
        </el-card>
        <el-card class="custom-card" style="max-width: 1000px; flex: 32;" shadow="hover" @click="showNotification4">
            <img src="../assets/swimming.png" class="hover-zoom" style="width: 100%; height: 250px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #ffffff; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px;">🏊‍♂️ 游泳的自由</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px;">
                    游泳是一项全身运动，可以锻炼到几乎所有的肌肉群。无论是自由泳还是蛙泳，都能让你在水中感受到自由的畅游。
                </p><br><br><br><br><br><br><br>
            </div>
        </el-card>
        <el-card class="custom-card" style="max-width: 1000px; flex: 35;" shadow="hover" @click="showNotification5">
            <img src="../assets/boxing.png" class="hover-zoom" style="width: 100%; height: 250px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #ededed; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px; color: rgb(0, 0, 0);">🥊 拳击的力量与速度</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px; color: rgb(0, 0, 0);">
                    无论是打沙袋还是实战训练，都能让你释放内心的能量！拳击是一项全身运动，能够锻炼到你身体的每一个部位。
                </p><br><br><br><br><br><br><br>
            </div>
        </el-card>
    </div>
    <div class="card_3">
        <el-card class="custom-card" style="max-width: 1000px; flex: 65;" shadow="hover" @click="showNotification6">
            <img src="../assets/yoga.png" class="hover-zoom" style="width: 100%; height: 300px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #ffffff; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px;">🧘‍♀️ 瑜伽的宁静</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px;">
                    瑜伽能够增强你的专注力和心理韧性，使你在面对生活和工作中的挑战时更加从容不迫。每天花20分钟练习瑜伽，拥抱身心的和谐。
                </p><br><br><br>
            </div>
        </el-card>
        <el-card class="custom-card" style="max-width: 1000px; flex: 35;" shadow="hover" @click="showNotification7">
            <img src="../assets/climbing.png" class="hover-zoom" style="width: 100%; height: 250px; object-fit: cover;" />
            <div class="footer-content" style="background-color: #3453dd; text-align: left;">
                <br>
                <p style="font-size: 24px; margin-left: 25px; margin-right: 25px; color: white;">🧗‍♀️ 攀岩挑战</p><br>
                <p style="font-size: 16px; margin-left: 25px; margin-right: 25px; color: white;">
                    攀岩是一项极富挑战性的运动，需要全身的协调和力量。每一次攀登都是对自我极限的突破，让你在到达顶峰时感受到无比的成就感！
                </p><br><br><br><br><br><br>
            </div>
        </el-card>
    </div>
    <div class="background-container">
        <p style="color: white; font-size: 24px;">关注我们</p><br>
        <div class="image-wrapper">
            <div class="image-container" @click="openInNewTab('https://www.tongji.edu.cn/')">
                <img src="../assets/university.png" alt="公司简介" class="normal-image" style="background-color: #ffffff;">
                <img src="../assets/university.png" alt="公司简介" class="hover-image" style="background-color: #ffffff;">
                <div class="text-overlay">加入我们</div>
            </div>
            <div class="image-container" @click="openInNewTab('https://sse.tongji.edu.cn/')">
                <img src="../assets/logo2.png" alt="公司简介2" class="normal-image">
                <img src="../assets/logo2.png" alt="公司简介2" class="hover-image">
                <div class="text-overlay">联系我们</div>
            </div>
        </div>
        <br>
        <p style="color: white; font-size: 20px;">FitFit&nbsp;&nbsp;·&nbsp;&nbsp;FitFit&nbsp;&nbsp;·&nbsp;&nbsp;FitFit</p>
    </div>
</template>

<style>
.carousel-container-top {
    margin-top: 105px;
    width: 80vw;
    height: 600px;
    margin-left: -8%;
    margin-right: auto;
    position: relative;
    z-index: 1;
    /* 确保内容处于最底层 */
}

.carousel-image {
    width: 100%;
    height: 600px;
    object-fit: cover;
}

.el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
    background-color: #d3dce6;
}

.el-card .el-card__body {
    padding: 0px;
}

.card_1,
.card_2,
.card_3 {
    width: 80vw;
    display: flex;
    justify-content: space-between;
    gap: 20px;
    height: 500px;
    z-index: 1;
    margin-left: -8%;
    /* 确保内容处于最底层 */
}

.card_1 {
    position: absolute;
    top: 440px;
}

.card_2 {
    position: absolute;
    top: 970px;
}

.card_3 {
    position: absolute;
    top: 1500px;
}

.custom-card {
    display: flex;
    flex-direction: column;
    transition: box-shadow 0.1s, transform 0.1s;
}

.custom-card:hover {
    box-shadow: 0 30px 50px rgba(0, 0, 0, 0.5);
    transform: translateY(-18px);
    cursor: pointer;
}

.footer-content {
    flex-grow: 1;
}

.footer-content p {
    margin: 0;
    font-size: 16px;
}

.hover-zoom {
    transition: transform 0.3s;
}

.hover-zoom:hover {
    transform: scale(1.1);
}

.mask {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    z-index: 2;
    backdrop-filter: blur(5px);
    pointer-events: none;
}

.custom-notification {
    position: fixed;
    z-index: 3;
    background-color: #ffffff !important;
    color: #000 !important;
    border-radius: 10px !important;
    padding: 20px !important;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2) !important;
    width: 1200px !important;
    max-height: 810px !important;
    /* 设置最大高度 */
    overflow-y: auto !important;
    /* 添加垂直滚动条 */
    transition: transform 1s ease-out !important;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    text-align: center;
    font-family: Arial, sans-serif;
    margin-top: 15px;
    margin-bottom: 15px;
    /* 设置字体 */
}

.custom-notification .el-notification__title {
    font-weight: bold !important;
    font-size: 24px !important;
    margin-bottom: 10px !important;
    color: #333333;
    margin-top: 20px;
    /* 设置标题颜色 */
}

.custom-notification .el-notification__content {
    font-size: 18px !important;
    /* 设置内容字体大小 */
    color: #666666 !important;
    /* 设置内容颜色 */
    line-height: 1.5 !important;
    /* 设置行高 */
    margin: 0 20px !important;
    /* 设置内容内边距 */
    text-align: justify !important;
    /* 设置内容两端对齐 */
}

.el-notification-fade-enter-active,
.el-notification-fade-leave-active {
    transition: all 0.4s ease-out !important;
}

.el-notification-fade-enter,
.el-notification-fade-leave-to {
    transform: translateX(-100%) !important;
}

/* 禁止点击底层内容 */
.blur-active .carousel-container-top,
.blur-active .card_1,
.blur-active .card_2,
.blur-active .card_3 {
    pointer-events: none;
}

.background-container {
    width: 99vw;
    background-color: #252525;
    /* 设置黑色背景 */
    padding: 40px 40px;
    /* 添加上下内边距，移除左右内边距 */
    box-sizing: border-box;
    /* 确保内边距不会影响总宽度 */
    position: relative;
    margin-top: 1325px;
    margin-left: -18%;
    /* 调整顶部间距 */
}

.image-wrapper {
    display: flex;
    justify-content: space-between;
}

.image-container {
    position: relative;
    width: calc(50% - 15px);
    /* 每个图片容器的宽度为整体的50%，并减去间距的一半 */
    height: 300px;
    /* 调整为图片的实际高度 */
    overflow: hidden;
    cursor: pointer;
    /* 鼠标变为手指 */
}

.normal-image,
.hover-image {
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    transition: opacity 0.4s ease, transform 0.4s ease;
    object-fit: cover;
    /* 保持比例填充 */
}

.image-container:hover .normal-image,
.image-container:hover .hover-image {
    transform: scale(1.1);
    /* 放大效果 */
}

.hover-image {
    opacity: 0;
}

.image-container:hover .hover-image {
    opacity: 1;
}

.image-container:hover .normal-image {
    opacity: 0;
}

.text-overlay {
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    color: white;
    font-size: 2em;
    background: rgba(0, 0, 0, 0.2);
    /* 半透明背景 */
    transition: background 0.4s ease;
}

.image-container:hover .text-overlay {
    background: rgba(0, 47, 255, 0.7);
    /* 悬停时背景变为蓝色 */
}

</style>
