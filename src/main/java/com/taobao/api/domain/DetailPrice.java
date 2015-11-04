package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品价格和促销价格
 *
 * @author auto create
 * @since 1.0, null
 */
public class DetailPrice extends TaobaoObject {

    private static final long serialVersionUID = 4348691572325722499L;

    /**
     * 商品价格
     */
    @ApiField("price")
    private PriceUnit price;

    /**
     * 商品促销价格
     */
    @ApiField("promotion_price")
    private PriceUnit promotionPrice;

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

}
