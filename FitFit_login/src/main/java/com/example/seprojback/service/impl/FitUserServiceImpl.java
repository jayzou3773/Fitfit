package com.example.seprojback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.seprojback.entity.FitUser;
import com.example.seprojback.mapper.FitUserMapper;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.FitUserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitUserServiceImpl implements FitUserService {
    @Autowired
    private FitUserMapper mapper;

    @Override
    public FitUser getUser(int userId){
        return mapper.selectById(userId);
    }

    @Override
    public List<FitUser> getAllUser(){
        return mapper.selectList(new LambdaQueryWrapper<>());
    }

    @Override
    public ResponseResult addUser(FitUser user){
        try{
            mapper.insert(user);
            return new ResponseResult(200,"Add Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult modifyUser(FitUser user){
        try{
            if(mapper.updateById(user) < 0)
                return new ResponseResult(200,"User Not Exists");
            return new ResponseResult(200,"Modify Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult deleteUser(int userId){
        try{
            mapper.deleteById(userId);
            return new ResponseResult(200,"Delete Successfully");
        }
        catch (Exception e){
            return new ResponseResult<>(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult<Boolean> login(FitUser user){
        try{
            String email = user.getEmail();
            String pwd = user.getPassword();
            LambdaQueryWrapper<FitUser> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(FitUser::getEmail,email);
            FitUser realUser = mapper.selectOne(queryWrapper);
            return new ResponseResult<Boolean>(200,realUser.getPassword().equals(pwd));
        }
        catch (Exception e){
            return new ResponseResult<Boolean>(500,e.getMessage(),false);
        }
    }
}
