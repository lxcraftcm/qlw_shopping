package com.lx.qlw.shopping.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.qlw.shopping.api.bean.PmsSkuInfo;
import com.lx.qlw.shopping.api.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class SkuController {

    @Reference
    SkuService skuService;

    @RequestMapping("saveSkuInfo")
    @ResponseBody
    public String saveSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo) {
        pmsSkuInfo.setProductId(pmsSkuInfo.getSpuId());
        if (pmsSkuInfo.getSkuDefaultImg() == null) {
            String defimage = pmsSkuInfo.getSkuImageList().get(0).getImgUrl();
            pmsSkuInfo.setSkuDefaultImg(defimage);
            pmsSkuInfo.getSkuImageList().get(0).setIsDefault("1");
        }
        if (skuService.saveSkuInfo(pmsSkuInfo)) {
            return "success";
        } else {
            return null;
        }

    }
}
