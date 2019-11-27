package com.gemini.business.customer.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;


/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Data
@TableName("customer_coupon")
public class CustomerCouponPo extends BaseDetailPo<CustomerCouponPo> {

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
    private Long couponId;

    /**
     *
     */
    private String couponName;
}
