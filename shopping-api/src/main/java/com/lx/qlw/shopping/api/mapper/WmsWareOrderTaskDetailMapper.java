package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.WmsWareOrderTaskDetail;

import java.util.List;

public interface WmsWareOrderTaskDetailMapper {
    int insert(WmsWareOrderTaskDetail record);

    List<WmsWareOrderTaskDetail> selectAll();
}