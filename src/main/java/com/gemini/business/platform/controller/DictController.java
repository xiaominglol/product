package com.gemini.business.platform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gemini.boot.framework.mybatis.entity.LayUiPage;
import com.gemini.boot.framework.web.entity.CommonFailInfo;
import com.gemini.boot.framework.web.entity.Message;
import com.gemini.business.common.annotation.SysLog;
import com.gemini.business.platform.po.DictPo;
import com.gemini.business.platform.service.DictService;
import com.gemini.business.platform.service.ErrorLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典控制层
 *
 * @author 小明不读书
 * @date 2018-10-24
 */
@Slf4j
@Controller
@RequestMapping("/sys/dict")
public class DictController {

    @Autowired
    ErrorLogService errorLogService;
    @Autowired
    DictService dictService;

    @GetMapping("/gotoList")
    public String gotoList() {
        return "platform/dict/dict_list";
    }

    @GetMapping
    @ResponseBody
    public Message list(LayUiPage layUiPage, DictPo dictPo) {
        try {
            QueryWrapper<DictPo> qw = new QueryWrapper<>();
            if (!StringUtils.isEmpty(dictPo.getName())) {
                qw.like("name", dictPo.getName()).or().like("code", dictPo.getCode());
            }
            if (!StringUtils.isEmpty(dictPo.getPid())) {
                qw.eq("pid", dictPo.getPid());
                qw.eq("state_code", "Enable");
            }
            if (!StringUtils.isEmpty(dictPo.getCode())) {
                qw.eq("code", dictPo.getCode());
                qw.eq("state_code", "Enable");
            }
            if (layUiPage.getPageNum() != 0 && layUiPage.getPageSize() != 0) {
                IPage<DictPo> list = dictService.page(new Page<>(layUiPage.getPageNum(), layUiPage.getPageSize()), qw);
                return Message.success(list);
            } else {
                List<DictPo> list = dictService.list(qw);
                return Message.success(list);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Message detail(@PathVariable("id") Long id) {
        try {
            if (!StringUtils.isEmpty(id)) {
                DictPo dictPo = dictService.getById(id);
                return Message.success(dictPo);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("添加字典")
    @PostMapping
    @ResponseBody
    public Message add(@RequestBody DictPo dictPo) {
        try {
            if (StringUtils.isEmpty(dictPo.getId())) {
                dictService.insertSync(dictPo, dictPo.getDetailList(), true);
                return Message.success(dictPo);
            } else {
                return Message.fail(CommonFailInfo.Id_ALREADY_EXIST);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("更新字典")
    @PutMapping
    @ResponseBody
    public Message update(@RequestBody DictPo dictPo) {
        try {
            if (!StringUtils.isEmpty(dictPo.getId())) {
                dictService.updateSync(dictPo, dictPo.getDetailList(), true);
                return Message.success(dictPo);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("删除字典")
    @DeleteMapping("/{id}")
    @ResponseBody
    public Message delete(@PathVariable("id") Long id) {
        try {
            if (!StringUtils.isEmpty(id)) {
                dictService.deleteByIdSync(id);
                return Message.success(null);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }
}