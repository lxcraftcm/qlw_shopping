package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsComment;

import java.util.List;

public interface PmsCommentMapper {
    int insert(PmsComment record);

    List<PmsComment> selectAll();
}