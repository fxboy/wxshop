package org.example.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:25
 */
public class WxOrder implements Serializable {
    private static final long serialVersionUID = 553510346804750130L;
    
    private Integer orderId;
    /**
    * 订单编号
    */
    private Integer orderNo;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 收货地址
    */
    private Integer addressId;
    /**
    * 配送状态id
    */
    private Integer orderFreight;
    /**
    * 所用优惠券
    */
    private Integer couponId;
    /**
    * 创建日期
    */
    private Date orderCreate;
    /**
    * 修改日期
    */
    private Date orderUpdate;
    /**
    * 0.待支付 1.已付款 2.配送中  3.已取消 4.交易成功 5.退货成功
    */
    private Integer orderStatus;
    /**
    * 支付类型
    */
    private Integer payType;

        
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
        
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
        
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
        
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
        
    public Integer getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(Integer orderFreight) {
        this.orderFreight = orderFreight;
    }
        
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
        
    public Date getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Date orderCreate) {
        this.orderCreate = orderCreate;
    }
        
    public Date getOrderUpdate() {
        return orderUpdate;
    }

    public void setOrderUpdate(Date orderUpdate) {
        this.orderUpdate = orderUpdate;
    }
        
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
        
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

}