package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * sku价格
 *
 * @author auto create
 * @since 1.0, null
 */
public class SkuPriceItem extends TaobaoObject {

    private static final long serialVersionUID = 6666929138349135918L;

    /**
     * sku一口价
     */
    @ApiField("price")
    private PriceUnit price;

    /**
     * sku促销价
     */
    @ApiField("promotion_price")
    private PriceUnit promotionPrice;

    /**
     * skuId
     */
    @ApiField("sku_id")
    private String skuId;

    public PriceUnit getPrice() {
        return this.price;
    }

    public void setPrice(PriceUnit price) {
        this.price = price;
    }

    public PriceUnit getPromotionPrice() {
        return this.promotionPrice;
    }

    public void setPromotionPrice(PriceUnit promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

}
