package com.example.seprojback.controller;


import com.example.seprojback.model.MailType;
import com.example.seprojback.model.ResponseResult;
import com.example.seprojback.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;


    @PostMapping("/mail/sendMail")
    public ResponseResult sendMail(@RequestBody MailType mailType) {
        try {
            mailService.sendSimpleMail(mailType.getMailBox(), mailType.getSubject(), mailType.getText());
            return new ResponseResult(200, "邮件发送成功");
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult(500, "邮件发送失败\n" + e.getMessage());
        }
    }

    @PostMapping("/mail/verifyCode")
    public ResponseResult sendVerifyCode(@RequestBody MailType mailType) {
        try {
            Integer code = mailService.sendVerificationCode(mailType.getMailBox());
            return new ResponseResult(200, "验证码发送成功", code);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult(500, "验证码发送失败\n" + e.getMessage());
        }
    }

}
