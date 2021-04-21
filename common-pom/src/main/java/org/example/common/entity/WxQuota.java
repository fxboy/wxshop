package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:26
 */
public class WxQuota implements Serializable {
    private static final long serialVersionUID = -94455407931508368L;
    
    private Integer quotaId;
    /**
    * 0.每天 1.每周 2.每月 4.永久
    */
    private Integer quotaTime;
    /**
    * 可购买数量
    */
    private Integer quotaCount;

        
    public Integer getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(Integer quotaId) {
        this.quotaId = quotaId;
    }
        
    public Integer getQuotaTime() {
        return quotaTime;
    }

    public void setQuotaTime(Integer quotaTime) {
        this.quotaTime = quotaTime;
    }
        
    public Integer getQuotaCount() {
        return quotaCount;
    }

    public void setQuotaCount(Integer quotaCount) {
        this.quotaCount = quotaCount;
    }

}