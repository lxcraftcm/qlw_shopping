package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsProductSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsProductSaleAttrMapper extends Mapper<PmsProductSaleAttr> {
    List<PmsProductSaleAttr> selectAll();
}