package com.chengxuunion.generator.business.shop.dao;

import com.chengxuunion.generator.business.shop.model.Shop;
import com.chengxuunion.generator.business.shop.model.request.ShopPageParam;

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
public interface ShopDao {

    /**
     * 查询列表
     *
     * @param shopPageParam  参数对象
     * @return  列表
     */
    List<Shop> listShop(ShopPageParam shopPageParam);

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    Shop getShop(@Param("id") Long id);

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
    int deleteShop(@Param("id") Long id);
}