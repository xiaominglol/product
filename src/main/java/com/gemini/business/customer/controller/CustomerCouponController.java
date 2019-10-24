package com.gemini.business.customer.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gemini.boot.framework.mybatis.entity.LayUiPage;
import com.gemini.boot.framework.web.entity.CommonFailInfo;
import com.gemini.boot.framework.web.entity.Message;
import com.gemini.business.common.annotation.SysLog;
import com.gemini.business.customer.po.CustomerCouponPo;
import com.gemini.business.customer.service.CustomerCouponService;
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
@RequestMapping("/customer/coupon")
public class CustomerCouponController {

    @Autowired
    CustomerCouponService customerCouponService;

    @GetMapping("/gotoList")
    public String gotoList() {
        return "customer/_list";
    }

    @GetMapping
    @ResponseBody
    public Message list(LayUiPage layUiPage, CustomerCouponPo customerCouponPo) {
        try {
            QueryWrapper <CustomerCouponPo> qw = new QueryWrapper<>();
            if (layUiPage.getPageNum() != 0 && layUiPage.getPageSize() != 0) {
                IPage<CustomerCouponPo> list = customerCouponService.page(new Page<>(layUiPage.getPageNum(), layUiPage.getPageSize()), qw);
                return Message.success(list);
            } else {
                List<CustomerCouponPo> list = customerCouponService.list(qw);
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
                CustomerCouponPo customerCouponPo = customerCouponService.getById(id);
                return Message.success(customerCouponPo);
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
    public Message add(@RequestBody CustomerCouponPo po) {
        try {
            if (StringUtils.isEmpty(po.getId())) {
                customerCouponService.insertSync(po, po.getDetailList(), false);
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
    public Message update(@RequestBody CustomerCouponPo po) {
        try {
            if (!StringUtils.isEmpty(po.getId())) {
                customerCouponService.updateSync(po, po.getDetailList(), false);
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
                customerCouponService.deleteByIdSync(id);
                return Message.success(null);
            } else {
                return Message.fail(CommonFailInfo.Id_CAN_NOT_BE_EMPTY);
            }
        } catch (Exception e) {
            return Message.fail(e.getMessage());
        }
    }
            
}