package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsProductImage;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsProductImageMapper extends Mapper<PmsProductImage> {

    List<PmsProductImage> selectAll();
}