package com.gemini.business.customer.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.customer.mapper.CustomerAddressMapper;
import com.gemini.business.customer.po.CustomerAddressPo;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
public interface CustomerAddressService extends BaseDetailService<CustomerAddressPo, CustomerAddressPo, CustomerAddressMapper, CustomerAddressMapper> {
}