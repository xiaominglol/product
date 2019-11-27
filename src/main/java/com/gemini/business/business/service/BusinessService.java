package com.gemini.business.business.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.business.mapper.BusinessMapper;
import com.gemini.business.business.po.BusinessPo;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
public interface BusinessService extends BaseDetailService<BusinessPo, BusinessPo, BusinessMapper, BusinessMapper> {
}