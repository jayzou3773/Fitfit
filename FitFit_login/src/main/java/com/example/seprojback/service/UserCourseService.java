package com.example.seprojback.service;

import com.example.seprojback.entity.Course;
import com.example.seprojback.entity.UserCourse;
import com.example.seprojback.model.ResponseResult;

import java.util.List;

public interface UserCourseService {
    List<Course> getUserCourses(int userId);
    ResponseResult addUserCourse(int userId,int courseId);
    ResponseResult deleteUserCourse(int userId,int courseId);
    ResponseResult rateCourse(int userId,int courseId,int rate);
}
