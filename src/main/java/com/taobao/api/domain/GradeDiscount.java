package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 等级折扣数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class GradeDiscount extends TaobaoObject {

    private static final long serialVersionUID = 6865281269742551614L;

    /**
     * 等级ID或分销商ID
     */
    @ApiField("discount_id")
    private Long discountId;

    /**
     * 折扣类型：1-等级、2-分销商折扣
     */
    @ApiField("discount_type")
    private Long discountType;

    /**
     * 采购价格
     */
    @ApiField("price")
    private String price;

    /**
     * skuId
     */
    @ApiField("sku_id")
    private Long skuId;

    /**
     * 模式：1-代销、2-经销
     */
    @ApiField("trade_type")
    private Long tradeType;

    public Long getDiscountId() {
        return this.discountId;
    }

    public Long getDiscountType() {
        return this.discountType;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getTradeType() {
        return this.tradeType;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public void setDiscountType(Long discountType) {
        this.discountType = discountType;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setTradeType(Long tradeType) {
        this.tradeType = tradeType;
    }

}
