package com.example.seprojback.service;


import com.example.seprojback.entity.Course;
import com.example.seprojback.model.ResponseResult;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseService {
    Course getCourse(int id);

    List<Course> getAllCourses();

    ResponseResult addCourse(Course course);
    ResponseResult modifyCourse(Course course);
    ResponseResult deleteCourse(int courseId);
}
