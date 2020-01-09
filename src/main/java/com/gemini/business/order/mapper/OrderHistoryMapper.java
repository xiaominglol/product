package com.gemini.business.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.business.order.po.OrderHistoryPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
@Mapper
public interface OrderHistoryMapper extends BaseMapper<OrderHistoryPo> {
}
