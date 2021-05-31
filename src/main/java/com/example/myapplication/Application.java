package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication//SpringBootApplication等同于以下三个注解
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@RestController
public class Application {

    @RequestMapping("/")
    String home(){
        return "Hello Application!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
