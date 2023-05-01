package com.chengxuunion.generator.business.roomlock.service.impl;

import com.chengxuunion.generator.business.roomlock.dao.RoomLockDao;
import com.chengxuunion.generator.business.roomlock.model.RoomLock;
import com.chengxuunion.generator.business.roomlock.model.request.RoomLockPageParam;
import com.chengxuunion.generator.business.roomlock.service.RoomLockService;
import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Date;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class RoomLockServiceImpl implements RoomLockService {

    @Autowired
    private RoomLockDao roomLockDao;

    @Override
    public PageResult<RoomLock> listRoomLockPage(RoomLockPageParam roomLockPageParam) {
        PageHelper.startPage(roomLockPageParam.getPageNum() , roomLockPageParam.getPageSize());
        List<RoomLock> roomLockList = roomLockDao.listRoomLock(roomLockPageParam);
        //得到分页的结果对象
        PageInfo<RoomLock> pageInfo = new PageInfo<>(roomLockList);

        return new PageResult<RoomLock>(roomLockPageParam, pageInfo.getTotal(), roomLockList);
    }

    /**
     * 保存对象
     *
     * @param roomLock 对象
     * @return  保存影响的记录数
     */
    @Override
    public int saveRoomLock(RoomLock roomLock) {
        return roomLockDao.saveRoomLock(roomLock);
    }

    /**
     * 更新对象
     *
     * @param roomLock 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updateRoomLock(RoomLock roomLock) {
        return  roomLockDao.updateRoomLock(roomLock);
    }

}

