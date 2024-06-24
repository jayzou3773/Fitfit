package com.example.seprojback.service;

import com.example.seprojback.entity.FitUser;
import com.example.seprojback.model.ResponseResult;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FitUserService {
    FitUser getUser(int userId);
    List<FitUser> getAllUser();
    ResponseResult addUser(FitUser user);

    ResponseResult modifyUser(FitUser user);

    ResponseResult deleteUser(int userId);

    ResponseResult<Boolean> login(FitUser user);
}
