package com.example.seprojback.service;

public interface MailService {

    public void sendSimpleMail(String to, String subject, String text);

    public Integer sendVerificationCode(String to);
}
