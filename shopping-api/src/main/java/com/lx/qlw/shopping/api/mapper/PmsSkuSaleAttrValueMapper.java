package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsSkuInfo;
import com.lx.qlw.shopping.api.bean.PmsSkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsSkuSaleAttrValueMapper extends Mapper<PmsSkuSaleAttrValue> {

    List<PmsSkuSaleAttrValue> selectAll();
}