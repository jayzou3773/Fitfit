package com.example.seprojback.controller;

import com.example.seprojback.entity.SportTips;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.SportTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportTipsController {
    @Autowired
    SportTipsService sportTipsService;
    @GetMapping("/tips")
    public List<SportTips> getTips(@RequestParam String type){
        if(type==null || type.isEmpty()){
            return sportTipsService.getSportTips();
        }
        else{
            return sportTipsService.getSportTipsByType(type);
        }
    }
    @GetMapping("/tip")
    public SportTips getSingleTip(@RequestParam int id){
        return sportTipsService.getSportTip(id);
    }
    @PostMapping("/tip")
    public ResponseResult addTips(@RequestBody SportTips tip){
        return sportTipsService.addSportTip(tip);
    }
    @PutMapping("/tip")
    public ResponseResult updateTip(@RequestBody SportTips tip){
        return sportTipsService.modifySportTip(tip);
    }
    @DeleteMapping("tip")
    public ResponseResult deleteTip(@RequestParam int id){
        return sportTipsService.deleteSportTip(id);
    }
}
