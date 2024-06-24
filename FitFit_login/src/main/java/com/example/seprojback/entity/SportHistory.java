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
@TableName("sport_history")
public class SportHistory {
    @TableId
    private int id;
    private Date startTime;
    private Date endTime;
    private int userId;
    private String fitType;
    private int rate;
}
