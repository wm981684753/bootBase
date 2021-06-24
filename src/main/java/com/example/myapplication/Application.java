package com.example.myapplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication//SpringBootApplication等同于以下三个注解
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@RestController
@MapperScan("com.example.myapplication.mapper")//找到mapper文件
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1440)  //过期时间
public class Application implements CommandLineRunner {
    private String show;

    @RequestMapping("/home")
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
