import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginView from "@/views/LoginView.vue";
import SignUpView from "@/views/SignUpView.vue";
import CourseView from '@/views/CourseView.vue';
import TweetsView from "@/views/TweetsView.vue";
import CameraView from "@/views/CameraView.vue";
import FitnessChart from '@/components/dataVis.vue'
import DataView from "@/views/DataView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
      //首页
    {
      path:"/",
      name:'home',
      component:HomeView,
      meta: { requiresAuth: false }
    },
    //课程报名
    {
      path:"/course",
      name:'course',
      component:CourseView,
      meta: { requiresAuth: false }
    },
    {
      path: '/Tweets',
      name: 'tweets',
      component: TweetsView,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    //登录页面
    {
      // path:'/login',
      path: "/login",
      name: 'LogInView',
      component: LoginView,
      meta: { requiresAuth: false }
    },
    //注册页面
    {
      path: '/SignUp',
      name: 'SignUpView',
      component: SignUpView,
      meta: { requiresAuth: false }
    },
    //相机页面
    {
      path: '/camera',
      name: 'CameraView',
      component: CameraView,
      meta: { requiresAuth: false }
    },
    //数据页面
    {
      path:'/data',
      name:'dataVis',
      component:DataView,
      meta: { requiresAuth: false }
    }
  ]
})

export default router
