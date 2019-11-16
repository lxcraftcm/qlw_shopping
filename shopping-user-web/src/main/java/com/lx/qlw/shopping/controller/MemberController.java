package com.lx.qlw.shopping.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.qlw.shopping.api.bean.UmsMember;
import com.lx.qlw.shopping.api.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    @Reference
    MemberService MemberService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "Hello user";

    }

    @RequestMapping("getAllMember")
    @ResponseBody
    public List<UmsMember> getAllMember() {
        List<UmsMember> UmsMembers = MemberService.getAllMember();
        return UmsMembers;
    }
}
