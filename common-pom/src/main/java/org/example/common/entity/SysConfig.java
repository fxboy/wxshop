package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:19
 */
public class SysConfig implements Serializable {
    private static final long serialVersionUID = -26174680365977271L;
    
    private Integer sysId;
    /**
    * 所选店铺信息
    */
    private String sysShop;
    /**
    * 占用
    */
    private String sysTemp;

        
    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }
        
    public String getSysShop() {
        return sysShop;
    }

    public void setSysShop(String sysShop) {
        this.sysShop = sysShop;
    }
        
    public String getSysTemp() {
        return sysTemp;
    }

    public void setSysTemp(String sysTemp) {
        this.sysTemp = sysTemp;
    }

}