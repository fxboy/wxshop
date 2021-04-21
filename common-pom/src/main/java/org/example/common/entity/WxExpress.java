package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:22
 */
public class WxExpress implements Serializable {
    private static final long serialVersionUID = -22922607520147128L;
    
    private Integer expressId;
    /**
    * 快递代码  yuantong sf，快递接口要的代码
    */
    private String expressCode;
    /**
    * 快递公司的logo
    */
    private String expressLogo;
    /**
    * 快递公司名称
    */
    private String expressName;
    /**
    * 启用状态
    */
    private Integer expressStatus;

        
    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }
        
    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }
        
    public String getExpressLogo() {
        return expressLogo;
    }

    public void setExpressLogo(String expressLogo) {
        this.expressLogo = expressLogo;
    }
        
    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }
        
    public Integer getExpressStatus() {
        return expressStatus;
    }

    public void setExpressStatus(Integer expressStatus) {
        this.expressStatus = expressStatus;
    }

}