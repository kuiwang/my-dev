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

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getShopTitle() {
        return this.shopTitle;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
