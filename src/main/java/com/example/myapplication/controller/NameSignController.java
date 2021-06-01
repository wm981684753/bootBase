package com.example.myapplication.controller;


import com.example.myapplication.model.auto.NameSign;
import com.example.myapplication.service.INameSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-01
 */
@RestController
@RequestMapping("/name-sign")
public class NameSignController {
    @Autowired
    private INameSignService nameSignService;

    @RequestMapping(value = "/nameSign",method = RequestMethod.GET)
    public NameSign getUserName(){
        return nameSignService.getById(3);
    }

    @RequestMapping(value = "/nameSignAll",method = RequestMethod.GET)
    public List<NameSign> getUserNameAll(){
        return nameSignService.findAllNameSign();//手动添加的sql
    }

    @PostMapping("/test")
    public String test(){
        return "test";
    }
}
