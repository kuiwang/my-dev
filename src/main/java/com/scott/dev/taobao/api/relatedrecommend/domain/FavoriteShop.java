package com.scott.dev.taobao.api.relatedrecommend.domain;

/*
 * 推荐关联店铺信息
 */
public class FavoriteShop {

    /*
     * 店铺ID
     */
    private Number shopId;

    /*
     * 卖家ID
     */
    private Number sellerId;

    /*
     * 卖家昵称
     */
    private String sellerNick;

    /*
     * 店铺ID
     */
    private String shopName;

    /*
     * 店铺LOGO图片
     */
    private String shopPic;

    /*
     * 店铺首页链接
     */
    private String shopUrl;

    /*
     * 店铺卖家信用
     */
    private Number rate;

    public Number getShopId() {
        return shopId;
    }

    public void setShopId(Number shopId) {
        this.shopId = shopId;
    }

    public Number getSellerId() {
        return sellerId;
    }

    public void setSellerId(Number sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPic() {
        return shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public Number getRate() {
        return rate;
    }

    public void setRate(Number rate) {
        this.rate = rate;
    }
}
