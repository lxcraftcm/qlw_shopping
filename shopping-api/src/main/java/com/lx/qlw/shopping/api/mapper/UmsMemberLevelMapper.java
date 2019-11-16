package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseCatalog1;
import com.lx.qlw.shopping.api.bean.UmsMemberLevel;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface UmsMemberLevelMapper extends Mapper<UmsMemberLevel> {
    int insert(UmsMemberLevel record);

    List<UmsMemberLevel> selectAll();
}