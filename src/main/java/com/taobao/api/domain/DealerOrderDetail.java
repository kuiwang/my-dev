package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 采购申请/经销采购单中的商品明细
 *
 * @author auto create
 * @since 1.0, null
 */
public class DealerOrderDetail extends TaobaoObject {

    private static final long serialVersionUID = 3219694788611487573L;

    /**
     * 经销采购单明细id
     */
    @ApiField("dealer_detail_id")
    private Long dealerDetailId;

    /**
     * 经销采购单编号
     */
    @ApiField("dealer_order_id")
    private Long dealerOrderId;

    /**
     * 最终价格(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    @ApiField("final_price")
    private String finalPrice;

    /**
     * 该条明细是否已删除。true：已删除；false：未删除。
     */
    @ApiField("is_deleted")
    private Boolean isDeleted;

    /**
     * 原始价格(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    @ApiField("original_price")
    private String originalPrice;

    /**
     * 金额小计(采购数量乘以最终价格。精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    @ApiField("price_count")
    private String priceCount;

    /**
     * 产品id
     */
    @ApiField("product_id")
    private Long productId;

    /**
     * 产品标题
     */
    @ApiField("product_title")
    private String productTitle;

    /**
     * 采购数量
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * sku id
     */
    @ApiField("sku_id")
    private Long skuId;

    /**
     * 商家编码，是sku则为sku的商家编码，否则是产品的商家编码
     */
    @ApiField("sku_number")
    private String skuNumber;

    /**
     * 产品规格
     */
    @ApiField("sku_spec")
    private String skuSpec;

    /**
     * 产品快照url
     */
    @ApiField("snapshot_url")
    private String snapshotUrl;

    public Long getDealerDetailId() {
        return this.dealerDetailId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public String getFinalPrice() {
        return this.finalPrice;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public String getPriceCount() {
        return this.priceCount;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public String getSkuSpec() {
        return this.skuSpec;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setDealerDetailId(Long dealerDetailId) {
        this.dealerDetailId = dealerDetailId;
    }

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setPriceCount(String priceCount) {
        this.priceCount = priceCount;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public void setSkuSpec(String skuSpec) {
        this.skuSpec = skuSpec;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

}
