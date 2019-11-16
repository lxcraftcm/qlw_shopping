package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.UmsMember;
import com.lx.qlw.shopping.api.bean.UmsMemberLevel;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface UmsMemberMapper extends Mapper<UmsMember> {
    int insert(UmsMember record);

    List<UmsMember> selectAll();
}