package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseAttrValueMapper extends Mapper<PmsBaseAttrValue> {

    List<PmsBaseAttrValue> selectAll();
}