package com.gemini.business.order.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.order.mapper.OrderMapper;
import com.gemini.business.order.po.OrderPo;
import com.gemini.business.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class OrderServiceImpl extends BaseDetailServiceImpl<OrderPo, OrderPo, OrderMapper, OrderMapper> implements OrderService {

    @Override
    public QueryWrapper<OrderPo> wrapper(OrderPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getBusinessId()), "business_id", po.getBusinessId())
                        .eq(!StringUtils.isEmpty(po.getBusinessName()), "business_name", po.getBusinessName())
                        .eq(!StringUtils.isEmpty(po.getStoreId()), "store_id", po.getStoreId())
                        .eq(!StringUtils.isEmpty(po.getStoreName()), "store_name", po.getStoreName())
                        .eq(!StringUtils.isEmpty(po.getCustomerId()), "customer_id", po.getCustomerId())
                        .eq(!StringUtils.isEmpty(po.getCustomerName()), "customer_name", po.getCustomerName())
                        .eq(!StringUtils.isEmpty(po.getAmount()), "amount", po.getAmount())
                        .eq(!StringUtils.isEmpty(po.getStateId()), "state_id", po.getStateId())
                        .eq(!StringUtils.isEmpty(po.getStateCode()), "state_code", po.getStateCode())
                        .eq(!StringUtils.isEmpty(po.getStateName()), "state_name", po.getStateName())
                        .eq(!StringUtils.isEmpty(po.getCreateTime()), "create_time", po.getCreateTime());
    }
}
