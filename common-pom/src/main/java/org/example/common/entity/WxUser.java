package org.example.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:27
 */
public class WxUser implements Serializable {
    private static final long serialVersionUID = 287773393350445320L;
    
    private Integer userId;
    /**
    * 微信昵称
    */
    private String userName;
    /**
    * 手机号
    */
    private String userPhone;
    /**
    * 微信openid
    */
    private String userWx;
    /**
    * 微信头像
    */
    private String userAvatar;
    /**
    * 注册时间
    */
    private Date userRegtime;
    /**
    * 默认地址
    */
    private Integer userDefaultAddress;

        
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
        
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
        
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
        
    public String getUserWx() {
        return userWx;
    }

    public void setUserWx(String userWx) {
        this.userWx = userWx;
    }
        
    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
        
    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }
        
    public Integer getUserDefaultAddress() {
        return userDefaultAddress;
    }

    public void setUserDefaultAddress(Integer userDefaultAddress) {
        this.userDefaultAddress = userDefaultAddress;
    }

}