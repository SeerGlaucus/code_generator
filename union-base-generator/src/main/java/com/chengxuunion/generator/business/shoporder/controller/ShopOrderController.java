package com.chengxuunion.generator.business.shoporder.controller;

import com.chengxuunion.generator.business.shoporder.model.ShopOrder;
import com.chengxuunion.generator.business.shoporder.model.request.ShopOrderPageParam;
import com.chengxuunion.generator.business.shoporder.service.ShopOrderService;

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
@RequestMapping("/shoporder/manager")
public class ShopOrderController extends BaseController {

    @Autowired
    private ShopOrderService shopOrderService;

    @GetMapping
    public String index() {
        return "shoporder/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(ShopOrderPageParam shopOrderPageParam) {
        return shopOrderService.listShopOrderPage(shopOrderPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "shoporder/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(ShopOrder shopOrder) {
        return shopOrderService.saveShopOrder(shopOrder);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        ShopOrder shopOrder = shopOrderService.getShopOrder(id);
        model.addAttribute("shopOrder", shopOrder);
        return "shoporder/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(ShopOrder shopOrder) {
        return shopOrderService.updateShopOrder(shopOrder);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return shopOrderService.deleteShopOrder(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        ShopOrder shopOrder = shopOrderService.getShopOrder(id);
        model.addAttribute("shopOrder", shopOrder);
        return "shoporder/detail";
    }

}
