package com.lx.qlw.shopping.api.service;

import com.lx.qlw.shopping.api.bean.*;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> getSpuListByCatalog3Id(String catalog3Id);

    List<PmsBaseSaleAttr> getAllBaseSaleAttrList();

    boolean savePmsProductInfo(PmsProductInfo pmsProductInfo);

    boolean savePmsProductSaleAttr(PmsProductSaleAttr pmsProductSaleAttr);

    boolean savePmsProductSaleAttrValue(PmsProductSaleAttrValue pmsProductSaleAttrValue);

    boolean savePmsProductImage(PmsProductImage pmsProductImage);

    List<PmsProductSaleAttrValue> getPmsProductSaleAttrValueByProductIdAndAttrId(String productId, String AttrId);

    List<PmsProductSaleAttr> getPmsProductSaleAttrByProductId(String productId);

    List<PmsProductImage> getPmsProductImageByProductId(String spuId);
}
