package com.scott.dev.taobao.api.fenxiao.domain;

import com.scott.dev.taobao.api.Price;

//等级折扣数据结构
public class GradeDiscount {

    //等级ID或分销商ID
    private Number discountId;

    //折扣类型：1-等级、2-分销商折扣
    private Number discountType;

    //采购价格
    private Price price;

    private Number skuId;

    //模式：1-代销、2-经销
    private Number tradeType;

    public Number getDiscountId() {
        return discountId;
    }

    public Number getDiscountType() {
        return discountType;
    }

    public Price getPrice() {
        return price;
    }

    public Number getSkuId() {
        return skuId;
    }

    public Number getTradeType() {
        return tradeType;
    }

    public void setDiscountId(Number discountId) {
        this.discountId = discountId;
    }

    public void setDiscountType(Number discountType) {
        this.discountType = discountType;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public void setTradeType(Number tradeType) {
        this.tradeType = tradeType;
    }
}
