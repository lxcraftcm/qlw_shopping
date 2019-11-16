package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseCatalog1;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog2;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface PmsBaseCatalog2Mapper extends Mapper<PmsBaseCatalog2> {
    //int insert(PmsBaseCatalog2 record);

    List<PmsBaseCatalog2> selectAll();
}