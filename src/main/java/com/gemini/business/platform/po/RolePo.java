package com.gemini.business.platform.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gemini.boot.framework.mybatis.po.BaseDetailPo;
import lombok.Data;

/**
 * 角色表
 *
 * @author 小明不读书
 */
@Data
@TableName("platform_role")
public class RolePo extends BaseDetailPo<RoleMenuPo> {

    /**
     * 主鍵ID
     */
    private Long id;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 排序
     */
    private String sort;
}
