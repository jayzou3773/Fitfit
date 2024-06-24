<template>
  <div class="notification-content">
    <p style="text-align: center; font-size: 14px;">邹昕恺&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-12&nbsp;&nbsp;|&nbsp;&nbsp;浙江
    </p>
    <p>
      <img :src="imageSrc" alt="Example Image" class="notification-image" />
    </p>
    <p style="text-indent: 2em;">
      跑步不仅能增强心肺功能，还能释放压力，改善心情。研究表明，跑步可以促进大脑释放内啡肽，这种化学物质能让你感到愉悦和放松。无论是晨跑还是夜跑，让双脚带你去探索新的世界吧！跑步是一项非常方便的运动，只需要一双跑鞋就能开始。
    </p>
    <p style="text-indent: 2em;">
      除了心理上的益处，跑步还能提高你的耐力和体能。它是一项无需任何设备就能进行的运动，非常适合想要快速锻炼的人。记得选择一双合适的跑鞋，保护你的膝盖和脚踝，并在跑步过程中保持正确的姿势，以减少受伤的风险。跑步还可以帮助你结交新朋友，加入跑步俱乐部或者参加马拉松赛事，都能让你在锻炼中找到更多乐趣和动力。跑步也有助于改善睡眠质量，让你每天早晨醒来都感觉精力充沛。
    </p>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const imageSrc = ref(new URL('@/assets/running.png', import.meta.url).href)
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
