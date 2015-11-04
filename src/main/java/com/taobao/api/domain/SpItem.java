package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpItem extends TaobaoObject {

    private static final long serialVersionUID = 1129737691859565889L;

    /**
     * 下架时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    @ApiField("delist_time")
    private String delistTime;

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
     * 商品图片
     */
    @ApiField("item_imgs")
    private String itemImgs;

    /**
     * 商品的URL
     */
    @ApiField("item_url")
    private String itemUrl;

    /**
     * 上架时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    @ApiField("list_time")
    private String listTime;

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
     * 商品价格，格式：5.00；单位：元；精确到：分
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
     * 标识商品类型，天猫商品是1，集市商品是0
     */
    @ApiField("tmall")
    private String tmall;

    public String getDelistTime() {
        return this.delistTime;
    }

    public void setDelistTime(String delistTime) {
        this.delistTime = delistTime;
    }

    public String getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemImgs() {
        return this.itemImgs;
    }

    public void setItemImgs(String itemImgs) {
        this.itemImgs = itemImgs;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getListTime() {
        return this.listTime;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public String getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(String sellerId) {
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

    public String getTk() {
        return this.tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getTmall() {
        return this.tmall;
    }

    public void setTmall(String tmall) {
        this.tmall = tmall;
    }

}
