package com.chengxuunion.generator.business.qtuser.controller;

import com.chengxuunion.generator.business.qtuser.model.QtUser;
import com.chengxuunion.generator.business.qtuser.model.request.QtUserPageParam;
import com.chengxuunion.generator.business.qtuser.service.QtUserService;

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
@RequestMapping("/qtuser/manager")
public class QtUserController extends BaseController {

    @Autowired
    private QtUserService qtUserService;

    @GetMapping
    public String index() {
        return "/qtuser/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(QtUserPageParam qtUserPageParam) {
        return qtUserService.listQtUserPage(qtUserPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "/qtuser/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(QtUser qtUser) {
        return qtUserService.saveQtUser(qtUser);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        QtUser qtUser = qtUserService.getQtUser(id);
        model.addAttribute("qtUser", qtUser);
        return "/qtuser/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(QtUser qtUser) {
        return qtUserService.updateQtUser(qtUser);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return qtUserService.deleteQtUser(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        QtUser qtUser = qtUserService.getQtUser(id);
        model.addAttribute("qtUser", qtUser);
        return "/qtuser/detail";
    }

}
