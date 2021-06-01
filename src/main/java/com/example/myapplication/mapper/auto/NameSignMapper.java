package com.example.myapplication.mapper.auto;

import com.example.myapplication.model.auto.NameSign;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-01
 */
public interface NameSignMapper extends BaseMapper<NameSign> {

    public List<NameSign> findAllNameSign();

}
