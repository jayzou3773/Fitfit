<template>
    <div class="notification-content">
        <p style="text-align: center; font-size: 14px;">吴卓航&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-11&nbsp;&nbsp;|&nbsp;&nbsp;上海
        </p>
        <p>
            <img :src="imageSrc" alt="Example Image" class="notification-image" />
        </p>
        <p style="text-indent: 2em;">
            游泳是一项全身运动，可以锻炼到几乎所有的肌肉群。无论是自由泳还是蛙泳，都能让你在水中感受到自由的畅游。游泳不仅对心肺有益，还能提高身体的协调性和平衡能力。游泳是一项非常适合全年龄段的运动，无论你是孩子还是老人，都可以享受它带来的健康益处。
        </p>
        <p style="text-indent: 2em;">
            游泳也是一种低冲击的运动，非常适合有关节问题的人。它可以帮助你在不施加额外压力的情况下进行高效的锻炼。记得在游泳前进行适当的热身，并在游泳后进行拉伸，以避免肌肉僵硬和受伤。定期游泳还能改善你的呼吸能力和耐力，在炎热的夏天，它也是保持凉爽和健康的最佳选择。通过参加游泳课程，你还能学会更多的游泳技巧和知识，进一步提高自己的游泳水平。
        </p>
    </div>
</template>
    
<script setup>
import { ref } from 'vue'

const imageSrc = ref(new URL('@/assets/swimming.png', import.meta.url).href)
</script>
    
<style scoped>
.notification-content {
    text-align: left;
    padding: 20px;
    /* 添加一些内边距 */
}

.notification-image {
    width: 70%;
    max-height: 400px;
    /* 设置最大高度 */
    object-fit: cover;
    /* 确保图片按比例缩放 */
    margin: 20px auto;
    /* 确保图片水平居中 */
    display: block;
    /* 确保图片作为块级元素 */
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
</style>
    