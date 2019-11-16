package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsSkuImage;
import com.lx.qlw.shopping.api.bean.PmsSkuInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsSkuInfoMapper extends Mapper<PmsSkuInfo> {

    List<PmsSkuInfo> selectAll();
}