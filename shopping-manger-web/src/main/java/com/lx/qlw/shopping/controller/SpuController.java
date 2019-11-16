package com.lx.qlw.shopping.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.qlw.shopping.api.bean.PmsBaseSaleAttr;
import com.lx.qlw.shopping.api.bean.PmsProductImage;
import com.lx.qlw.shopping.api.bean.PmsProductInfo;
import com.lx.qlw.shopping.api.bean.PmsProductSaleAttr;
import com.lx.qlw.shopping.api.service.SpuService;
import com.lx.qlw.shopping.util.FileUploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(@RequestParam(value = "catalog3Id") String catalog3Id) {
        return spuService.getSpuListByCatalog3Id(catalog3Id);
    }

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return spuService.getAllBaseSaleAttrList();
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile MultipartFile) {
        String url = "";
        //System.out.println("SpuController.saveSpuInfo");
        try {
            byte[] image = MultipartFile.getBytes();
            url = FileUploadUtil.uploadImage(image, MultipartFile.getOriginalFilename());
            // System.out.println("url: " + url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {
        //System.out.println("SpuController.saveSpuInfo");
        if (spuService.savePmsProductInfo(pmsProductInfo)) {
            return "success";
        } else {
            return "file";
        }

    }

    @RequestMapping("spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId) {
        return spuService.getPmsProductSaleAttrByProductId(spuId);
    }

    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId) {
        return spuService.getPmsProductImageByProductId(spuId);
    }
}
