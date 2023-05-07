package com.chengxuunion.generator.business.roomlock.service;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.roomlock.model.RoomLock;
import com.chengxuunion.generator.business.roomlock.model.request.RoomLockPageParam;
import com.chengxuunion.generator.common.model.PageResult;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface RoomLockService {

    /**
     * 查询分页列表
     *
     * @param roomLockPageParam  参数对象
     * @return  列表
     */
    PageResult<RoomLock> listRoomLockPage(RoomLockPageParam roomLockPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    RoomLock getRoomLock(Long id);

    /**
     * 保存对象
     *
     * @param roomLock 对象
     * @return  保存影响的记录数
     */
    int saveRoomLock(RoomLock roomLock);

    /**
     * 更新对象
     *
     * @param roomLock 对象
     * @return  更新影响的记录数
     */
    int updateRoomLock(RoomLock roomLock);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deleteRoomLock(Long id);

}