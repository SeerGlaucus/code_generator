package com.chengxuunion.generator.business.qtuser.service;

import com.chengxuunion.generator.common.model.PageResult;

import com.chengxuunion.generator.business.qtuser.model.QtUser;
import com.chengxuunion.generator.business.qtuser.model.request.QtUserPageParam;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface QtUserService {

    /**
     * 查询分页列表
     *
     * @param qtUserPageParam  参数对象
     * @return  列表
     */
    PageResult<QtUser> listQtUserPage(QtUserPageParam qtUserPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    QtUser getQtUser(Long id);

    /**
     * 保存对象
     *
     * @param qtUser 对象
     * @return  保存影响的记录数
     */
    int saveQtUser(QtUser qtUser);

    /**
     * 更新对象
     *
     * @param qtUser 对象
     * @return  更新影响的记录数
     */
    int updateQtUser(QtUser qtUser);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deleteQtUser(Long id);

}