package org.example.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:26
 */
public class WxSeckill implements Serializable {
    private static final long serialVersionUID = -68297103134113229L;
    
    private Integer seckillId;
    
    private Integer goodsId;
    /**
    * 秒杀价格 减多少钱
    */
    private Double goodsPrice;
    /**
    * 秒杀数量（如果从普通购买中买的话，也得减去这个数量）
    */
    private Integer goodsCount;
    /**
    * 开始时间
    */
    private Date seckillStart;
    /**
    * 结束时间
    */
    private Date seckillEnd;
    /**
    * 0.提前结束 1. 正常秒杀
    */
    private Integer seckillStatus;

        
    public Integer getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Integer seckillId) {
        this.seckillId = seckillId;
    }
        
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
        
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
        
    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }
        
    public Date getSeckillStart() {
        return seckillStart;
    }

    public void setSeckillStart(Date seckillStart) {
        this.seckillStart = seckillStart;
    }
        
    public Date getSeckillEnd() {
        return seckillEnd;
    }

    public void setSeckillEnd(Date seckillEnd) {
        this.seckillEnd = seckillEnd;
    }
        
    public Integer getSeckillStatus() {
        return seckillStatus;
    }

    public void setSeckillStatus(Integer seckillStatus) {
        this.seckillStatus = seckillStatus;
    }

}