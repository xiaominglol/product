package com.gemini.business.order.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.order.mapper.OrderHistoryMapper;
import com.gemini.business.order.po.OrderHistoryPo;

/**
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
public interface OrderHistoryService extends BaseDetailService<OrderHistoryPo, OrderHistoryPo, OrderHistoryMapper, OrderHistoryMapper> {
}