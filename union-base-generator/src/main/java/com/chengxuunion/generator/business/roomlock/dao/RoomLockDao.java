package com.chengxuunion.generator.business.roomlock.dao;

import com.chengxuunion.generator.business.roomlock.model.RoomLock;
import com.chengxuunion.generator.business.roomlock.model.request.RoomLockPageParam;

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
public interface RoomLockDao {

    /**
     * 查询列表
     *
     * @param roomLockPageParam  参数对象
     * @return  列表
     */
    List<RoomLock> listRoomLock(RoomLockPageParam roomLockPageParam);

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

}