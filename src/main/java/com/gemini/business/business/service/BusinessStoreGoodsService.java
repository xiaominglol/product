package com.gemini.business.business.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.business.mapper.BusinessStoreGoodsMapper;
import com.gemini.business.business.po.BusinessStoreGoodsPo;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
public interface BusinessStoreGoodsService extends BaseDetailService<BusinessStoreGoodsPo, BusinessStoreGoodsPo, BusinessStoreGoodsMapper, BusinessStoreGoodsMapper> {
}