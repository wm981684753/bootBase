package com.example.myapplication;

import org.springframework.boot.CommandLineRunner;
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
public class Application implements CommandLineRunner {
    private String show;

    @RequestMapping("/")
    String home(){
        return show;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //CommandLineRunner接口，run方法在SpringApplication.run程序启动之前执行
    @Override
    public void run(String... strings) throws Exception {
        this.show = "Hello Applications!";
    }
}
