package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseCatalog1;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface PmsBaseCatalog1Mapper extends Mapper<PmsBaseCatalog1> {
    //int insert(PmsBaseCatalog1 record);

    List<PmsBaseCatalog1> selectAll();
}