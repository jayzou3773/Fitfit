package com.example.seprojback.service.impl;

import com.example.seprojback.service.MailService;
import com.example.seprojback.utils.VerifyCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleMail(String to, String subject, String text) {
        try {
            //创建简单的邮件发送对象
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("1228937201@qq.com");   // 设置发件人邮箱（若配置默认邮箱则不用再设置）
            message.setTo(to);                      // 设置收件人邮箱
            message.setSubject(subject);            // 设置邮件主题
            message.setText(text);                  // 设置邮件文本内容
            message.setSentDate(new Date());        // 设置邮件发送时间
            //发送
            mailSender.send(message);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Integer sendVerificationCode(String to) {
        Integer code = VerifyCodeGenerator.genCode();

        String subject = "FITFIT：验证码";
        String text = "FITFIT：\n您的验证码为： " + code + " ，请勿转发给任何人，如果不是本人操作，请忽略本邮件。";

        sendSimpleMail(to, subject, text);

        return code;
    }
}
