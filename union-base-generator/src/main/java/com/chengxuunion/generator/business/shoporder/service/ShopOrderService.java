package com.chengxuunion.generator.business.shoporder.service;

import com.chengxuunion.generator.common.model.PageResult;

import com.chengxuunion.generator.business.shoporder.model.ShopOrder;
import com.chengxuunion.generator.business.shoporder.model.request.ShopOrderPageParam;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface ShopOrderService {

    /**
     * 查询分页列表
     *
     * @param shopOrderPageParam  参数对象
     * @return  列表
     */
    PageResult<ShopOrder> listShopOrderPage(ShopOrderPageParam shopOrderPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    ShopOrder getShopOrder(Long id);

    /**
     * 保存对象
     *
     * @param shopOrder 对象
     * @return  保存影响的记录数
     */
    int saveShopOrder(ShopOrder shopOrder);

    /**
     * 更新对象
     *
     * @param shopOrder 对象
     * @return  更新影响的记录数
     */
    int updateShopOrder(ShopOrder shopOrder);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deleteShopOrder(Long id);

}