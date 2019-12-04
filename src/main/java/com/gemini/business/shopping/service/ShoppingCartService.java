package com.gemini.business.shopping.service;

import com.gemini.boot.framework.mybatis.service.BaseDetailService;
import com.gemini.business.shopping.mapper.ShoppingCartMapper;
import com.gemini.business.shopping.po.ShoppingCartPo;

/**
 * 购物车表
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
public interface ShoppingCartService extends BaseDetailService<ShoppingCartPo, ShoppingCartPo, ShoppingCartMapper, ShoppingCartMapper> {
}