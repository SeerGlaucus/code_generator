package com.chengxuunion.generator.business.payorder.service.impl;

import com.chengxuunion.util.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chengxuunion.generator.common.model.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Date;

import com.chengxuunion.generator.business.payorder.model.PayOrder;
import com.chengxuunion.generator.business.payorder.service.PayOrderService;
import com.chengxuunion.generator.business.payorder.dao.PayOrderDao;
import com.chengxuunion.generator.business.payorder.model.request.PayOrderPageParam;


/**
 * @Author 
 * @Description:    服务实现
 * @Date:创建时间: 
 * @Modified By:
 */
@Service
public class PayOrderServiceImpl implements PayOrderService {

    @Autowired
    private PayOrderDao payOrderDao;

    @Override
    public PageResult<PayOrder> listPayOrderPage(PayOrderPageParam payOrderPageParam) {
        PageHelper.startPage(payOrderPageParam.getPageNum() , payOrderPageParam.getPageSize());
        List<PayOrder> payOrderList = payOrderDao.listPayOrder(payOrderPageParam);
        //得到分页的结果对象
        PageInfo<PayOrder> pageInfo = new PageInfo<>(payOrderList);

        return new PageResult<PayOrder>(payOrderPageParam, pageInfo.getTotal(), payOrderList);
    }

    /**
     * 根据主键查询单个对象
     *
     * @param id 主键
     * @return  单个对象
     */
    @Override
    public PayOrder getPayOrder(Long id) {
        return payOrderDao.getPayOrder(id);
    }

    /**
     * 保存对象
     *
     * @param payOrder 对象
     * @return  保存影响的记录数
     */
    @Override
    public int savePayOrder(PayOrder payOrder) {
        payOrder.setId(IdGenerator.getInstance().nextId());
        return payOrderDao.savePayOrder(payOrder);
    }

    /**
     * 更新对象
     *
     * @param payOrder 对象
     * @return  更新影响的记录数
     */
    @Override
    public int updatePayOrder(PayOrder payOrder) {
        return  payOrderDao.updatePayOrder(payOrder);
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return  删除影响的记录数
     */
    @Override
    public int deletePayOrder(Long id) {
        return  payOrderDao.deletePayOrder(id);
    }

}

