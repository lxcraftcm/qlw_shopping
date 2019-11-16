package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.OmsOrder;

import java.util.List;

public interface OmsOrderMapper {
    int insert(OmsOrder record);

    List<OmsOrder> selectAll();
}