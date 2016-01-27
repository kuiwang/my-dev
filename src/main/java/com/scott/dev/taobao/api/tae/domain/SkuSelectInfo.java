package com.scott.dev.taobao.api.tae.domain;

public class SkuSelectInfo {

    //外部ID
    private String outerId;

    //sku id
    private Number skuId;

    public String getOuterId() {
        return outerId;
    }

    public Number getSkuId() {
        return skuId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }
}
