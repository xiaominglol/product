package com.gemini.business.goods.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BasePo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品库存表
 *
 * @author 小明不读书
 * @date Tue Nov 26 21:22:00 CST 2019
 */
@Data
@TableName("goods_stock")
public class GoodsStockPo extends BasePo {

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 规格id
     */
    private Long specificationId;

    /**
     * 规格名称
     */
    private String specificationName;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 现价
     */
    private BigDecimal currentPrice;

    /**
     * 剩余库存
     */
    private Long surplusStock;
}
