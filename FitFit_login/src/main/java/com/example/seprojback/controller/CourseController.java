package com.example.seprojback.controller;

import com.example.seprojback.entity.Course;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.CourseService;
import com.example.seprojback.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    UserCourseService userCourseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping("/course")
    public Course getSingleCourse(@RequestParam int courseId){
        return courseService.getCourse(courseId);
    }
    @PostMapping("/course")
    public ResponseResult addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @PutMapping("/course")
    public ResponseResult updateCourse(@RequestBody Course course){
        return courseService.modifyCourse(course);
    }
    @GetMapping("/user/courses")
    public List<Course> getUserCourses(@RequestParam int userId){
        return userCourseService.getUserCourses(userId);
    }
    @PostMapping("/user/courses")
    public ResponseResult selectCourse(@RequestParam int userId,@RequestParam int courseId){
        return userCourseService.addUserCourse(userId,courseId);
    }
    @DeleteMapping("/user/courses")
    public ResponseResult abondonCourse(@RequestParam int userId,@RequestParam int courseId){
        return userCourseService.deleteUserCourse(userId,courseId);
    }
    @PutMapping("/user/courses")
    public ResponseResult rateCourse(@RequestParam int userId,@RequestParam int courseId,@RequestParam int rate){
        return userCourseService.rateCourse(userId,courseId,rate);
    }
}
