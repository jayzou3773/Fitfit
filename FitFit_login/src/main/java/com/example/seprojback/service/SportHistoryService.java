package com.example.seprojback.service;

import com.example.seprojback.entity.SportHistory;
import com.example.seprojback.entity.SportTips;
import com.example.seprojback.model.ResponseResult;

import java.util.List;

public interface SportHistoryService {
    List<SportHistory> getSportHistory(int userId);
    SportHistory getSingleHistory(int id);
    ResponseResult addSportHistory(SportHistory history);
    ResponseResult deleteSportHistory(int id);
}
