package com.chengxuunion.generator.business.room.controller;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.room.model.request.RoomPageParam;
import com.chengxuunion.generator.business.room.service.RoomService;

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
@RequestMapping("/room/manager")
public class RoomController extends BaseController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public String index() {
        return "/room/index";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object listPage(RoomPageParam roomPageParam) {
        return roomService.listRoomPage(roomPageParam);
    }

    @GetMapping("/add")
    public String add() {
        return "/room/add";
    }

    @PostMapping("/do-add")
    @ResponseBody
    public Object doAdd(Room room) {
        return roomService.saveRoom(room);
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Long id) {
        Room room = roomService.getRoom(id);
        model.addAttribute("room", room);
        return "/room/update";
    }

    @PutMapping("/do-update")
    @ResponseBody
    public Object doUpdate(Room room) {
        return roomService.updateRoom(room);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Object doDelete(@PathVariable("id") Long id) {
        return roomService.deleteRoom(id);
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        Room room = roomService.getRoom(id);
        model.addAttribute("room", room);
        return "/room/detail";
    }

}
