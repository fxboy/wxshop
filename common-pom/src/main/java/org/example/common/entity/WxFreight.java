package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:22
 */
public class WxFreight implements Serializable {
    private static final long serialVersionUID = 916577894491808345L;
    
    private Integer freightId;
    /**
    * 快递公司
    */
    private String expressType;
    /**
    * 快递单号
    */
    private Integer freightNo;
    /**
    * 创建时间
    */
    private String freightCreate;
    /**
    * 0.已通知取件 1.运送途中 2.已签收 3.拒签 
    */
    private Integer freightStatus;

        
    public Integer getFreightId() {
        return freightId;
    }

    public void setFreightId(Integer freightId) {
        this.freightId = freightId;
    }
        
    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }
        
    public Integer getFreightNo() {
        return freightNo;
    }

    public void setFreightNo(Integer freightNo) {
        this.freightNo = freightNo;
    }
        
    public String getFreightCreate() {
        return freightCreate;
    }

    public void setFreightCreate(String freightCreate) {
        this.freightCreate = freightCreate;
    }
        
    public Integer getFreightStatus() {
        return freightStatus;
    }

    public void setFreightStatus(Integer freightStatus) {
        this.freightStatus = freightStatus;
    }

}