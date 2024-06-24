package com.example.seprojback.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value = "sys_user_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole {
    @TableId
    private String userId;
    private Integer roleId;
}
