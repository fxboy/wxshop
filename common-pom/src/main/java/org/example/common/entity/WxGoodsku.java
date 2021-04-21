package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:23
 */
public class WxGoodsku implements Serializable {
    private static final long serialVersionUID = 468408258076433254L;
    
    private Integer goodskuId;
    /**
    * 展示图片
    */
    private String goodskuImg;
    /**
    * 规格配置 （规格id）sku表的字段的id，用,分割
    */
    private String goodskuSku;
    /**
    * 价格
    */
    private Double goodskuPrice;
    /**
    * 库存数量
    */
    private Integer goodskuCount;

        
    public Integer getGoodskuId() {
        return goodskuId;
    }

    public void setGoodskuId(Integer goodskuId) {
        this.goodskuId = goodskuId;
    }
        
    public String getGoodskuImg() {
        return goodskuImg;
    }

    public void setGoodskuImg(String goodskuImg) {
        this.goodskuImg = goodskuImg;
    }
        
    public String getGoodskuSku() {
        return goodskuSku;
    }

    public void setGoodskuSku(String goodskuSku) {
        this.goodskuSku = goodskuSku;
    }
        
    public Double getGoodskuPrice() {
        return goodskuPrice;
    }

    public void setGoodskuPrice(Double goodskuPrice) {
        this.goodskuPrice = goodskuPrice;
    }
        
    public Integer getGoodskuCount() {
        return goodskuCount;
    }

    public void setGoodskuCount(Integer goodskuCount) {
        this.goodskuCount = goodskuCount;
    }

}