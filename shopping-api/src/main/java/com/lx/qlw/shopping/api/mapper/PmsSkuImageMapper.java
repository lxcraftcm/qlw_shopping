package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsSkuImage;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsSkuImageMapper extends Mapper<PmsSkuImage> {

    List<PmsSkuImage> selectAll();
}