package com.example.myapplication.service;

import com.example.myapplication.model.auto.NameSign;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-01
 */
public interface INameSignService extends IService<NameSign> {

    public List<NameSign> findAllNameSign();

}
