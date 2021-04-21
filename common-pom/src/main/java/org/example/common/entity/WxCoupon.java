package org.example.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:22
 */
public class WxCoupon implements Serializable {
    private static final long serialVersionUID = 432027045234018109L;
    
    private Integer couponId;
    /**
    * 优惠价格（如果是折扣卷此处填写打折的折数）
    */
    private Double couponPrice;
    /**
    * 0.全店直减 1.全店满减 2.全店折扣 3.商品直减 4.商品折扣
    */
    private Integer couponRule;
    /**
    * 如果为 rule为1，满足价格后可以减多少钱
    */
    private Double couponSatisfyPrice;
    /**
    * 如果为 rule为1，则满足这个价格才能使用
    */
    private Double couponSatisfy;
    /**
    * 券名称
    */
    private String couponName;
    /**
    * 创建时间
    */
    private Date couponCreate;
    /**
    * 开始领券时间
    */
    private Date couponStart;
    /**
    * 结束领券时间
    */
    private Date couponEnd;
    /**
    * 有效期天数
    */
    private Integer couponValidity;
    /**
    * 优惠券数量（每人限领）
    */
    private Integer couponQuota;
    /**
    * 发行数量
    */
    private Integer couponCount;

        
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
        
    public Double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(Double couponPrice) {
        this.couponPrice = couponPrice;
    }
        
    public Integer getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(Integer couponRule) {
        this.couponRule = couponRule;
    }
        
    public Double getCouponSatisfyPrice() {
        return couponSatisfyPrice;
    }

    public void setCouponSatisfyPrice(Double couponSatisfyPrice) {
        this.couponSatisfyPrice = couponSatisfyPrice;
    }
        
    public Double getCouponSatisfy() {
        return couponSatisfy;
    }

    public void setCouponSatisfy(Double couponSatisfy) {
        this.couponSatisfy = couponSatisfy;
    }
        
    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
        
    public Date getCouponCreate() {
        return couponCreate;
    }

    public void setCouponCreate(Date couponCreate) {
        this.couponCreate = couponCreate;
    }
        
    public Date getCouponStart() {
        return couponStart;
    }

    public void setCouponStart(Date couponStart) {
        this.couponStart = couponStart;
    }
        
    public Date getCouponEnd() {
        return couponEnd;
    }

    public void setCouponEnd(Date couponEnd) {
        this.couponEnd = couponEnd;
    }
        
    public Integer getCouponValidity() {
        return couponValidity;
    }

    public void setCouponValidity(Integer couponValidity) {
        this.couponValidity = couponValidity;
    }
        
    public Integer getCouponQuota() {
        return couponQuota;
    }

    public void setCouponQuota(Integer couponQuota) {
        this.couponQuota = couponQuota;
    }
        
    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

}