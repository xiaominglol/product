package com.gemini.business.business.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.business.common.service.BaseDetailServiceImpl;
import com.gemini.business.business.mapper.BusinessStoreMapper;
import com.gemini.business.business.po.BusinessStorePo;
import com.gemini.business.business.service.BusinessStoreService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class BusinessStoreServiceImpl extends BaseDetailServiceImpl<BusinessStorePo, BusinessStorePo, BusinessStoreMapper, BusinessStoreMapper> implements BusinessStoreService {

    @Override
    public QueryWrapper<BusinessStorePo> wrapper(BusinessStorePo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName())
                        .eq(!StringUtils.isEmpty(po.getBusinessId()), "business_id", po.getBusinessId())
                        .eq(!StringUtils.isEmpty(po.getBusinessName()), "business_name", po.getBusinessName());
    }
}
