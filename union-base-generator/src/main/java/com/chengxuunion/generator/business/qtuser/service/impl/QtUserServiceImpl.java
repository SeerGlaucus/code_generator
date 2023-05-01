package com.chengxuunion.generator.business.qtuser.service.impl;

import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Date;

import com.chengxuunion.generator.business.qtuser.model.QtUser;
import com.chengxuunion.generator.business.qtuser.service.QtUserService;
import com.chengxuunion.generator.business.qtuser.dao.QtUserDao;
import com.chengxuunion.generator.business.qtuser.model.request.QtUserPageParam;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class QtUserServiceImpl implements QtUserService {

    @Autowired
    private QtUserDao qtUserDao;

    @Override
    public PageResult<QtUser> listQtUserPage(QtUserPageParam qtUserPageParam) {
        PageHelper.startPage(qtUserPageParam.getPageNum() , qtUserPageParam.getPageSize());
        List<QtUser> qtUserList = qtUserDao.listQtUser(qtUserPageParam);
        //得到分页的结果对象
        PageInfo<QtUser> pageInfo = new PageInfo<>(qtUserList);

        return new PageResult<QtUser>(qtUserPageParam, pageInfo.getTotal(), qtUserList);
    }

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    @Override
    public QtUser getQtUser(Long id) {
        return qtUserDao.getQtUser(id);
    }

    /**
     * 保存对象
     *
     * @param qtUser 对象
     * @return  保存影响的记录数
     */
    @Override
    public int saveQtUser(QtUser qtUser) {
        qtUser.setId(IdGenerator.getInstance().nextId());
        return qtUserDao.saveQtUser(qtUser);
    }

    /**
     * 更新对象
     *
     * @param qtUser 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updateQtUser(QtUser qtUser) {
        return  qtUserDao.updateQtUser(qtUser);
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    @Override
    public int deleteQtUser(Long id) {
        return  qtUserDao.deleteQtUser(id);
    }

}

