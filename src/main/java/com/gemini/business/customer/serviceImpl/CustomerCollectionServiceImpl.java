package com.gemini.business.customer.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.customer.mapper.CustomerCollectionMapper;
import com.gemini.business.customer.po.CustomerCollectionPo;
import com.gemini.business.customer.service.CustomerCollectionService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class CustomerCollectionServiceImpl extends BaseDetailServiceImpl<CustomerCollectionPo, CustomerCollectionPo, CustomerCollectionMapper, CustomerCollectionMapper> implements CustomerCollectionService {

    @Override
    public QueryWrapper<CustomerCollectionPo> wrapper(CustomerCollectionPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getCustomerId()), "customer_id", po.getCustomerId())
                        .eq(!StringUtils.isEmpty(po.getCustomerName()), "customer_name", po.getCustomerName())
                        .eq(!StringUtils.isEmpty(po.getStoreId()), "store_id", po.getStoreId())
                        .eq(!StringUtils.isEmpty(po.getStoreName()), "store_name", po.getStoreName())
                        .eq(!StringUtils.isEmpty(po.getGoodsId()), "goods_id", po.getGoodsId())
                        .eq(!StringUtils.isEmpty(po.getGoodsName()), "goods_name", po.getGoodsName())
                        .eq(!StringUtils.isEmpty(po.getCreateTime()), "create_time", po.getCreateTime());
    }
}
