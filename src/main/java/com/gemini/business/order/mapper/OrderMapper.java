package com.gemini.business.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.business.order.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Mapper
public interface OrderMapper extends BaseMapper<OrderPo> {
}