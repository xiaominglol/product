package com.gemini.business.order.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Data
@TableName("order")
public class OrderPo extends BaseDetailPo<OrderPo> {

    /**
     *
     */
    private Long businessId;

    /**
     *
     */
    private String businessName;

    /**
     *
     */
    private Long storeId;

    /**
     *
     */
    private String storeName;

    /**
     *
     */
    private Long customerId;

    /**
     *
     */
    private String customerName;

    /**
     *
     */
    private BigDecimal amount;

    /**
     *
     */
    private Long stateId;

    /**
     *
     */
    private String stateCode;

    /**
     *
     */
    private String stateName;

    /**
     *
     */
    private Date createTime;
}
