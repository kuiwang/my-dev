package com.scott.dev.taobao.api.fenxiao.domain;

/**
 * 采购申请/经销采购单中的商品明细
 */
public class DealerOrderDetail {

    /**
     * 经销采购单明细id
     */
    private Long dealerDetailId;

    /**
     * 经销采购单编号
     */
    private Long dealerOrderId;

    /**
     * 最终价格(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private String finalPrice;

    /**
     * 该条明细是否已删除。true：已删除；false：未删除。
     */
    private Boolean isDeleted;

    /**
     * 原始价格(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private String originalPrice;

    /**
     * 金额小计(采购数量乘以最终价格。精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private String priceCount;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 产品标题
     */
    private String productTitle;

    /**
     * 采购数量
     */
    private Long quantity;

    /**
     * sku id
     */
    private Long skuId;

    /**
     * 商家编码，是sku则为sku的商家编码，否则是产品的商家编码
     */
    private String skuNumber;

    /**
     * 产品规格
     */
    private String skuSpec;

    /**
     * 产品快照url
     */
    private String snapshotUrl;

    public Long getDealerDetailId() {
        return this.dealerDetailId;
    }

    public void setDealerDetailId(Long dealerDetailId) {
        this.dealerDetailId = dealerDetailId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public String getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPriceCount() {
        return this.priceCount;
    }

    public void setPriceCount(String priceCount) {
        this.priceCount = priceCount;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getSkuSpec() {
        return this.skuSpec;
    }

    public void setSkuSpec(String skuSpec) {
        this.skuSpec = skuSpec;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

}
