package com.gemini.business.platform.service;


import com.gemini.business.common.service.BaseDetailService;
import com.gemini.business.platform.mapper.UserMapper;
import com.gemini.business.platform.mapper.UserRoleMapper;
import com.gemini.business.platform.po.UserPo;
import com.gemini.business.platform.po.UserRolePo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户表
 *
 * @author 小明不读书
 */
public interface UserService extends BaseDetailService<UserPo, UserRolePo, UserMapper, UserRoleMapper> {

    /**
     * 根据account查询用户
     *
     * @param account
     * @return
     */
    UserPo getByAccount(String account);

    /**
     * 根据account查询用户角色
     *
     * @param account
     * @return
     */
    Set<String> getRoleById(String account);

    /**
     * 根据account查询用户权限
     *
     * @param account
     * @return
     */
    Set<String> getPermissionsById(String account);

    /**
     * 通过用户账号查询用户角色
     *
     * @param account
     * @return
     */
    List<Map<String, String>> getUserRole(String account);

    /**
     * 添加用户角色
     *
     * @param account
     * @param ids
     */
    void addUserRole(Long userId, Long[] roleIds);

    /**
     * 删除权用户角色
     *
     * @param account
     */
    void deleteUserRole(String account);
}
