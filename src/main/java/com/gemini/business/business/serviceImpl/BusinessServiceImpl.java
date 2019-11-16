package com.gemini.business.business.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.business.mapper.BusinessMapper;
import com.gemini.business.business.po.BusinessPo;
import com.gemini.business.business.service.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class BusinessServiceImpl extends BaseDetailServiceImpl<BusinessPo, BusinessPo, BusinessMapper, BusinessMapper> implements BusinessService {

    @Override
    public QueryWrapper<BusinessPo> wrapper(BusinessPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getName()), "name", po.getName());
    }
}
