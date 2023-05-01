package com.chengxuunion.generator.business.shoporder.service.impl;

import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Date;

import com.chengxuunion.generator.business.shoporder.model.ShopOrder;
import com.chengxuunion.generator.business.shoporder.service.ShopOrderService;
import com.chengxuunion.generator.business.shoporder.dao.ShopOrderDao;
import com.chengxuunion.generator.business.shoporder.model.request.ShopOrderPageParam;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class ShopOrderServiceImpl implements ShopOrderService {

    @Autowired
    private ShopOrderDao shopOrderDao;

    @Override
    public PageResult<ShopOrder> listShopOrderPage(ShopOrderPageParam shopOrderPageParam) {
        PageHelper.startPage(shopOrderPageParam.getPageNum() , shopOrderPageParam.getPageSize());
        List<ShopOrder> shopOrderList = shopOrderDao.listShopOrder(shopOrderPageParam);
        //得到分页的结果对象
        PageInfo<ShopOrder> pageInfo = new PageInfo<>(shopOrderList);

        return new PageResult<ShopOrder>(shopOrderPageParam, pageInfo.getTotal(), shopOrderList);
    }

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    @Override
    public ShopOrder getShopOrder(Long id) {
        return shopOrderDao.getShopOrder(id);
    }

    /**
     * 保存对象
     *
     * @param shopOrder 对象
     * @return  保存影响的记录数
     */
    @Override
    public int saveShopOrder(ShopOrder shopOrder) {
        shopOrder.setId(IdGenerator.getInstance().nextId());
        return shopOrderDao.saveShopOrder(shopOrder);
    }

    /**
     * 更新对象
     *
     * @param shopOrder 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updateShopOrder(ShopOrder shopOrder) {
        return  shopOrderDao.updateShopOrder(shopOrder);
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    @Override
    public int deleteShopOrder(Long id) {
        return  shopOrderDao.deleteShopOrder(id);
    }

}

