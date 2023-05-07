package com.chengxuunion.generator.business.room.model;

import java.util.Date;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class Room {

    
    /**
     * ID
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 店铺id
     * 是否允许为空：NO
     */
    private Long shopId;

    /**
     * 包间名
     * 是否允许为空：NO
     */
    private String roomName;

    /**
     * 主图
     * 是否允许为空：NO
     */
    private String mainPic;

    /**
     * 标签
     * 是否允许为空：YES
     */
    private String tags;

    /**
     * 起购价
     * 是否允许为空：YES
     */
    private Integer startBuyPrice;

    /**
     * 起购时长
     * 是否允许为空：YES
     */
    private Integer startBuyTime;

    /**
     * 单买、续费单位价格
     * 是否允许为空：YES
     */
    private Integer renewUnitPrice;

    /**
     * 单买、续费单位时长
     * 是否允许为空：YES
     */
    private Integer renewUnitTime;

    /**
     * 0 - 已上架， 10 - 未上架
     * 是否允许为空：NO
     */
    private Integer roomStatus;

    /**
     * 0 - 可搜索， 10 - 不可搜索
     * 是否允许为空：NO
     */
    private Integer roomSearchable;
    /**
     * 设备id
     * 是否允许为空：YES
     */
    private String deviceId;

    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getMainPic() {
        return mainPic;
    }

    public void setMainPic(String mainPic) {
        this.mainPic = mainPic;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getStartBuyPrice() {
        return startBuyPrice;
    }

    public void setStartBuyPrice(Integer startBuyPrice) {
        this.startBuyPrice = startBuyPrice;
    }

    public Integer getStartBuyTime() {
        return startBuyTime;
    }

    public void setStartBuyTime(Integer startBuyTime) {
        this.startBuyTime = startBuyTime;
    }

    public Integer getRenewUnitPrice() {
        return renewUnitPrice;
    }

    public void setRenewUnitPrice(Integer renewUnitPrice) {
        this.renewUnitPrice = renewUnitPrice;
    }

    public Integer getRenewUnitTime() {
        return renewUnitTime;
    }

    public void setRenewUnitTime(Integer renewUnitTime) {
        this.renewUnitTime = renewUnitTime;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Integer getRoomSearchable() {
        return roomSearchable;
    }

    public void setRoomSearchable(Integer roomSearchable) {
        this.roomSearchable = roomSearchable;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}