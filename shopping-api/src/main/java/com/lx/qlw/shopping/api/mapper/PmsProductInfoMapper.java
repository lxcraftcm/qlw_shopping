package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsProductInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsProductInfoMapper extends Mapper<PmsProductInfo> {

    List<PmsProductInfo> selectAll();
}