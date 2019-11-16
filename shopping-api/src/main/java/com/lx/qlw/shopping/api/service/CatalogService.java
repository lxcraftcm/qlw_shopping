package com.lx.qlw.shopping.api.service;

import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog1;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog2;
import com.lx.qlw.shopping.api.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1>  getAllCatalog1();

    List<PmsBaseCatalog2> getCatalog2ByCatalog1Id(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3ByCatalog2Id(String catalog2Id);

}
