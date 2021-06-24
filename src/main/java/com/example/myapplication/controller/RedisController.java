package com.example.myapplication.controller;

import com.example.myapplication.conf.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//redis操作类
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisUtils redisUtils;

    /**
     * 插入缓存数据
     */
    @PostMapping("/set")
    public boolean set() {
        return redisUtils.set("redis_key", "redis_vale");
    }

    /**
     * 读取缓存数据
     */
    @PostMapping("/get")
    public String get() {
        String value = redisUtils.get("redis_key");
        return value;
    }
}
