package com.example.seprojback.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class FitUser{
    @TableId
    private int userId;
    private String email;
    private String gender;
    private String password;
    private String realName;
    private int totalDuration;
    private int totalTimeFit;
    private int totalTimeClass;
}