<template>
    <div class="notification-content">
      <p style="text-align: center; font-size: 14px;">王奕博&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-14&nbsp;&nbsp;|&nbsp;&nbsp;江苏
      </p>
      <p>
        <img :src="imageSrc" alt="Example Image" class="notification-image" />
      </p>
      <p style="text-indent: 2em;">
        攀岩是一项极富挑战性的运动，需要全身的协调和力量。每一次攀登都是对自我极限的突破，让你在到达顶峰时感受到无比的成就感！攀岩可以锻炼你的核心肌群、臂力和腿部力量，同时也能提高你的心理素质。攀岩是一项需要高度集中和精确控制的运动，每一步都需要你全神贯注。
      </p>
      <p style="text-indent: 2em;">
        攀岩还可以培养你的问题解决能力和团队合作精神。在攀登过程中，你需要不断思考下一步的动作，并与队友合作，确保安全和成功。无论是室内攀岩还是户外攀岩，都能带给你不同的体验和乐趣。记得穿上合适的攀岩鞋，做好安全保护，享受攀登的过程。通过攀岩，你还能结识到志同道合的朋友，共同分享和交流攀岩的技巧和心得，让每一次攀登都充满乐趣和挑战。攀岩不仅锻炼身体，还能提升你的自信心和勇气，让你在生活中也能迎难而上，克服各种困难。
      </p>
    </div>
  </template>
    
  <script setup>
  import { ref } from 'vue'
  
  const imageSrc = ref(new URL('@/assets/climbing.png', import.meta.url).href)
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
    