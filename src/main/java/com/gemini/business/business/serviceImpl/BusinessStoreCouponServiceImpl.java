package com.gemini.business.business.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.business.mapper.BusinessStoreCouponMapper;
import com.gemini.business.business.po.BusinessStoreCouponPo;
import com.gemini.business.business.service.BusinessStoreCouponService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Service
public class BusinessStoreCouponServiceImpl extends BaseDetailServiceImpl<BusinessStoreCouponPo, BusinessStoreCouponPo, BusinessStoreCouponMapper, BusinessStoreCouponMapper> implements BusinessStoreCouponService {

    @Override
    public QueryWrapper<BusinessStoreCouponPo> wrapper(BusinessStoreCouponPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                .eq(!StringUtils.isEmpty(po.getBusinessId()), "business_id", po.getBusinessId())
                .eq(!StringUtils.isEmpty(po.getBusinessName()), "business_name", po.getBusinessName())
                .eq(!StringUtils.isEmpty(po.getStoreId()), "store_id", po.getStoreId())
                .eq(!StringUtils.isEmpty(po.getStoreName()), "store_name", po.getStoreName())
                .eq(!StringUtils.isEmpty(po.getStartDate()), "start_date", po.getStartDate())
                .eq(!StringUtils.isEmpty(po.getEndDate()), "end_date", po.getEndDate());
    }
}
