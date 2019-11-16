package com.lx.qlw.shopping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrValue;
import com.lx.qlw.shopping.api.mapper.PmsBaseAttrInfoMapper;
import com.lx.qlw.shopping.api.mapper.PmsBaseAttrValueMapper;
import com.lx.qlw.shopping.api.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceimpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        for (PmsBaseAttrInfo baseAttrInfo : pmsBaseAttrInfos) {
            baseAttrInfo.setAttrValueList(getAttrValueByAttrId(baseAttrInfo.getId()+""));
        }
        return pmsBaseAttrInfos;
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueByAttrId(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(Long.parseLong(attrId));
        return pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
    }

    @Override
    public Boolean deleteAttrValueByAttrInfoId(Long attrInfoId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrInfoId);
        pmsBaseAttrValueMapper.delete(pmsBaseAttrValue);
        return true;
    }

    @Override
    public Boolean saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        try {
            if (pmsBaseAttrInfo.getId() == null) {
                //作添加操作
                int res = pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            } else {
                //作修改操作
                //pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
                pmsBaseAttrInfoMapper.updateByPrimaryKeySelective(pmsBaseAttrInfo);
            }
            deleteAttrValueByAttrInfoId(pmsBaseAttrInfo.getId());
            List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrValues) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insert(pmsBaseAttrValue);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
        return true;
    }
}
