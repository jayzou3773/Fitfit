package com.example.seprojback.controller;

import com.example.seprojback.entity.SportHistory;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.SportHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportHistoryController {
    @Autowired
    SportHistoryService sportHistoryService;
    @GetMapping("user/history")
    public List<SportHistory> GetUserHistory(@RequestParam int userId){
        return sportHistoryService.getSportHistory(userId);
    }
    @GetMapping("/history")
    public SportHistory GetSingleHistory(@RequestParam int id){
        return sportHistoryService.getSingleHistory(id);
    }
    @PostMapping("/history")
    public ResponseResult addHistory(@RequestBody SportHistory history){
        return sportHistoryService.addSportHistory(history);
    }
    @DeleteMapping("history")
    public  ResponseResult deleteHistory(@RequestParam int id){
        return sportHistoryService.deleteSportHistory(id);
    }
}
