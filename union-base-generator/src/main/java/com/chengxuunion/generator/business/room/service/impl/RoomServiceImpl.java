package com.chengxuunion.generator.business.room.service.impl;

import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Date;

import com.chengxuunion.generator.business.room.model.Room;
import com.chengxuunion.generator.business.room.service.RoomService;
import com.chengxuunion.generator.business.room.dao.RoomDao;
import com.chengxuunion.generator.business.room.model.request.RoomPageParam;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public PageResult<Room> listRoomPage(RoomPageParam roomPageParam) {
        PageHelper.startPage(roomPageParam.getPageNum() , roomPageParam.getPageSize());
        List<Room> roomList = roomDao.listRoom(roomPageParam);
        //得到分页的结果对象
        PageInfo<Room> pageInfo = new PageInfo<>(roomList);

        return new PageResult<Room>(roomPageParam, pageInfo.getTotal(), roomList);
    }

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    @Override
    public Room getRoom(Long id) {
        return roomDao.getRoom(id);
    }

    /**
     * 保存对象
     *
     * @param room 对象
     * @return  保存影响的记录数
     */
    @Override
    public int saveRoom(Room room) {
        room.setId(IdGenerator.getInstance().nextId());
        return roomDao.saveRoom(room);
    }

    /**
     * 更新对象
     *
     * @param room 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updateRoom(Room room) {
        return  roomDao.updateRoom(room);
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    @Override
    public int deleteRoom(Long id) {
        return  roomDao.deleteRoom(id);
    }

}

