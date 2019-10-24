package com.gemini.business.customer.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.business.common.service.BaseDetailServiceImpl;
import com.gemini.business.customer.mapper.CustomerAddressMapper;
import com.gemini.business.customer.po.CustomerAddressPo;
import com.gemini.business.customer.service.CustomerAddressService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class CustomerAddressServiceImpl extends BaseDetailServiceImpl<CustomerAddressPo, CustomerAddressPo, CustomerAddressMapper, CustomerAddressMapper> implements CustomerAddressService {

    @Override
    public QueryWrapper<CustomerAddressPo> wrapper(CustomerAddressPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getCustomerId()), "customer_id", po.getCustomerId())
                        .eq(!StringUtils.isEmpty(po.getCustomerName()), "customer_name", po.getCustomerName())
                        .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                        .eq(!StringUtils.isEmpty(po.getPhone()), "phone", po.getPhone())
                        .eq(!StringUtils.isEmpty(po.getProvince()), "province", po.getProvince())
                        .eq(!StringUtils.isEmpty(po.getCity()), "city", po.getCity())
                        .eq(!StringUtils.isEmpty(po.getArea()), "area", po.getArea())
                        .eq(!StringUtils.isEmpty(po.getAddress()), "address", po.getAddress())
                        .eq(!StringUtils.isEmpty(po.getIsDefault()), "is_default", po.getIsDefault());
    }
}
