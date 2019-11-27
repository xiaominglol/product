package com.gemini.business.customer.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.customer.mapper.CustomerCouponMapper;
import com.gemini.business.customer.po.CustomerCouponPo;
import com.gemini.business.customer.service.CustomerCouponService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Service
public class CustomerCouponServiceImpl extends BaseDetailServiceImpl<CustomerCouponPo, CustomerCouponPo, CustomerCouponMapper, CustomerCouponMapper> implements CustomerCouponService {

    @Override
    public QueryWrapper<CustomerCouponPo> wrapper(CustomerCouponPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getCustomerId()), "customer_id", po.getCustomerId())
                .eq(!StringUtils.isEmpty(po.getCustomerName()), "customer_name", po.getCustomerName())
                .eq(!StringUtils.isEmpty(po.getCouponId()), "coupon_id", po.getCouponId())
                .eq(!StringUtils.isEmpty(po.getCouponName()), "coupon_name", po.getCouponName());
    }
}
