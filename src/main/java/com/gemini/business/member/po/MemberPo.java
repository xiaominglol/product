package com.gemini.business.member.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;

import java.util.Date;

/**
 * 会员表
 *
 * @author 小明不读书
 * @date Wed Dec 04 09:34:37 CST 2019
 */
@Data
@TableName("member")
public class MemberPo extends BaseDetailPo<MemberPo> {

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private Integer idCardNo;

    /**
     * 创建时间
     */
    private Date createTime;
}
