package com.example.seprojback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.seprojback.entity.Course;
import com.example.seprojback.mapper.CourseMapper;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper mapper;

    @Override
    public Course getCourse(int id) {
        try{
            return mapper.selectById(id);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Course> getAllCourses(){
        return mapper.selectList(new LambdaQueryWrapper<>());
    }

    @Override
    public ResponseResult addCourse(Course course){
        try{
            mapper.insert(course);
            return new ResponseResult<>(200,"Add Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }

    @Override
    public ResponseResult modifyCourse(Course course){
        try{
            mapper.updateById(course);
            return new ResponseResult<>(200,"Modify Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }

    @Override
    public ResponseResult deleteCourse(int courseId){
        try{
            mapper.deleteById(courseId);
            return new ResponseResult<>(200,"Delete Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
}
