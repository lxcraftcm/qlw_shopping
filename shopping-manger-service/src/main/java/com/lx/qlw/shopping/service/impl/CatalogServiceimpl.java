package com.lx.qlw.shopping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog1;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog2;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog3;
import com.lx.qlw.shopping.api.mapper.PmsBaseAttrInfoMapper;
import com.lx.qlw.shopping.api.mapper.PmsBaseCatalog1Mapper;
import com.lx.qlw.shopping.api.mapper.PmsBaseCatalog2Mapper;
import com.lx.qlw.shopping.api.mapper.PmsBaseCatalog3Mapper;
import com.lx.qlw.shopping.api.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceimpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getAllCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2ByCatalog1Id(String catalog1Id) {
        PmsBaseCatalog2 PmsBaseCatalog2 = new PmsBaseCatalog2();
        PmsBaseCatalog2.setCatalog1Id(Integer.parseInt(catalog1Id));
        return pmsBaseCatalog2Mapper.select(PmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3ByCatalog2Id(String catalog2Id) {
        PmsBaseCatalog3 PmsBaseCatalog3 = new PmsBaseCatalog3();
        PmsBaseCatalog3.setCatalog2Id(Integer.parseInt(catalog2Id));
        return pmsBaseCatalog3Mapper.select(PmsBaseCatalog3);
    }

}
