package com.gemini.business.order.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.order.mapper.OrderHistoryMapper;
import com.gemini.business.order.po.OrderHistoryPo;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
public interface OrderHistoryService extends BaseDetailService<OrderHistoryPo, OrderHistoryPo, OrderHistoryMapper, OrderHistoryMapper> {
}