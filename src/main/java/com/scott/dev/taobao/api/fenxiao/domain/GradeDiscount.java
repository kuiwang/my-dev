package com.scott.dev.taobao.api.fenxiao.domain;

import com.scott.dev.taobao.api.Price;

//等级折扣数据结构
public class GradeDiscount {

    private Number skuId;

    //模式：1-代销、2-经销
    private Number tradeType;

    //折扣类型：1-等级、2-分销商折扣
    private Number discountType;

    //等级ID或分销商ID
    private Number discountId;

    //采购价格
    private Price price;

    public Number getSkuId() {
        return skuId;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public Number getTradeType() {
        return tradeType;
    }

    public void setTradeType(Number tradeType) {
        this.tradeType = tradeType;
    }

    public Number getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Number discountType) {
        this.discountType = discountType;
    }

    public Number getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Number discountId) {
        this.discountId = discountId;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
