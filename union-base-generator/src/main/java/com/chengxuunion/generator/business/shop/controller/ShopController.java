package com.chengxuunion.generator.business.shop.controller;

import com.chengxuunion.generator.business.shop.model.Shop;
import com.chengxuunion.generator.business.shop.model.request.ShopPageParam;
import com.chengxuunion.generator.business.shop.service.ShopService;

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
@RequestMapping("/shop/manager")
public class ShopController extends BaseController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public String index() {
        return "/shop/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(ShopPageParam shopPageParam) {
        return shopService.listShopPage(shopPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "/shop/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(Shop shop) {
        return shopService.saveShop(shop);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        Shop shop = shopService.getShop(id);
        model.addAttribute("shop", shop);
        return "/shop/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(Shop shop) {
        return shopService.updateShop(shop);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return shopService.deleteShop(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        Shop shop = shopService.getShop(id);
        model.addAttribute("shop", shop);
        return "/shop/detail";
    }

}
