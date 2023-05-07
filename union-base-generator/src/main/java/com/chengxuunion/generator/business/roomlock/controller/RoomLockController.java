package com.chengxuunion.generator.business.roomlock.controller;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.roomlock.model.RoomLock;
import com.chengxuunion.generator.business.roomlock.model.request.RoomLockPageParam;
import com.chengxuunion.generator.business.roomlock.service.RoomLockService;
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
@RequestMapping("/roomlock/manager")
public class RoomLockController extends BaseController {

    @Autowired
    private RoomLockService roomLockService;

    @GetMapping
    public String index() {
        return "/roomlock/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(RoomLockPageParam roomLockPageParam) {
        return roomLockService.listRoomLockPage(roomLockPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "/roomlock/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(RoomLock roomLock) {
        return roomLockService.saveRoomLock(roomLock);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        RoomLock roomLock = roomLockService.getRoomLock(id);
        model.addAttribute("roomLock", roomLock);
        return "/roomlock/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(RoomLock roomLock) {
        return roomLockService.updateRoomLock(roomLock);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return roomLockService.deleteRoomLock(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        RoomLock roomLock =  roomLockService.getRoomLock(id);
        model.addAttribute("roomLock", roomLock);
        return "/roomlock/detail";
    }

}
