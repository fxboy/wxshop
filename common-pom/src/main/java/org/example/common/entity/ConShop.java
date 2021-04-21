package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:17
 */
public class ConShop implements Serializable {
    private static final long serialVersionUID = -23019985889222223L;
    /**
    * 店铺信息
    */
    private Integer shopId;
    /**
    * 店铺logo
    */
    private String shopLogo;
    /**
    * 店铺名称
    */
    private String shopName;
    /**
    * 店铺短名称
    */
    private String shopSname;
    /**
    * 店铺信息
    */
    private String shopInfo;
    /**
    * 商城状态 0.暂停营业
    */
    private Integer shopStatus;
    /**
    * 店铺idkey
    */
    private String shopAppid;

        
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
        
    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }
        
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
        
    public String getShopSname() {
        return shopSname;
    }

    public void setShopSname(String shopSname) {
        this.shopSname = shopSname;
    }
        
    public String getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(String shopInfo) {
        this.shopInfo = shopInfo;
    }
        
    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }
        
    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

}