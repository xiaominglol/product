package com.gemini.business.business.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import com.gemini.boot.framework.mybatis.po.BasePo;
import com.gemini.boot.framework.mybatis.po.BaseSubPo;
import lombok.Data;


        import java.util.Date;

        import java.util.Date;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Data
@TableName("t_business_store_coupon")
public class BusinessStoreCouponPo extends BaseDetailPo<BusinessStoreCouponPo> {

        /**
        * 
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
        * 
        */
        private Date startDate;

        /**
        * 
        */
        private Date endDate;
}
