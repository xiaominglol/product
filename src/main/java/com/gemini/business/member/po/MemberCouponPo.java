package com.gemini.business.member.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;

import java.util.Date;

/**
 * 会员优惠劵表
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
@Data
@TableName("member_coupon")
public class MemberCouponPo extends BaseDetailPo<MemberCouponPo> {

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 会员昵称
     */
    private String memberNickname;

    /**
     * 优惠劵id
     */
    private Long couponId;

    /**
     * 优惠劵名称
     */
    private String couponName;

    /**
     * 创建时间
     */
    private Date createTime;
}
