package com.chengxuunion.generator.business.qtuser.dao;

import com.chengxuunion.generator.business.qtuser.model.QtUser;
import com.chengxuunion.generator.business.qtuser.model.request.QtUserPageParam;

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
public interface QtUserDao {

    /**
     * 查询列表
     *
     * @param qtUserPageParam  参数对象
     * @return  列表
     */
    List<QtUser> listQtUser(QtUserPageParam qtUserPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    QtUser getQtUser(@Param("id") Long id);

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
    int deleteQtUser(@Param("id") Long id);
}