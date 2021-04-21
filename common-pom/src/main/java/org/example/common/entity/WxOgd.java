package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:24
 */
public class WxOgd implements Serializable {
    private static final long serialVersionUID = -70477225298438077L;
    
    private Integer ogdId;
    /**
    * 商品id
    */
    private Integer goodsId;
    /**
    * 订单id
    */
    private Integer orderId;
    /**
    * 数量
    */
    private String ogdCount;
    /**
    * 快递信息id
    */
    private Integer ogdFreight;
    /**
    * 0.待发货 1.配送中 2.退款申请 3.已退款 4.待收货 5.已完成
    */
    private Integer ogdStatus;

        
    public Integer getOgdId() {
        return ogdId;
    }

    public void setOgdId(Integer ogdId) {
        this.ogdId = ogdId;
    }
        
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
        
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
        
    public String getOgdCount() {
        return ogdCount;
    }

    public void setOgdCount(String ogdCount) {
        this.ogdCount = ogdCount;
    }
        
    public Integer getOgdFreight() {
        return ogdFreight;
    }

    public void setOgdFreight(Integer ogdFreight) {
        this.ogdFreight = ogdFreight;
    }
        
    public Integer getOgdStatus() {
        return ogdStatus;
    }

    public void setOgdStatus(Integer ogdStatus) {
        this.ogdStatus = ogdStatus;
    }

}