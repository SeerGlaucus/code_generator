package com.chengxuunion.generator.business.room.dao;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.room.model.request.RoomPageParam;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 
 * @Description:    Dao
 * @Date:创建时间: 
 * @Modified By:
 */
@Repository
public interface RoomDao {

    /**
     * 查询列表
     *
     * @param roomPageParam  参数对象
     * @return  列表
     */
    List<Room> listRoom(RoomPageParam roomPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    Room getRoom(@Param("id") Long id);

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
    int deleteRoom(@Param("id") Long id);
}