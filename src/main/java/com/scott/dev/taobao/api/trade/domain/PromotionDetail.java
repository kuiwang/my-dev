package com.scott.dev.taobao.api.trade.domain;

import com.scott.dev.taobao.api.Price;

/*
 * 交易的优惠信息详情
 */
public class PromotionDetail {

    /*
     * 优惠金额（免运费、限时打折时为空）,单位：元
     */
    private Price discount_fee;

    /*
     * 赠品的宝贝id
     */
    private String giftItemId;

    /*
     * 满就送商品时，所送商品的名称
     */
    private String giftItemName;

    /*
     * 满就送礼物的礼物数量
     */
    private String giftItemNum;

    /*
     * 交易的主订单或子订单号
     */
    private Number id;

    /*
     * 优惠活动的描述
     */
    private String promotionDesc;

    /*
     * 优惠id，(由营销工具id、优惠活动id和优惠详情id组成，
     * 结构为：营销工具id-优惠活动id_优惠详情id，如mjs-123024_211143）
     */
    private String promotionId;

    /*
     * 优惠信息的名称
     */
    private String promotionName;

    public Price getDiscount_fee() {
        return discount_fee;
    }

    public String getGiftItemId() {
        return giftItemId;
    }

    public String getGiftItemName() {
        return giftItemName;
    }

    public String getGiftItemNum() {
        return giftItemNum;
    }

    public Number getId() {
        return id;
    }

    public String getPromotionDesc() {
        return promotionDesc;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setDiscount_fee(Price discount_fee) {
        this.discount_fee = discount_fee;
    }

    public void setGiftItemId(String giftItemId) {
        this.giftItemId = giftItemId;
    }

    public void setGiftItemName(String giftItemName) {
        this.giftItemName = giftItemName;
    }

    public void setGiftItemNum(String giftItemNum) {
        this.giftItemNum = giftItemNum;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

}
