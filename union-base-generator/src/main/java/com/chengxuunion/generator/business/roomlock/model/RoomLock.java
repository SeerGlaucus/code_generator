package com.chengxuunion.generator.business.roomlock.model;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class RoomLock {


    /**
     * 房间id
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 房间id
     * 是否允许为空：NO
     */
    private Long roomId;

    /**
     * 锁定日期
     * 是否允许为空：NO
     */
    private Integer lockDate;

    /**
     * 锁定槽
     * 是否允许为空：NO
     */
    private Integer lockSlot;

    /**
     * 店铺id
     * 是否允许为空：NO
     */
    private Long shopId;

    /**
     * 订单id
     * 是否允许为空：NO
     */
    private Long orderId;

    

    
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getLockDate() {
        return lockDate;
    }

    public void setLockDate(Integer lockDate) {
        this.lockDate = lockDate;
    }

    public Integer getLockSlot() {
        return lockSlot;
    }

    public void setLockSlot(Integer lockSlot) {
        this.lockSlot = lockSlot;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}