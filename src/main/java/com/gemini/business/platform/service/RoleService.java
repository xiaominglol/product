package com.gemini.business.platform.service;


import com.gemini.business.common.service.BaseDetailService;
import com.gemini.business.platform.mapper.RoleMapper;
import com.gemini.business.platform.mapper.RoleMenuMapper;
import com.gemini.business.platform.po.RoleMenuPo;
import com.gemini.business.platform.po.RolePo;

import java.util.List;
import java.util.Map;

/**
 * 角色表
 *
 * @author 小明不读书
 */
public interface RoleService extends BaseDetailService<RolePo, RoleMenuPo, RoleMapper, RoleMenuMapper> {

    /**
     * 通过角色id查询权限
     *
     * @param id
     */
    List<Map<String, String>> getAut(Long id);

    /**
     * 添加权限
     *
     * @param role
     * @param ids
     */
    void save(RolePo role, Long[] ids);

    /**
     * 更新角色
     *
     * @param role
     * @param ids
     */
    void updateById(RolePo role, Long[] ids);

    boolean removeById(Long id);
}
