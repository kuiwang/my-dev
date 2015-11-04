package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘宝客店铺
 *
 * @author auto create
 * @since 1.0, null
 */
public class TbkShop extends TaobaoObject {

    private static final long serialVersionUID = 6133617579982194895L;

    /**
     * 店铺推广URL
     */
    @ApiField("click_url")
    private String clickUrl;

    /**
     * 店铺logo
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 卖家昵称
     */
    @ApiField("seller_nick")
    private String sellerNick;

    /**
     * 店铺名称
     */
    @ApiField("shop_title")
    private String shopTitle;

    /**
     * 店铺地址
     */
    @ApiField("shop_url")
    private String shopUrl;

    /**
     * 店铺用户id
     */
    @ApiField("user_id")
    private Long userId;

    public String getClickUrl() {
        return this.clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getShopTitle() {
        return this.shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
