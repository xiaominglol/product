package com.gemini.business.customer.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import com.gemini.boot.framework.mybatis.po.BasePo;
import com.gemini.boot.framework.mybatis.po.BaseSubPo;
import lombok.Data;


        import java.util.Date;

/**
* 
*
* @author 小明不读书
* @date Thu Oct 24 11:45:53 CST 2019
*/
@Data
@TableName("t_customer")
public class CustomerPo extends BaseDetailPo<CustomerPo> {

        /**
        * 
        */
        private String name;

        /**
        * 
        */
        private String account;

        /**
        * 
        */
        private String password;

        /**
        * 
        */
        private Integer phone;

        /**
        * 
        */
        private Date createTime;
}
