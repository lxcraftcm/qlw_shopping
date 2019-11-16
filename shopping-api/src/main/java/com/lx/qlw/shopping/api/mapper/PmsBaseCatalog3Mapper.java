package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseCatalog3;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog3Mapper extends Mapper<PmsBaseCatalog3> {
    //int insert(PmsBaseCatalog3 record);

    List<PmsBaseCatalog3> selectAll();
}