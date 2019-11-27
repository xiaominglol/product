package com.gemini.business.business.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.business.mapper.BusinessStoreClassificationMapper;
import com.gemini.business.business.po.BusinessStoreClassificationPo;
import com.gemini.business.business.service.BusinessStoreClassificationService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Service
public class BusinessStoreClassificationServiceImpl extends BaseDetailServiceImpl<BusinessStoreClassificationPo, BusinessStoreClassificationPo, BusinessStoreClassificationMapper, BusinessStoreClassificationMapper> implements BusinessStoreClassificationService {

    @Override
    public QueryWrapper<BusinessStoreClassificationPo> wrapper(BusinessStoreClassificationPo po) {
        return super.wrapper(po)
                .eq(!StringUtils.isEmpty(po.getPid()), "pid", po.getPid())
                .eq(!StringUtils.isEmpty(po.getCode()), "code", po.getCode())
                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                .eq(!StringUtils.isEmpty(po.getBusinessId()), "business_id", po.getBusinessId())
                .eq(!StringUtils.isEmpty(po.getBusinessName()), "business_name", po.getBusinessName())
                .eq(!StringUtils.isEmpty(po.getStoreId()), "store_id", po.getStoreId())
                .eq(!StringUtils.isEmpty(po.getStoreName()), "store_name", po.getStoreName())
                .eq(!StringUtils.isEmpty(po.getDescription()), "description", po.getDescription())
                .eq(!StringUtils.isEmpty(po.getStateId()), "state_id", po.getStateId())
                .eq(!StringUtils.isEmpty(po.getStateCode()), "state_code", po.getStateCode())
                .eq(!StringUtils.isEmpty(po.getStateName()), "state_name", po.getStateName());
    }
}
