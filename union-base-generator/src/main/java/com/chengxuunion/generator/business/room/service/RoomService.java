package com.chengxuunion.generator.business.room.service;

import com.chengxuunion.generator.common.model.PageResult;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.room.model.request.RoomPageParam;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface RoomService {

    /**
     * 查询分页列表
     *
     * @param roomPageParam  参数对象
     * @return  列表
     */
    PageResult<Room> listRoomPage(RoomPageParam roomPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    Room getRoom(Long id);

    /**
     * 保存对象
     *
     * @param room 对象
     * @return  保存影响的记录数
     */
    int saveRoom(Room room);

    /**
     * 更新对象
     *
     * @param room 对象
     * @return  更新影响的记录数
     */
    int updateRoom(Room room);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deleteRoom(Long id);

}