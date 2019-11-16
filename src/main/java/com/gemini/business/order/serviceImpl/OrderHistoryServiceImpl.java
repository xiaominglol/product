package com.gemini.business.order.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.service.impl.BaseDetailServiceImpl;
import com.gemini.business.order.mapper.OrderHistoryMapper;
import com.gemini.business.order.po.OrderHistoryPo;
import com.gemini.business.order.service.OrderHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Service
public class OrderHistoryServiceImpl extends BaseDetailServiceImpl<OrderHistoryPo, OrderHistoryPo, OrderHistoryMapper, OrderHistoryMapper> implements OrderHistoryService {

    @Override
    public QueryWrapper<OrderHistoryPo> wrapper(OrderHistoryPo po) {
        return super.wrapper(po)
                                .eq(!StringUtils.isEmpty(po.getOderId()), "oder_id", po.getOderId());
    }
}
