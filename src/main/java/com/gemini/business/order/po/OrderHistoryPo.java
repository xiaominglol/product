package com.gemini.business.order.po;

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
@TableName("t_order_history")
public class OrderHistoryPo extends BaseDetailPo<OrderHistoryPo> {

        /**
        * 
        */
        private Long oderId;
}
