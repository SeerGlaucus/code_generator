package com.chengxuunion.generator.business.payorder.dao;

import com.chengxuunion.generator.business.payorder.model.PayOrder;
import com.chengxuunion.generator.business.payorder.model.request.PayOrderPageParam;

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
public interface PayOrderDao {

    /**
     * 查询列表
     *
     * @param payOrderPageParam  参数对象
     * @return  列表
     */
    List<PayOrder> listPayOrder(PayOrderPageParam payOrderPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    PayOrder getPayOrder(@Param("id") Long id);

    /**
     * 保存对象
     *
     * @param payOrder 对象
     * @return  保存影响的记录数
     */
    int savePayOrder(PayOrder payOrder);

    /**
     * 更新对象
     *
     * @param payOrder 对象
     * @return  更新影响的记录数
     */
    int updatePayOrder(PayOrder payOrder);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deletePayOrder(@Param("id") Long id);
}