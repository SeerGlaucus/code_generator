package com.chengxuunion.generator.business.shop.service;

import com.chengxuunion.generator.common.model.PageResult;

import com.chengxuunion.generator.business.shop.model.Shop;
import com.chengxuunion.generator.business.shop.model.request.ShopPageParam;


/**
 * @Author 
 * @Description:    服务接口
 * @Date:创建时间: 
 * @Modified By:
 */
public interface ShopService {

    /**
     * 查询分页列表
     *
     * @param shopPageParam  参数对象
     * @return  列表
     */
    PageResult<Shop> listShopPage(ShopPageParam shopPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    Shop getShop(Long id);

    /**
     * 保存对象
     *
     * @param shop 对象
     * @return  保存影响的记录数
     */
    int saveShop(Shop shop);

    /**
     * 更新对象
     *
     * @param shop 对象
     * @return  更新影响的记录数
     */
    int updateShop(Shop shop);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    int deleteShop(Long id);

}