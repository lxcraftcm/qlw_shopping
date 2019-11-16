package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.UmsMember;
import com.lx.qlw.shopping.api.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    int insert(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> selectAll();
}