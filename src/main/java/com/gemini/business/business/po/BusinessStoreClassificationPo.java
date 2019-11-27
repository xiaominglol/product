package com.gemini.business.business.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;


/**
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Data
@TableName("business_store_classification")
public class BusinessStoreClassificationPo extends BaseDetailPo<BusinessStoreClassificationPo> {

    /**
     *
     */
    private Long pid;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

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
     * 描述
     */
    private String description;

    /**
     * 状态id
     */
    private Long stateId;

    /**
     * 状态编码
     */
    private String stateCode;

    /**
     * 状态名称
     */
    private String stateName;
}
