package com.lx.qlw.shopping.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrValue;
import com.lx.qlw.shopping.api.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(@RequestParam(value = "catalog3Id") String catalog3Id) {
        List<PmsBaseAttrInfo> PmsBaseAttrInfos = attrService.getAttrInfoList(catalog3Id);
        return PmsBaseAttrInfos;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(@RequestParam(value = "attrId") String attrId) {
        return attrService.getAttrValueByAttrId(attrId);
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        if(attrService.saveAttrInfo(pmsBaseAttrInfo)){
            return "success";
        }else{
            return "file";
        }
        //System.out.println("AttrController.saveAttrInfo");
    }
}
