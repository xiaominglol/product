package com.gemini.business.customer.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;

import java.util.Date;

/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Data
@TableName("customer_collection")
public class CustomerCollectionPo extends BaseDetailPo<CustomerCollectionPo> {

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
    private Long storeId;

    /**
     *
     */
    private String storeName;

    /**
     *
     */
    private Long goodsId;

    /**
     *
     */
    private String goodsName;

    /**
     *
     */
    private Date createTime;
}
