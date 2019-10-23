package com.gemini.business.platform.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseObjectPo;
import lombok.Data;

/**
 * 用户角色表
 *
 * @author 小明不读书
 */
@Data
@TableName("t_platform_role_menu")
public class UserRolePo extends BaseObjectPo {

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 角色id
     */
    private Long role_id;

}
