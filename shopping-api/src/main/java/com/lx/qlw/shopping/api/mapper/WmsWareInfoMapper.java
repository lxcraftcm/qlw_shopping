package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.WmsWareInfo;

import java.util.List;

public interface WmsWareInfoMapper {
    int insert(WmsWareInfo record);

    List<WmsWareInfo> selectAll();
}