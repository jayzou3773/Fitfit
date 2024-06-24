package com.example.seprojback.service;

import com.example.seprojback.entity.SportTips;
import com.example.seprojback.model.ResponseResult;

import java.util.List;

public interface SportTipsService {
    List<SportTips> getSportTips();
    List<SportTips> getSportTipsByType(String type);

    SportTips getSportTip(int id);

    ResponseResult addSportTip(SportTips tip);

    ResponseResult modifySportTip(SportTips tip);
    ResponseResult deleteSportTip(int id);
}
