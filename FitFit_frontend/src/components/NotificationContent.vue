<template>
  <div class="notification-content">
    <p style="text-align: center; font-size: 14px;">王奕博&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-10&nbsp;&nbsp;|&nbsp;&nbsp;江苏
    </p>
    <p>
      <img :src="imageSrc" alt="Example Image" class="notification-image" />
    </p>
    <p style="text-indent: 2em;">
      力量训练不仅能让你更强壮，还能提高新陈代谢，帮助你燃烧更多的卡路里！通过增加肌肉质量，你的身体会在休息时消耗更多的能量，这对于减肥和保持体重非常有帮助。力量训练还可以改善你的体型和姿态，使你看起来更自信和健康。今天就试试深蹲和硬拉，让自己更强大吧！
    </p>
    <p style="text-indent: 2em;">
      此外，力量训练还能改善骨密度，减少骨质疏松的风险。对于那些久坐不动的上班族来说，力量训练是保持身体健康和提高整体活力的绝佳选择。记得在训练前进行充分的热身，避免受伤，逐步增加重量，以达到最佳效果。通过力量训练，你还可以提升日常生活的功能性，搬重物、跑步等活动都会变得更加轻松自如。同时，力量训练有助于提高你的心理韧性和耐力，使你在面对生活和工作中的挑战时更加从容不迫。
    </p>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const imageSrc = ref(new URL('@/assets/strength.png', import.meta.url).href)
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
