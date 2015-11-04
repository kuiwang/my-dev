package com.scott.dev.taobao.api.shop.domain;

public class ShopScore {

    /*
     * 商品描述评分
     */
    private String itemScore;

    /*
     * 服务态度评分
     */
    private String serviceScore;

    /*
     * 发货速度评分
     */
    private String deliveryScore;

    public String getItemScore() {
        return itemScore;
    }

    public void setItemScore(String itemScore) {
        this.itemScore = itemScore;
    }

    public String getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(String serviceScore) {
        this.serviceScore = serviceScore;
    }

    public String getDeliveryScore() {
        return deliveryScore;
    }

    public void setDeliveryScore(String deliveryScore) {
        this.deliveryScore = deliveryScore;
    }
}
