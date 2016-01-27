package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 单品级优惠信息
 */
public class PromotionInItem {

    /*
     * 优惠描述
     */
    private String desc;

    /*
     * 优惠结束时间
     */
    private Date endTime;

    /*
     * 优惠折后价格
     */
    private Price itemPromoPrice;

    /*
     * 优惠展示名称
     */
    private String name;

    /*
     * 需要支付附加物，显示为+xxx。如：+20淘金币
     */
    private String otherNeed;

    /*
     * 赠送东西。如：送10商城积分
     */
    private String otherSend;

    /*
     * idValue的值
     */
    private String promotionId;

    /*
     * sku价格对应的id（保证二者顺序相同）
     */
    private String[] skuIdList;

    /*
     * sku价格列表
     */
    private Price skuPriceList;

    /*
     * 优惠开始时间
     */
    private Date startTime;

    public String getDesc() {
        return desc;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Price getItemPromoPrice() {
        return itemPromoPrice;
    }

    public String getName() {
        return name;
    }

    public String getOtherNeed() {
        return otherNeed;
    }

    public String getOtherSend() {
        return otherSend;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public String[] getSkuIdList() {
        return skuIdList;
    }

    public Price getSkuPriceList() {
        return skuPriceList;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setItemPromoPrice(Price itemPromoPrice) {
        this.itemPromoPrice = itemPromoPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherNeed(String otherNeed) {
        this.otherNeed = otherNeed;
    }

    public void setOtherSend(String otherSend) {
        this.otherSend = otherSend;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public void setSkuIdList(String[] skuIdList) {
        this.skuIdList = skuIdList;
    }

    public void setSkuPriceList(Price skuPriceList) {
        this.skuPriceList = skuPriceList;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
