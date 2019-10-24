package com.gemini.business.business.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gemini.boot.framework.mybatis.entity.LayUiPage;
import com.gemini.boot.framework.web.entity.CommonFailInfo;
import com.gemini.boot.framework.web.entity.Message;
import com.gemini.business.common.annotation.SysLog;
import com.gemini.business.business.po.BusinessStoreGoodsPo;
import com.gemini.business.business.service.BusinessStoreGoodsService;
import com.gemini.business.platform.service.ErrorLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author 小明不读书
 * @date Thu Oct 24 11:45:53 CST 2019
 */
@Slf4j
@RestController
@RequestMapping("/business/store/goods")
public class BusinessStoreGoodsController {

    @Autowired
    BusinessStoreGoodsService businessStoreGoodsService;

    @GetMapping("/gotoList")
    public String gotoList() {
        return "business/_list";
    }

    @GetMapping
    @ResponseBody
    public Message list(LayUiPage layUiPage, BusinessStoreGoodsPo businessStoreGoodsPo) {
        try {
            QueryWrapper <BusinessStoreGoodsPo> qw = new QueryWrapper<>();
            if (layUiPage.getPageNum() != 0 && layUiPage.getPageSize() != 0) {
                IPage<BusinessStoreGoodsPo> list = businessStoreGoodsService.page(new Page<>(layUiPage.getPageNum(), layUiPage.getPageSize()), qw);
                return Message.success(list);
            } else {
                List<BusinessStoreGoodsPo> list = businessStoreGoodsService.list(qw);
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
                BusinessStoreGoodsPo businessStoreGoodsPo = businessStoreGoodsService.getById(id);
                return Message.success(businessStoreGoodsPo);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("添加")
    @PostMapping
    @ResponseBody
    public Message add(@RequestBody BusinessStoreGoodsPo po) {
        try {
            if (StringUtils.isEmpty(po.getId())) {
                businessStoreGoodsService.insertSync(po, po.getDetailList(), false);
                return Message.success(po);
            } else {
                return Message.fail(CommonFailInfo.Id_ALREADY_EXIST);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("更新")
    @PutMapping
    @ResponseBody
    public Message update(@RequestBody BusinessStoreGoodsPo po) {
        try {
            if (!StringUtils.isEmpty(po.getId())) {
                businessStoreGoodsService.updateSync(po, po.getDetailList(), false);
                return Message.success(po);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }

    @SysLog("删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    public Message delete(@PathVariable("id") Long id) {
        try {
            if (!StringUtils.isEmpty(id)) {
                businessStoreGoodsService.deleteByIdSync(id);
                return Message.success(null);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }
            
}