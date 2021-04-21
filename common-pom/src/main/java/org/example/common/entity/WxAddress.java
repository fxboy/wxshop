package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:21
 */
public class WxAddress implements Serializable {
    private static final long serialVersionUID = -96829442573288860L;
    
    private Integer addressId;
    /**
    * 姓名
    */
    private String addressName;
    /**
    * 手机号码
    */
    private String addressPhone;
    /**
    * 地区信息
    */
    private String addressRegion;
    /**
    * 详细地址
    */
    private String addressDetailed;
    /**
    * 邮政编码
    */
    private String addressPostalCode;
    /**
    * 所属用户
    */
    private Integer userId;

        
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
        
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
        
    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }
        
    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }
        
    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }
        
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }
        
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}