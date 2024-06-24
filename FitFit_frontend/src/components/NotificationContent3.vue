<template>
  <div class="notification-content">
    <p style="text-align: center; font-size: 14px;">施雄博&nbsp;&nbsp;|&nbsp;&nbsp;2024-06-12&nbsp;&nbsp;|&nbsp;&nbsp;广西
    </p>
    <p>
      <img :src="imageSrc" alt="Example Image" class="notification-image" />
    </p>
    <p style="text-indent: 2em;">
      骑自行车是一项低冲击的有氧运动，对膝盖友好，还能让你享受户外的美景。骑行不仅可以锻炼下半身的肌肉群，还能提高心肺功能。骑行过程中，你可以选择不同的路线，探索城市或乡村的美景。周末来一场长途骑行，感受风在耳边呼啸的快感！
    </p>
    <p style="text-indent: 2em;">
      骑行不仅有助于身体健康，还能减少碳排放，为环境保护贡献一份力量。无论是城市骑行还是山地骑行，都能让你发现不同的风景和乐趣。记得戴上头盔，穿上适合的骑行装备，确保安全骑行。通过定期的骑行，你还能逐渐增加耐力和速度，参加一些骑行比赛或者慈善骑行活动，为自己的健康和社会公益贡献力量。骑行也是一种很好的社交活动，你可以和朋友或家人一起骑行，享受共同运动的快乐。
    </p>
  </div>
</template>
  
<script setup>
import { ref } from 'vue'

const imageSrc = ref(new URL('@/assets/cycling.png', import.meta.url).href)
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
  