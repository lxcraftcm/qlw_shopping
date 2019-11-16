package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsProductSaleAttr;
import com.lx.qlw.shopping.api.bean.PmsProductSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsProductSaleAttrValueMapper extends Mapper<PmsProductSaleAttrValue> {

    List<PmsProductSaleAttrValue> selectAll();
}