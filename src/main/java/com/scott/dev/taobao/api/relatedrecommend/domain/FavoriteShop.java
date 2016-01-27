package com.scott.dev.taobao.api.relatedrecommend.domain;

/*
 * 推荐关联店铺信息
 */
public class FavoriteShop {

    /*
     * 店铺卖家信用
     */
    private Number rate;

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
    private Number shopId;

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

    public Number getRate() {
        return rate;
    }

    public Number getSellerId() {
        return sellerId;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public Number getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopPic() {
        return shopPic;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setRate(Number rate) {
        this.rate = rate;
    }

    public void setSellerId(Number sellerId) {
        this.sellerId = sellerId;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setShopId(Number shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }
}
