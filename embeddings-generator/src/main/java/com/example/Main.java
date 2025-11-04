package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
    }
}