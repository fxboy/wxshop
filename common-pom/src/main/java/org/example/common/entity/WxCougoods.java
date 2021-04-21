package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:22
 */
public class WxCougoods implements Serializable {
    private static final long serialVersionUID = -31652729024039374L;
    /**
    * 商品直减或满减要绑定的商品
    */
    private Integer cougoodsId;
    /**
    * 绑定商品id
    */
    private Integer goodsId;
    /**
    * 绑定优惠券
    */
    private Integer couponId;

        
    public Integer getCougoodsId() {
        return cougoodsId;
    }

    public void setCougoodsId(Integer cougoodsId) {
        this.cougoodsId = cougoodsId;
    }
        
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
        
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

}