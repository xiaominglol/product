package com.gemini.business.customer.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import com.gemini.boot.framework.mybatis.po.BasePo;
import com.gemini.boot.framework.mybatis.po.BaseSubPo;
import lombok.Data;


/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Data
@TableName("t_customer_address")
public class CustomerAddressPo extends BaseDetailPo<CustomerAddressPo> {

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
        private String name;

        /**
        * 
        */
        private Integer phone;

        /**
        * 
        */
        private String province;

        /**
        * 
        */
        private String city;

        /**
        * 
        */
        private String area;

        /**
        * 
        */
        private String address;

        /**
        * 
        */
        private Byte isDefault;
}
