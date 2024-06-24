package com.example.seprojback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.seprojback.entity.SportHistory;
import com.example.seprojback.mapper.FitUserMapper;
import com.example.seprojback.mapper.SportHistoryMapper;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.SportHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SportHistoryServiceImpl implements SportHistoryService {
    @Autowired
    private SportHistoryMapper mapper;
    @Autowired
    private FitUserMapper userMapper;
    @Override
    public List<SportHistory> getSportHistory(int userId){
        LambdaQueryWrapper<SportHistory> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SportHistory::getUserId,userId);
        return mapper.selectList(queryWrapper);
    }
    @Override
    public SportHistory getSingleHistory(int id){
        return mapper.selectById(id);
    }
    @Override
    public ResponseResult addSportHistory(SportHistory history){
        try{
            if(userMapper.selectById(history.getUserId())==null){
                return new ResponseResult(201,"User Not Exists");
            }

            mapper.insert(history);
            return new ResponseResult(200,"Add Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult deleteSportHistory(int id){
        try{
            mapper.deleteById(id);
            return new ResponseResult(200,"Delete Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
}
