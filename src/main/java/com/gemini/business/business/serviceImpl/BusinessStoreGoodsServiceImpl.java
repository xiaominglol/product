package com.gemini.business.business.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.business.mapper.BusinessStoreGoodsMapper;
import com.gemini.business.business.po.BusinessStoreGoodsPo;
import com.gemini.business.business.service.BusinessStoreGoodsService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Service
public class BusinessStoreGoodsServiceImpl extends BaseDetailServiceImpl<BusinessStoreGoodsPo, BusinessStoreGoodsPo, BusinessStoreGoodsMapper, BusinessStoreGoodsMapper> implements BusinessStoreGoodsService {

    @Override
    public QueryWrapper<BusinessStoreGoodsPo> wrapper(BusinessStoreGoodsPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                .eq(!StringUtils.isEmpty(po.getBusinessId()), "business_id", po.getBusinessId())
                .eq(!StringUtils.isEmpty(po.getBusinessName()), "business_name", po.getBusinessName())
                .eq(!StringUtils.isEmpty(po.getStoreId()), "store_id", po.getStoreId())
                .eq(!StringUtils.isEmpty(po.getStoreName()), "store_name", po.getStoreName());
    }
}
