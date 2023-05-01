package com.chengxuunion.generator.business.shop.service.impl;

import com.chengxuunion.generator.business.shop.service.ShopService;
import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

import com.chengxuunion.generator.business.shop.model.Shop;
import com.chengxuunion.generator.business.shop.dao.ShopDao;
import com.chengxuunion.generator.business.shop.model.request.ShopPageParam;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public PageResult<Shop> listShopPage(ShopPageParam shopPageParam) {
        PageHelper.startPage(shopPageParam.getPageNum() , shopPageParam.getPageSize());
        List<Shop> shopList = shopDao.listShop(shopPageParam);
        //得到分页的结果对象
        PageInfo<Shop> pageInfo = new PageInfo<>(shopList);

        return new PageResult<Shop>(shopPageParam, pageInfo.getTotal(), shopList);
    }

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    @Override
    public Shop getShop(Long id) {
        return shopDao.getShop(id);
    }

    /**
     * 保存对象
     *
     * @param shop 对象
     * @return  保存影响的记录数
     */
    @Override
    public int saveShop(Shop shop) {
        shop.setId(IdGenerator.getInstance().nextId());
        return shopDao.saveShop(shop);
    }

    /**
     * 更新对象
     *
     * @param shop 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updateShop(Shop shop) {
        return  shopDao.updateShop(shop);
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    @Override
    public int deleteShop(Long id) {
        return  shopDao.deleteShop(id);
    }

}

