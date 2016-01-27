package com.scott.dev.taobao.api.tae.domain;

/**
 * 卖家信息
 */
public class SellerInfo {

    /**
     * 卖家昵称
     */
    private String sellerNick;

    /**
     * 卖家类型
     */
    private String sellerType;

    /**
     * 卖家店铺名称
     */
    private String shopName;

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getSellerType() {
        return this.sellerType;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}
