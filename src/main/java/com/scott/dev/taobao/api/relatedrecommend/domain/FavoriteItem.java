package com.scott.dev.taobao.api.relatedrecommend.domain;

import com.scott.dev.taobao.api.Price;

/*
 * 推荐的关联商品
 */
public class FavoriteItem {

    /*
     * 商品名称
     */
    private String itemName;

    /*
     * 商品图片地址
     */
    private String itemPictrue;

    /*
     * 商品价格
     */
    private Price itemPrice;

    /*
     * 商品的详情页面地址
     */
    private String itemUrl;

    /*
     * 促销价格
     */
    private Price promotionPrice;

    /*
     *  商品销售次数
     */
    private Number sellCount;

    /*
     * 商品id（具有跟踪效果）代替原来的item_id
     */
    private String trackIid;

    public String getItemName() {
        return itemName;
    }

    public String getItemPictrue() {
        return itemPictrue;
    }

    public Price getItemPrice() {
        return itemPrice;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public Price getPromotionPrice() {
        return promotionPrice;
    }

    public Number getSellCount() {
        return sellCount;
    }

    public String getTrackIid() {
        return trackIid;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPictrue(String itemPictrue) {
        this.itemPictrue = itemPictrue;
    }

    public void setItemPrice(Price itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public void setPromotionPrice(Price promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setSellCount(Number sellCount) {
        this.sellCount = sellCount;
    }

    public void setTrackIid(String trackIid) {
        this.trackIid = trackIid;
    }

}
