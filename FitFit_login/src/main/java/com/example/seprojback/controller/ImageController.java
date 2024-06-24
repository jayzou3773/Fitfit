package com.example.seprojback.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ImageController {
    // 注入配置中图片保存路径
    @Value("${user.filepath}")
    private String filePath;

    private final String baseUrl = "http://localhost:8080/pics/";

    // 处理上传图片请求的方法
    // @RequestPart("pic")MultipartFile 上传文件时携带图片的key定义为pic
    @PostMapping(value = "/images",consumes = "multipart/form-data")
    public String upload(@RequestPart("file") MultipartFile multipartFile){

        // 生成一个随机的名称，避免文件名重复
        UUID uuid = UUID.randomUUID();
        // 获取原文件名称
        String originalFileName = multipartFile.getOriginalFilename();
        // 获取原文件的后缀
        String fileSuffix = originalFileName.substring(originalFileName.lastIndexOf('.'));
        // 保存文件
        File file = new File(filePath + uuid + fileSuffix);
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        // 返回图片的完整访问路径，这地方ip和端口可以改为动态获得，这样在部署到服务器上时无需改变，为了方便起见这里直接写死了
        return baseUrl+uuid+fileSuffix;
    }
}
