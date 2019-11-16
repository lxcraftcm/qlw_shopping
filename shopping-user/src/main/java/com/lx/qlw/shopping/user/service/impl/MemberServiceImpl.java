package com.lx.qlw.shopping.user.service.impl;

import com.lx.qlw.shopping.api.bean.UmsMember;
import com.lx.qlw.shopping.api.service.MemberService;
import com.lx.qlw.shopping.api.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
