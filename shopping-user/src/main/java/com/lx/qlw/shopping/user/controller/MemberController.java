package com.lx.qlw.shopping.user.controller;

import com.lx.qlw.shopping.api.service.MemberService;
import com.lx.qlw.shopping.api.bean.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    com.lx.qlw.shopping.api.service.MemberService MemberService;

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
