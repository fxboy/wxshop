package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:22
 */
public class WxExconfig implements Serializable {
    private static final long serialVersionUID = -94529583841934827L;
    /**
    * 商品计费模板
    */
    private Integer exconfigId;
    /**
    * 运费
    */
    private String exconfigMoney;
    /**
    * 发货地址
    */
    private String exconfigAddress;
    /**
    * 模板名称
    */
    private String exconfigName;

        
    public Integer getExconfigId() {
        return exconfigId;
    }

    public void setExconfigId(Integer exconfigId) {
        this.exconfigId = exconfigId;
    }
        
    public String getExconfigMoney() {
        return exconfigMoney;
    }

    public void setExconfigMoney(String exconfigMoney) {
        this.exconfigMoney = exconfigMoney;
    }
        
    public String getExconfigAddress() {
        return exconfigAddress;
    }

    public void setExconfigAddress(String exconfigAddress) {
        this.exconfigAddress = exconfigAddress;
    }
        
    public String getExconfigName() {
        return exconfigName;
    }

    public void setExconfigName(String exconfigName) {
        this.exconfigName = exconfigName;
    }

}