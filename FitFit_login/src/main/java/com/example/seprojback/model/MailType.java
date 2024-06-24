package com.example.seprojback.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailType {
    private String mailBox;
    private String subject;
    private String text;
}
