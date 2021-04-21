package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:26
 */
public class WxSkuconfig implements Serializable {
    private static final long serialVersionUID = 375500513840762468L;
    
    private Integer skuId;
    /**
    * 所属分类
    */
    private Integer classifyId;
    /**
    * 所填写值的类型
    */
    private String skuType;
    /**
    * 标题名称
    */
    private String skuName;

        
    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }
        
    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }
        
    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }
        
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

}