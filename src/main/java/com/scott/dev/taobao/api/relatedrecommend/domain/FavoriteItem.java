package com.scott.dev.taobao.api.relatedrecommend.domain;

import com.scott.dev.taobao.api.Price;

/*
 * 推荐的关联商品
 */
public class FavoriteItem {

    /*
     * 促销价格
     */
    private Price promotionPrice;

    /*
     * 商品名称
     */
    private String itemName;

    /*
     * 商品价格
     */
    private Price itemPrice;

    /*
     * 商品图片地址
     */
    private String itemPictrue;

    /*
     * 商品的详情页面地址
     */
    private String itemUrl;

    /*
     *  商品销售次数
     */
    private Number sellCount;

    /*
     * 商品id（具有跟踪效果）代替原来的item_id
     */
    private String trackIid;

    public Price getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(Price promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Price getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Price itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemPictrue() {
        return itemPictrue;
    }

    public void setItemPictrue(String itemPictrue) {
        this.itemPictrue = itemPictrue;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public Number getSellCount() {
        return sellCount;
    }

    public void setSellCount(Number sellCount) {
        this.sellCount = sellCount;
    }

    public String getTrackIid() {
        return trackIid;
    }

    public void setTrackIid(String trackIid) {
        this.trackIid = trackIid;
    }

}
