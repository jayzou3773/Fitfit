<template>
    <div class="notification-content">
      <p style="text-align: center; font-size: 14px;">黄子迅&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-10&nbsp;&nbsp;|&nbsp;&nbsp;广东
      </p>
      <p>
        <img :src="imageSrc" alt="Example Image" class="notification-image" />
      </p>
      <p style="text-indent: 2em;">
        瑜伽不仅能增加身体的柔韧性，还能让你找到内心的平静。通过一系列的姿势和呼吸练习，瑜伽可以帮助你缓解压力，改善睡眠质量。瑜伽还能够增强你的专注力和心理韧性，使你在面对生活和工作中的挑战时更加从容不迫。每天花20分钟练习瑜伽，拥抱身心的和谐。
      </p>
      <p style="text-indent: 2em;">
        瑜伽还有助于改善姿势，增强核心力量，减少背部和颈部疼痛。无论你是初学者还是有经验的练习者，瑜伽都能为你提供一个放松身心的机会。找一个安静的地方，铺上一张瑜伽垫，开始你的瑜伽之旅吧！通过瑜伽，你还能学会更好地调节情绪，面对生活中的各种挑战时，保持冷静和自信。瑜伽还能帮助你提高身体的灵活性和稳定性，让你在其他运动中表现得更出色。
      </p>
    </div>
  </template>
    
  <script setup>
  import { ref } from 'vue'
  
  const imageSrc = ref(new URL('@/assets/yoga.png', import.meta.url).href)
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
    