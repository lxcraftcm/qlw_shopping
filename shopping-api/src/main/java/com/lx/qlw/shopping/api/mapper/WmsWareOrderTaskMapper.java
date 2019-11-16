package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.WmsWareOrderTask;

import java.util.List;

public interface WmsWareOrderTaskMapper {
    int insert(WmsWareOrderTask record);

    List<WmsWareOrderTask> selectAll();
}