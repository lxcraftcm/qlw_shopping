package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsCommentReplay;

import java.util.List;

public interface PmsCommentReplayMapper {
    int insert(PmsCommentReplay record);

    List<PmsCommentReplay> selectAll();
}