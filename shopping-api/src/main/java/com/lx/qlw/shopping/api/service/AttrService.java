package com.lx.qlw.shopping.api.service;

import com.lx.qlw.shopping.api.bean.PmsBaseAttrInfo;
import com.lx.qlw.shopping.api.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);

    List<PmsBaseAttrValue> getAttrValueByAttrId(String attrId);

    Boolean deleteAttrValueByAttrInfoId(Long attrInfoId);

    Boolean saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
