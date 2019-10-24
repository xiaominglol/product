package com.gemini.business.platform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gemini.boot.framework.mybatis.entity.LayUiPage;
import com.gemini.boot.framework.web.entity.CommonFailInfo;
import com.gemini.boot.framework.web.entity.Message;
import com.gemini.business.common.annotation.SysLog;
import com.gemini.business.platform.po.OrgPo;
import com.gemini.business.platform.service.ErrorLogService;
import com.gemini.business.platform.service.OrgService;
import com.gemini.business.platform.utils.TreeSelectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 组织架构-控制层
 *
 * @author 小明不读书
 * @date 2018-06-09
 */
@Controller
@RequestMapping("/sys/org")
public class OrgController {

    @Autowired
    ErrorLogService errorLogService;
    @Autowired
    OrgService orgService;

    @GetMapping("/gotoList")
    public String gotoList() {
        return "platform/org/org_list";
    }

    /**
     * 构建下拉树
     *
     * @return
     */
    @GetMapping("/treeSelect")
    @ResponseBody
    public Message treeSelect() {
        try {
            QueryWrapper<OrgPo> qw = new QueryWrapper<>();
            List<OrgPo> orgList = orgService.list(qw);
            List<Map<String, Object>> list = TreeSelectUtil.getTreeSelect(orgList);
            return Message.success(list);
        } catch (Exception e) {
//            excpLogService.save(ExcpLog.saveExcpLog(this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()", e.getMessage(), logger));
            return Message.fail(e.getMessage());
        }
    }

    @GetMapping
    @ResponseBody
    public Message list(LayUiPage layUiPage, OrgPo orgPo) {
        try {
            QueryWrapper<OrgPo> qw = new QueryWrapper<>();
            if (!StringUtils.isEmpty(orgPo.getName())) {
                qw.like("name", orgPo.getName());
            }
            if (!StringUtils.isEmpty(orgPo.getOrgTypeCode())) {
                qw.like("org_type_code", orgPo.getOrgTypeCode());
            }
            if (!StringUtils.isEmpty(orgPo.getPid())) {
                qw.eq("pid", orgPo.getPid());
            }
            if (layUiPage.getPageNum() != 0 && layUiPage.getPageSize() != 0) {
                IPage<OrgPo> list = orgService.page(new Page<>(layUiPage.getPageNum(), layUiPage.getPageSize()), qw);
                return Message.success(list);
            } else {
                List<OrgPo> list = orgService.list(qw);
                return Message.success(list);
            }
        } catch (Exception e) {
//            excpLogService.save(ExcpLog.saveExcpLog(this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()", e.getMessage(), logger));
            return Message.fail(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Message detail(@PathVariable("id") Long id) {
        try {
            if (!StringUtils.isEmpty(id)) {
                OrgPo orgPo = orgService.getById(id);
                return Message.success(orgPo);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("添加组织架构")
    @PostMapping
    @ResponseBody
    public Message add(@RequestBody OrgPo orgPo) {
        try {
            if (StringUtils.isEmpty(orgPo.getId())) {
                orgPo.initDict();
                orgService.insertSync(orgPo, orgPo.getDetailList(), true);
                return Message.success(orgPo);
            } else {
                return Message.fail(CommonFailInfo.Id_ALREADY_EXIST);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("更新组织架构")
    @PutMapping
    @ResponseBody
    public Message update(@RequestBody OrgPo orgPo) {
        try {
            if (!StringUtils.isEmpty(orgPo.getId())) {
                orgPo.initDict();
                orgService.updateSync(orgPo, orgPo.getDetailList(), true);
                return Message.success(orgPo);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("删除组织架构")
    @DeleteMapping("/{id}")
    @ResponseBody
    public Message delete(@PathVariable("id") Long id) {
        try {
            if (!StringUtils.isEmpty(id)) {
                orgService.deleteByIdSync(id);
                return Message.success(null);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

}