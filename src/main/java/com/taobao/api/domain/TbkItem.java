package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘宝客商品
 *
 * @author auto create
 * @since 1.0, null
 */
public class TbkItem extends TaobaoObject {

    private static final long serialVersionUID = 5291258339322294494L;

    /**
     * 推广点击url
     */
    @ApiField("click_url")
    private String clickUrl;

    /**
     * 商品的折扣价
     */
    @ApiField("discount_price")
    private String discountPrice;

    /**
     * 商品url
     */
    @ApiField("item_url")
    private String itemUrl;

    /**
     * 卖家昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 淘宝客商品数字id
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 图片url
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 商品价格
     */
    @ApiField("price")
    private String price;

    /**
     * 卖家id
     */
    @ApiField("seller_id")
    private Long sellerId;

    /**
     * 店铺url
     */
    @ApiField("shop_url")
    private String shopUrl;

    /**
     * 商品title 宝贝名称
     */
    @ApiField("title")
    private String title;

    /**
     * 30天内交易量
     */
    @ApiField("volume")
    private Long volume;

    public String getClickUrl() {
        return this.clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public String getDiscountPrice() {
        return this.discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

}
