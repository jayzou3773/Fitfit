package com.example.seprojback.utils;

import java.util.Random;

public class VerifyCodeGenerator {
    public static Integer genCode() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }
}
