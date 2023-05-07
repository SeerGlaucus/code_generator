package com.chengxuunion.generator.business.shop.model;

import java.util.Date;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class Shop {

    
    /**
     * ID
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 店名
     * 是否允许为空：NO
     */
    private String shopName;

    /**
     * 主图
     * 是否允许为空：NO
     */
    private String mainPic;

    /**
     * 地址
     * 是否允许为空：NO
     */
    private String address;

    /**
     * 经纬度
     * 是否允许为空：YES
     */
    private String coordinate;

    /**
     * 电话号
     * 是否允许为空：NO
     */
    private String phone;

    /**
     * 营业开始时间
     * 是否允许为空：NO
     */
    private Integer bizStartTime;

    /**
     * 营业结束时间
     * 是否允许为空：NO
     */
    private Integer bizEndTime;

    /**
     * 包间总数
     * 是否允许为空：NO
     */
    private Integer roomTotal;

    /**
     * 0 - 营业中， 10 - 已关店， 20 - 暂停营业
     * 是否允许为空：NO
     */
    private Integer shopStatus;

    /**
     * 0 - 不可搜索， 20 - 可搜索
     * 是否允许为空：NO
     */
    private Integer shopSearchable;

    /**
     * 店主名
     * 是否允许为空：YES
     */
    private String shopOwnerName;

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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMainPic() {
        return mainPic;
    }

    public void setMainPic(String mainPic) {
        this.mainPic = mainPic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getBizStartTime() {
        return bizStartTime;
    }

    public void setBizStartTime(Integer bizStartTime) {
        this.bizStartTime = bizStartTime;
    }

    public Integer getBizEndTime() {
        return bizEndTime;
    }

    public void setBizEndTime(Integer bizEndTime) {
        this.bizEndTime = bizEndTime;
    }

    public Integer getRoomTotal() {
        return roomTotal;
    }

    public void setRoomTotal(Integer roomTotal) {
        this.roomTotal = roomTotal;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Integer getShopSearchable() {
        return shopSearchable;
    }

    public void setShopSearchable(Integer shopSearchable) {
        this.shopSearchable = shopSearchable;
    }

    public String getShopOwnerName() {
        return shopOwnerName;
    }

    public void setShopOwnerName(String shopOwnerName) {
        this.shopOwnerName = shopOwnerName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}