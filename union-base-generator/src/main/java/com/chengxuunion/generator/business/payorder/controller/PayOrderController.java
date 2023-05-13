package com.chengxuunion.generator.business.payorder.controller;

import com.chengxuunion.generator.business.payorder.model.PayOrder;
import com.chengxuunion.generator.business.payorder.model.request.PayOrderPageParam;
import com.chengxuunion.generator.business.payorder.service.PayOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.chengxuunion.generator.common.controller.BaseController;

/**
 * @Author 
 * @Description:    控制器
 * @Date:创建时间: 
 * @Modified By:
 */
@Controller
@RequestMapping("/payorder/manager")
public class PayOrderController extends BaseController {

    @Autowired
    private PayOrderService payOrderService;

    @GetMapping
    public String index() {
        return "payorder/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(PayOrderPageParam payOrderPageParam) {
        return payOrderService.listPayOrderPage(payOrderPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "payorder/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(PayOrder payOrder) {
        return payOrderService.savePayOrder(payOrder);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        PayOrder payOrder = payOrderService.getPayOrder(id);
        model.addAttribute("payOrder", payOrder);
        return "payorder/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(PayOrder payOrder) {
        return payOrderService.updatePayOrder(payOrder);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return payOrderService.deletePayOrder(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        PayOrder payOrder = payOrderService.getPayOrder(id);
        model.addAttribute("payOrder", payOrder);
        return "payorder/detail";
    }

}
