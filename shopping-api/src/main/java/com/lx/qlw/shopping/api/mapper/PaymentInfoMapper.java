package com.lx.qlw.shopping.api.mapper;

import com.lx.qlw.shopping.api.bean.PaymentInfo;

import java.util.List;

public interface PaymentInfoMapper {

    List<PaymentInfo> selectAll();
}