package com.example.seprojback;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnhandledExceptionExample {
    public static void exec() {
        int result = divide(10, 0);
        int result2 = 10 / 0;
        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);
    }
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
