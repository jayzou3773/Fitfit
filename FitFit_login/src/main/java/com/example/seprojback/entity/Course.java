package com.example.seprojback.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("course")
public class Course {
    @TableId
    private int courseId;
    private Date startTime;
    private Date endTime;
    private String classType;
    private String classContent;
}
