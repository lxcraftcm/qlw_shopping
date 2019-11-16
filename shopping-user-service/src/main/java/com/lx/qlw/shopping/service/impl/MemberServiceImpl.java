package com.lx.qlw.shopping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.qlw.shopping.api.bean.UmsMember;
import com.lx.qlw.shopping.api.mapper.UmsMemberMapper;
import com.lx.qlw.shopping.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllMember() {
        return umsMemberMapper.selectAllMember();
        //return umsMemberMapper.selectAll();
    }
}
