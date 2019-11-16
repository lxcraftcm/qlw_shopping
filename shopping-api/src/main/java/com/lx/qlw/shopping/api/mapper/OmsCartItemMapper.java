package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.OmsCartItem;

import java.util.List;

public interface OmsCartItemMapper {
    int insert(OmsCartItem record);

    List<OmsCartItem> selectAll();
}