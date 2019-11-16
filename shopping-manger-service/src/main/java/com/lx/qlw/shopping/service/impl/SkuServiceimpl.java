package com.lx.qlw.shopping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.qlw.shopping.api.bean.PmsSkuAttrValue;
import com.lx.qlw.shopping.api.bean.PmsSkuImage;
import com.lx.qlw.shopping.api.bean.PmsSkuInfo;
import com.lx.qlw.shopping.api.bean.PmsSkuSaleAttrValue;
import com.lx.qlw.shopping.api.mapper.PmsSkuAttrValueMapper;
import com.lx.qlw.shopping.api.mapper.PmsSkuImageMapper;
import com.lx.qlw.shopping.api.mapper.PmsSkuInfoMapper;
import com.lx.qlw.shopping.api.mapper.PmsSkuSaleAttrValueMapper;
import com.lx.qlw.shopping.api.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SkuServiceimpl implements SkuService {

    @Autowired
    PmsSkuInfoMapper pmsSkuInfoMapper;

    @Autowired
    PmsSkuImageMapper pmsSkuImageMapper;

    @Autowired
    PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

    @Autowired
    PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    @Override
    public boolean saveSkuInfo(PmsSkuInfo pmsSkuInfo) {
        if(pmsSkuInfo.getId()==null){
            //作新增操作
            //插入sku信息
            pmsSkuInfoMapper.insert(pmsSkuInfo);
            Long skuId = pmsSkuInfo.getId();
            //插入sku图片信息
            for (PmsSkuImage pmsSkuImage : pmsSkuInfo.getSkuImageList()) {
                pmsSkuImage.setSkuId(skuId);
                pmsSkuImage.setProductImgId(pmsSkuImage.getSpuImgId());
                pmsSkuImageMapper.insert(pmsSkuImage);
            }
            //插入商品平台属性信息
            for (PmsSkuAttrValue pmsSkuAttrValue : pmsSkuInfo.getSkuAttrValueList()) {
                pmsSkuAttrValue.setSkuId(skuId);
                pmsSkuAttrValueMapper.insert(pmsSkuAttrValue);
            }
            //插入商品自定义属性信息
            for (PmsSkuSaleAttrValue pmsSkuSaleAttrValue : pmsSkuInfo.getSkuSaleAttrValueList()) {
                pmsSkuSaleAttrValue.setSkuId(skuId);
                pmsSkuSaleAttrValueMapper.insert(pmsSkuSaleAttrValue);
            }
        }else{
            //作修改操作
        }

        return true;
    }
}
