package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.WmsWareSku;

import java.util.List;

public interface WmsWareSkuMapper {
    int insert(WmsWareSku record);

    List<WmsWareSku> selectAll();
}