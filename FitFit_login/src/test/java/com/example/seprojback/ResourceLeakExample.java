package com.example.seprojback;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceLeakExample {
    public static void exec() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line =reader.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {}// forget to close resource
    }
}
