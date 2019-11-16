package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PmsProductVertifyRecord;

import java.util.List;

public interface PmsProductVertifyRecordMapper {
    int insert(PmsProductVertifyRecord record);

    List<PmsProductVertifyRecord> selectAll();
}