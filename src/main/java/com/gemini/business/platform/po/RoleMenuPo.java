package com.gemini.business.platform.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseObjectPo;
import lombok.Data;

/**
 * 角色菜单表
 *
 * @author 小明不读书
 */
@Data
@TableName("t_platform_role_menu")
public class RoleMenuPo extends BaseObjectPo {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 菜单id
     */
    private Long menuId;

}
