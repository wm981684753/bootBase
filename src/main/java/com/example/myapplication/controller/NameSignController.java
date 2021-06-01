package com.example.myapplication.controller;


import com.example.myapplication.mapper.auto.NameSignMapper;
import com.example.myapplication.model.auto.NameSign;
import com.example.myapplication.service.INameSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * <p>
 * 前端控制器
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
    private NameSignMapper nameSignMapper;

    @PostMapping("/test")
    public String test() {
        return "test";
    }

    /**
     * 执行编写的自定义XML配置的SQL
     *
     * @return
     */
    @RequestMapping(value = "/nameSignAll", method = RequestMethod.GET)
    public List<NameSign> getUserNameAll() {
        return nameSignService.findAllNameSign();//手动添加的sql
    }

    /***********使用MyBatis-Plus的CRUD方法***************/

    /**
     * 数据插入操作
     *
     * @return
     */
    @PostMapping("/insert")
    public boolean nameInsert() {
        NameSign nameSign = new NameSign();
        nameSign.setName("NAME");
        nameSign.setSign("SIGN");
        return nameSignService.save(nameSign);
    }

    /**
     * 删除操作
     *
     * @return
     */
    @PostMapping("removeById")
    public boolean removeById() {
        return nameSignService.removeById(2);
    }

    /**
     * 修改数据
     *
     * @return
     */
    @PostMapping("updateById")
    public boolean updateById() {
        NameSign nameSign = new NameSign();
        nameSign.setId(1);
        nameSign.setName("NAME1");
        nameSign.setSign("SIGN1");
        return nameSignService.updateById(nameSign);
    }

    /**
     * 查询数据
     * @return
     */
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public NameSign getById(String id) {
        return nameSignService.getById(id);
    }

    @GetMapping("listByIds")
    public Collection<NameSign> listByIds(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("5");
        return nameSignService.listByIds(list);
    }

}
