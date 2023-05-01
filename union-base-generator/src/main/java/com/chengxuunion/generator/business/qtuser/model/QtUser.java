package com.chengxuunion.generator.business.qtuser.model;

import java.util.Date;

/**
 * @Author 
 * @Description:    
 * @Date:创建时间: 
 * @Modified By:
 */
public class QtUser {

    
    /**
     * ID
     * 是否允许为空：NO
     */
    private Long id;

    /**
     * 昵称
     * 是否允许为空：NO
     */
    private String nickname;

    /**
     * 手机号
     * 是否允许为空：YES
     */
    private String phone;

    /**
     * 头像
     * 是否允许为空：YES
     */
    private String avatar;

    /**
     * 微信openid
     * 是否允许为空：YES
     */
    private String openid;

    /**
     * 密码
     * 是否允许为空：YES
     */
    private String pwd;

    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    

}