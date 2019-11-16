package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.OmsOrderItem;

import java.util.List;

public interface OmsOrderItemMapper {
    int insert(OmsOrderItem record);

    List<OmsOrderItem> selectAll();
}