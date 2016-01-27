package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 多条件批量获取的商品的信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpItemInfo extends TaobaoObject {

    private static final long serialVersionUID = 2457421418491847884L;

    /**
     * 商品优惠价格, 如果为空则无优惠.精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("final_price")
    private String finalPrice;

    /**
     * 商品ID
     */
    @ApiField("item_id")
    private String itemId;

    /**
     * 商品的URL
     */
    @ApiField("item_url")
    private String itemUrl;

    /**
     * 卖家昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 图片地址
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 商品价格.精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("price")
    private String price;

    /**
     * 卖家数字ID
     */
    @ApiField("seller_id")
    private String sellerId;

    /**
     * 店铺的链接URL
     */
    @ApiField("shop_url")
    private String shopUrl;

    /**
     * 商品标题
     */
    @ApiField("title")
    private String title;

    /**
     * 是否是淘客商品（0-非淘客商品，5-淘客商品）
     */
    @ApiField("tk")
    private String tk;

    /**
     * 是否天猫： 1是，0否
     */
    @ApiField("tmall")
    private String tmall;

    public String getFinalPrice() {
        return this.finalPrice;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public String getNick() {
        return this.nick;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTk() {
        return this.tk;
    }

    public String getTmall() {
        return this.tmall;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public void setTmall(String tmall) {
        this.tmall = tmall;
    }

}
