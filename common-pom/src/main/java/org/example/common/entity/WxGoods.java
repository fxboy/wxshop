package org.example.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:23
 */
public class WxGoods implements Serializable {
    private static final long serialVersionUID = -47468137562505715L;
    
    private Integer goodsId;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 商品预览图片
    */
    private String goodsImgs;
    /**
    * 商品详情
    */
    private Object goodsInfo;
    /**
    * 限购规则，为0不启用
    */
    private Integer goodsQuota;
    /**
    * 库存
    */
    private String goodsStock;
    /**
    * 价格
    */
    private Double goodsPrice;
    /**
    * 是否启用规格，如果启用 库存和价格失效，启用goodsku表内的数据，库存为sku库存总数，价格为sku最小
    */
    private Integer goodsSku;
    /**
    * 是否展示 0.下架 1.上架
    */
    private Integer goodsStatus;
    /**
    * 邮费模板
    */
    private Integer goodsExconfig;
    /**
    * 创建时间
    */
    private Date goodsCreate;
    /**
    * 修改时间
    */
    private Date goodsUpdate;

        
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
        
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
        
    public String getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(String goodsImgs) {
        this.goodsImgs = goodsImgs;
    }
        
    public Object getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Object goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
        
    public Integer getGoodsQuota() {
        return goodsQuota;
    }

    public void setGoodsQuota(Integer goodsQuota) {
        this.goodsQuota = goodsQuota;
    }
        
    public String getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(String goodsStock) {
        this.goodsStock = goodsStock;
    }
        
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
        
    public Integer getGoodsSku() {
        return goodsSku;
    }

    public void setGoodsSku(Integer goodsSku) {
        this.goodsSku = goodsSku;
    }
        
    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }
        
    public Integer getGoodsExconfig() {
        return goodsExconfig;
    }

    public void setGoodsExconfig(Integer goodsExconfig) {
        this.goodsExconfig = goodsExconfig;
    }
        
    public Date getGoodsCreate() {
        return goodsCreate;
    }

    public void setGoodsCreate(Date goodsCreate) {
        this.goodsCreate = goodsCreate;
    }
        
    public Date getGoodsUpdate() {
        return goodsUpdate;
    }

    public void setGoodsUpdate(Date goodsUpdate) {
        this.goodsUpdate = goodsUpdate;
    }

}