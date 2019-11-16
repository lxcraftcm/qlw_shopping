package com.lx.qlw.shopping.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.qlw.shopping.api.bean.*;
import com.lx.qlw.shopping.api.service.AttrService;
import com.lx.qlw.shopping.api.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.getAllCatalog1();
        return pmsBaseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(@RequestParam(value = "catalog1Id") String catalog1Id) {
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catalogService.getCatalog2ByCatalog1Id(catalog1Id);
        return pmsBaseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(@RequestParam(value = "catalog2Id") String catalog2Id) {
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catalogService.getCatalog3ByCatalog2Id(catalog2Id);
        return pmsBaseCatalog3s;
    }

}
