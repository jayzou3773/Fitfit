package com.example.seprojback.controller;

import com.example.seprojback.entity.FitUser;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.FitUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FitUserController {
    @Autowired
    FitUserService fitUserService;
    @GetMapping("/user")
    public FitUser GetUser(@RequestParam int userId){
        return fitUserService.getUser(userId);
    }
    @GetMapping("/user/all")
    public List<FitUser> getAllUser(){
        return fitUserService.getAllUser();
    }
    @PostMapping("/user/register")
    public ResponseResult userRegister(@RequestBody FitUser user){
        return fitUserService.addUser(user);
    }
    @PutMapping("/user/update")
    public ResponseResult userUpdate(@RequestBody FitUser user){
        return fitUserService.modifyUser(user);
    }
    @PostMapping("/user/login")
    public ResponseResult<Boolean> login(@RequestBody FitUser user){
        return fitUserService.login(user);
    }
}
