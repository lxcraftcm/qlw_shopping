package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseSaleAttrMapper extends Mapper<PmsBaseSaleAttr> {

    List<PmsBaseSaleAttr> selectAll();
}