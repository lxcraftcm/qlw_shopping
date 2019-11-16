package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsSkuAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsSkuAttrValueMapper extends Mapper<PmsSkuAttrValue> {

    List<PmsSkuAttrValue> selectAll();
}