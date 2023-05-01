package com.chengxuunion.generator.business.payorder.service;

import com.chengxuunion.generator.common.model.PageResult;

import com.chengxuunion.generator.business.payorder.model.PayOrder;
import com.chengxuunion.generator.business.payorder.model.request.PayOrderPageParam;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface PayOrderService {

    /**
     * 查询分页列表
     *
     * @param payOrderPageParam  参数对象
     * @return  列表
     */
    PageResult<PayOrder> listPayOrderPage(PayOrderPageParam payOrderPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    PayOrder getPayOrder(Long id);

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
    int deletePayOrder(Long id);

}