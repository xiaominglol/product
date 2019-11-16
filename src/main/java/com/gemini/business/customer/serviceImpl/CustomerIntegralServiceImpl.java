package com.gemini.business.customer.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.customer.mapper.CustomerIntegralMapper;
import com.gemini.business.customer.po.CustomerIntegralPo;
import com.gemini.business.customer.service.CustomerIntegralService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class CustomerIntegralServiceImpl extends BaseDetailServiceImpl<CustomerIntegralPo, CustomerIntegralPo, CustomerIntegralMapper, CustomerIntegralMapper> implements CustomerIntegralService {

    @Override
    public QueryWrapper<CustomerIntegralPo> wrapper(CustomerIntegralPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getCustomerId()), "customer_id", po.getCustomerId())
                        .eq(!StringUtils.isEmpty(po.getCustomerName()), "customer_name", po.getCustomerName());
    }
}
