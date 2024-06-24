<template>
    <div class="notification-content">
      <p style="text-align: center; font-size: 14px;">赵鹏振&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-13&nbsp;&nbsp;|&nbsp;&nbsp;黑龙江
      </p>
      <p>
        <img :src="imageSrc" alt="Example Image" class="notification-image" />
      </p>
      <p style="text-indent: 2em;">
        拳击不仅能提升你的力量和速度，还能提高反应能力和协调性。拳击训练涉及大量的有氧运动和力量训练，可以帮助你燃烧卡路里，增强体质。无论是打沙袋还是实战训练，都能让你释放内心的能量！拳击是一项全身运动，能够锻炼到你身体的每一个部位。
      </p>
      <p style="text-indent: 2em;">
        在进行拳击训练时，记得佩戴适当的防护装备，例如拳套、头盔、护齿和护胫，以确保安全。此外，找到一个专业的拳击教练也是至关重要的，他们可以为你提供专业的指导和建议，帮助你在安全的环境中高效训练。通过专业的指导，你不仅可以学习到正确的技术和动作，还能避免因错误动作导致的受伤。
      </p>
      <p style="text-indent: 2em;">
        无论你是为了强身健体，还是为了提升心理素质，拳击都能为你带来全方位的收益，使你在各个方面都能得到显著的提升和成长。
      </p>
    </div>
  </template>
    
  <script setup>
  import { ref } from 'vue'
  
  const imageSrc = ref(new URL('@/assets/boxing.png', import.meta.url).href)
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
    