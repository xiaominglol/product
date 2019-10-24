package com.gemini.business.customer.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.business.common.service.BaseDetailServiceImpl;
import com.gemini.business.customer.mapper.CustomerMapper;
import com.gemini.business.customer.po.CustomerPo;
import com.gemini.business.customer.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class CustomerServiceImpl extends BaseDetailServiceImpl<CustomerPo, CustomerPo, CustomerMapper, CustomerMapper> implements CustomerService {

    @Override
    public QueryWrapper<CustomerPo> wrapper(CustomerPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                        .eq(!StringUtils.isEmpty(po.getAccount()), "account", po.getAccount())
                        .eq(!StringUtils.isEmpty(po.getPassword()), "password", po.getPassword())
                        .eq(!StringUtils.isEmpty(po.getPhone()), "phone", po.getPhone())
                        .eq(!StringUtils.isEmpty(po.getCreateTime()), "create_time", po.getCreateTime());
    }
}
