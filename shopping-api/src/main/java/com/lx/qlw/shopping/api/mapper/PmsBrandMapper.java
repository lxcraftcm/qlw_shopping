package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBrand;

import java.util.List;

public interface PmsBrandMapper {
    int insert(PmsBrand record);

    List<PmsBrand> selectAll();
}