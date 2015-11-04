package com.scott.dev.taobao.api.fenxiao.domain;

//分销商品流量
public class DistributorItemFlow {

    //分销商商品UV。返回KV串中可能不足一周数据，如新上架商品、中间下架以及删除等操作导致
    private String itemUv;

    //分销商商品PV。返回KV串中可能不足一周数据，如新上架商品、中间下架以及删除等操作导致
    private String itemPv;

    ///产品ID
    private Number productId;

    public String getItemUv() {
        return itemUv;
    }

    public void setItemUv(String itemUv) {
        this.itemUv = itemUv;
    }

    public String getItemPv() {
        return itemPv;
    }

    public void setItemPv(String itemPv) {
        this.itemPv = itemPv;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }
}
