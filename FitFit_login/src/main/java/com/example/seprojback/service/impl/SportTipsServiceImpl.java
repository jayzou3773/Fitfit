package com.example.seprojback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.seprojback.entity.SportTips;
import com.example.seprojback.mapper.SportTipsMapper;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.SportTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportTipsServiceImpl implements SportTipsService {
    @Autowired
    private SportTipsMapper mapper;

    @Override
    public List<SportTips> getSportTips(){
        return mapper.selectList(new LambdaQueryWrapper<>());
    }

    @Override
    public List<SportTips> getSportTipsByType(String type){
        LambdaQueryWrapper<SportTips> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SportTips::getFitType,type);
        return mapper.selectList(queryWrapper);
    }

    @Override
    public SportTips getSportTip(int id){
        return mapper.selectById(id);
    }

    @Override
    public ResponseResult addSportTip(SportTips tip){
        try{
            mapper.insert(tip);
            return new ResponseResult(200,"Add Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }

    @Override
    public ResponseResult modifySportTip(SportTips tip){
        try{
            mapper.updateById(tip);
            return new ResponseResult(200,"Modify Successfully");
        }
        catch(Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
    @Override
    public ResponseResult deleteSportTip(int id){
        try{
            mapper.deleteById(id);
            return new ResponseResult(200,"Delete Successfully");
        }
        catch (Exception e){
            return new ResponseResult(500,e.getMessage());
        }
    }
}
