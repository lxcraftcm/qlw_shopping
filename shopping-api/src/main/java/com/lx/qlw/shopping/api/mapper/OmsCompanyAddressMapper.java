package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.OmsCompanyAddress;

import java.util.List;

public interface OmsCompanyAddressMapper {
    int insert(OmsCompanyAddress record);

    List<OmsCompanyAddress> selectAll();
}