package com.chengxuunion.generator.business.payorder.model;

import java.util.Date;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class PayOrder {

    
    /**
     * ID
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 订单id
     * 是否允许为空：NO
     */
    private Long orderId;

    /**
     * 第三方支付id
     * 是否允许为空：YES
     */
    private String payId;

    /**
     * 支付时间
     * 是否允许为空：YES
     */
    private Date payTime;

    /**
     * 支付金额
     * 是否允许为空：NO
     */
    private Integer payMoney;

    /**
     * 0 - 未支付， 10 - 已支付， 20 - 申请退款中， 30 - 已退款
     * 是否允许为空：NO
     */
    private Integer payOrderStatus;

    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getPayOrderStatus() {
        return payOrderStatus;
    }

    public void setPayOrderStatus(Integer payOrderStatus) {
        this.payOrderStatus = payOrderStatus;
    }

    

}