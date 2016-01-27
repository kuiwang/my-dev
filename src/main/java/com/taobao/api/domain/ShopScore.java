package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 店铺动态评分信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ShopScore extends TaobaoObject {

    private static final long serialVersionUID = 8382275954144534568L;

    /**
     * 发货速度评分
     */
    @ApiField("delivery_score")
    private String deliveryScore;

    /**
     * 商品描述评分
     */
    @ApiField("item_score")
    private String itemScore;

    /**
     * 服务态度评分
     */
    @ApiField("service_score")
    private String serviceScore;

    public String getDeliveryScore() {
        return this.deliveryScore;
    }

    public String getItemScore() {
        return this.itemScore;
    }

    public String getServiceScore() {
        return this.serviceScore;
    }

    public void setDeliveryScore(String deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    public void setItemScore(String itemScore) {
        this.itemScore = itemScore;
    }

    public void setServiceScore(String serviceScore) {
        this.serviceScore = serviceScore;
    }

}
