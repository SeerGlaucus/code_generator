package com.chengxuunion.generator.business.shoporder.model;

import java.util.Date;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class ShopOrder {

    
    /**
     * ID
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 主单id
     * 是否允许为空：YES
     */
    private Long parentId;

    /**
     * 店铺id
     * 是否允许为空：NO
     */
    private Long shopId;

    /**
     * 房间id
     * 是否允许为空：NO
     */
    private Long roomId;

    /**
     * 用户id
     * 是否允许为空：NO
     */
    private Long userId;

    /**
     * 预定开始时间
     * 是否允许为空：YES
     */
    private Date bookStartTime;

    /**
     * 预定结束时间
     * 是否允许为空：YES
     */
    private Date bookEndTime;

    /**
     * 0 - 普通订单， 10 - 续费单
     * 是否允许为空：NO
     */
    private Integer orderType;

    /**
     * 0 - 未支付， 10 - 支付完成，30 - 已取消
     * 是否允许为空：NO
     */
    private Integer orderStatus;

    /**
     * 下单时间
     * 是否允许为空：YES
     */
    private Date createTime;

    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
    }

    public Date getBookEndTime() {
        return bookEndTime;
    }

    public void setBookEndTime(Date bookEndTime) {
        this.bookEndTime = bookEndTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    

}