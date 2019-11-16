package com.lx.qlw.shopping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.qlw.shopping.api.bean.*;
import com.lx.qlw.shopping.api.mapper.*;
import com.lx.qlw.shopping.api.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpuServiceimpl implements SpuService {

    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Autowired
    PmsProductImageMapper pmsProductImageMapper;

    @Autowired
    PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Autowired
    PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

    @Override
    public List<PmsProductInfo> getSpuListByCatalog3Id(String catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        return pmsProductInfoMapper.select(pmsProductInfo);
    }

    @Override
    public List<PmsBaseSaleAttr> getAllBaseSaleAttrList() {

        return pmsBaseSaleAttrMapper.selectAll();
    }

    @Override
    public boolean savePmsProductSaleAttr(PmsProductSaleAttr pmsProductSaleAttr) {
        if (pmsProductSaleAttr.getId() == null) {
            //作新增操作
            pmsProductSaleAttrMapper.insert(pmsProductSaleAttr);
            for (PmsProductSaleAttrValue pmsProductSaleAttrValue : pmsProductSaleAttr.getSpuSaleAttrValueList()) {
                pmsProductSaleAttrValue.setProductId(pmsProductSaleAttr.getProductId());
                pmsProductSaleAttrValue.setSaleAttrId(pmsProductSaleAttr.getSaleAttrId());
                savePmsProductSaleAttrValue(pmsProductSaleAttrValue);
            }
        } else {
            //作修改操作
        }

        return false;
    }

    @Override
    public boolean savePmsProductSaleAttrValue(PmsProductSaleAttrValue pmsProductSaleAttrValue) {
        pmsProductSaleAttrValueMapper.insert(pmsProductSaleAttrValue);
        return true;
    }

    @Override
    public boolean savePmsProductImage(PmsProductImage pmsProductImage) {
        pmsProductImageMapper.insert(pmsProductImage);
        return true;
    }

    @Override
    public List<PmsProductSaleAttrValue> getPmsProductSaleAttrValueByProductIdAndAttrId(String productId, String AttrId) {
        PmsProductSaleAttrValue pmsProductSaleAttrValue = new PmsProductSaleAttrValue();
        pmsProductSaleAttrValue.setProductId(Long.parseLong(productId));
        pmsProductSaleAttrValue.setSaleAttrId(Long.parseLong(AttrId));
        return pmsProductSaleAttrValueMapper.select(pmsProductSaleAttrValue);
    }

    @Override
    public List<PmsProductSaleAttr> getPmsProductSaleAttrByProductId(String productId) {
        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
        pmsProductSaleAttr.setProductId(Long.parseLong(productId));
        List<PmsProductSaleAttr> pmsProductSaleAttrs = pmsProductSaleAttrMapper.select(pmsProductSaleAttr);
        for (PmsProductSaleAttr productSaleAttr : pmsProductSaleAttrs) {
            List<PmsProductSaleAttrValue> pmsProductSaleAttrValues = getPmsProductSaleAttrValueByProductIdAndAttrId(productId, productSaleAttr.getSaleAttrId() + "");
            productSaleAttr.setSpuSaleAttrValueList(pmsProductSaleAttrValues);
        }
        return pmsProductSaleAttrs;
    }

    @Override
    public boolean savePmsProductInfo(PmsProductInfo pmsProductInfo) {
        if (pmsProductInfo.getId() == null) {
            //作新增操作
            pmsProductInfoMapper.insert(pmsProductInfo);
            //保存图片
            for (PmsProductImage pmsProductImage : pmsProductInfo.getSpuImageList()) {
                pmsProductImage.setProductId(pmsProductInfo.getId());
                savePmsProductImage(pmsProductImage);
            }
            //保存ProductSaleAttr
            for (PmsProductSaleAttr pmsProductSaleAttr : pmsProductInfo.getSpuSaleAttrList()) {
                pmsProductSaleAttr.setProductId(pmsProductInfo.getId());
                savePmsProductSaleAttr(pmsProductSaleAttr);
            }

        } else {
            //作修改操作
        }
        return true;
    }

    @Override
    public List<PmsProductImage> getPmsProductImageByProductId(String spuId) {
        PmsProductImage pmsProductImage = new PmsProductImage();
        pmsProductImage.setProductId(Long.parseLong(spuId));
        return pmsProductImageMapper.select(pmsProductImage);
    }

}
