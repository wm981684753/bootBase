package com.example.myapplication.service.impl;

import com.example.myapplication.model.auto.NameSign;
import com.example.myapplication.mapper.auto.NameSignMapper;
import com.example.myapplication.service.INameSignService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-01
 */
@Service
public class NameSignServiceImpl extends ServiceImpl<NameSignMapper, NameSign> implements INameSignService {

    @Autowired
    private NameSignMapper nameSignMapper;

    @Override
    public List<NameSign> findAllNameSign() {
        return nameSignMapper.findAllNameSign();
    }

}
