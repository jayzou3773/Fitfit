package com.example.seprojback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.seprojback.entity.Course;
import com.example.seprojback.entity.UserCourse;
import com.example.seprojback.mapper.CourseMapper;
import com.example.seprojback.mapper.UserCourseMapper;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserCourseServiceImpl implements UserCourseService {
    @Autowired
    private UserCourseMapper mapper;
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> getUserCourses(int userId){
        LambdaQueryWrapper<UserCourse> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserCourse::getUserId,userId);
        List<UserCourse> userCourses = mapper.selectList(queryWrapper);
        List<Course> courses = new ArrayList<>();
        for (UserCourse uc : userCourses) {
            courses.add(courseMapper.selectById(uc.getCourseId()));
        }
        return courses;
    }

    @Override
    public ResponseResult addUserCourse(int userId,int courseId){
        try{
            UserCourse userCourse = new UserCourse();
            userCourse.setUserId(userId);
            userCourse.setCourseId(courseId);
            userCourse.setRate(-1);
            mapper.insert(userCourse);
            return new ResponseResult(200,"Add Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult deleteUserCourse(int userId,int courseId){
        try{
            LambdaQueryWrapper<UserCourse> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(UserCourse::getUserId,userId).eq(UserCourse::getCourseId,courseId);
            mapper.delete(queryWrapper);
            return new ResponseResult(200,"Delete Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult rateCourse(int userId,int courseId,int rate){
        try{
            LambdaUpdateWrapper<UserCourse> updateWrapper = new LambdaUpdateWrapper<>();
            updateWrapper.eq(UserCourse::getUserId,userId).eq(UserCourse::getCourseId,courseId);
            updateWrapper.set(UserCourse::getRate,rate);
            mapper.update(updateWrapper);
            return new ResponseResult(200,"Rate Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
}
