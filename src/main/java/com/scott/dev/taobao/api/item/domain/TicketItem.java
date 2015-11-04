package com.scott.dev.taobao.api.item.domain;

import com.scott.dev.taobao.api.Price;

/*
 * 新门票类目商品信息
 */
public class TicketItem {

    /*
     * 商品的标识
     */
    private Number itemId;

    /*
     * 类目标识
     */
    private Number catId;

    /*
     * 产品（具有产品规格的）标识
     */
    private Number productId;

    /*
     * 商品标题
     */
    private String title;

    /*
     * 商品描述
     */
    private String description;

    /*
     * 商品主图
     */
    private String image1;

    /*
     * 商品第一张多图
     */
    private String image2;

    /*
     * 商品第2张多图
     */
    private String image3;

    /*
     * 商品第3张多图
     */
    private String image4;

    /*
     * 商品第4张多图
     */
    private String image5;

    /*
     * 商品所在地-省份
     */
    private String prov;

    /*
     * 商品所在地-城市
     */
    private String city;

    /*
     * 商品是否有发票（有发票为true，没有发票为false）
     */
    private Boolean haveInvoice;

    /*
     * 商品是否为拍下减库存（拍下减库存为true，付款减库存为false）
     */
    private Boolean subStockAtBuy;

    /*
     * 商品的上架时间（精确到分，格式为：yyyy-MM-dd HH:mm）
     */
    private String listTime;

    /*
     * 商品返点比例（只对B卖家开放，单位为%）
     */
    private Price auctionPoint;

    /*
     * 商品是否橱窗推荐（橱窗推荐；true，不推荐：false）
     */
    private Boolean promotedStatus;

    /*
     * 宝贝所属的店铺分类列表-店铺分类标识请使用店铺相关接口获取获取，多个店铺分类标识之间通过逗号进行分隔，最多包含10个分类标识
     */
    private String shopCats;

    /*
     *  商品视频-视频标识由多媒体中相关接口获取
     */
    private Number videoId;

    /*
     * 商品状态（onsale：上架，instock：仓库）
     */
    private String auctionStatus;

    /*
     * 商品是否参与店铺会员打折
     */
    private Boolean vipPromoted;

    /*
     * 商品的物流运费模板-在产品规格使用到物流时必选
     */
    private Number postageId;

    /*
     * 参见taobao.ticket.item.add文档描述
     */
    private String skus;

    /*
     * 商品电子凭证信息-在门票商品为电子凭证时必选
     */
    private TicketEtc etc;

    /*
     * 商品对应的错误信息。针对get接口使用。
     */
    private String errMsg;

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public Number getCatId() {
        return catId;
    }

    public void setCatId(Number catId) {
        this.catId = catId;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getHaveInvoice() {
        return haveInvoice;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public Boolean getSubStockAtBuy() {
        return subStockAtBuy;
    }

    public void setSubStockAtBuy(Boolean subStockAtBuy) {
        this.subStockAtBuy = subStockAtBuy;
    }

    public String getListTime() {
        return listTime;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public Price getAuctionPoint() {
        return auctionPoint;
    }

    public void setAuctionPoint(Price auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public Boolean getPromotedStatus() {
        return promotedStatus;
    }

    public void setPromotedStatus(Boolean promotedStatus) {
        this.promotedStatus = promotedStatus;
    }

    public String getShopCats() {
        return shopCats;
    }

    public void setShopCats(String shopCats) {
        this.shopCats = shopCats;
    }

    public Number getVideoId() {
        return videoId;
    }

    public void setVideoId(Number videoId) {
        this.videoId = videoId;
    }

    public String getAuctionStatus() {
        return auctionStatus;
    }

    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Boolean getVipPromoted() {
        return vipPromoted;
    }

    public void setVipPromoted(Boolean vipPromoted) {
        this.vipPromoted = vipPromoted;
    }

    public Number getPostageId() {
        return postageId;
    }

    public void setPostageId(Number postageId) {
        this.postageId = postageId;
    }

    public String getSkus() {
        return skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public TicketEtc getEtc() {
        return etc;
    }

    public void setEtc(TicketEtc etc) {
        this.etc = etc;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
