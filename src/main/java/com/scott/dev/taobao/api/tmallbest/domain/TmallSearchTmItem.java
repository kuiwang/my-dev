package com.scott.dev.taobao.api.tmallbest.domain;

/**
 * 天猫品牌特卖搜索结果数据结构
 */
public class TmallSearchTmItem {

    /**
     * 宝贝所属品牌ID
     */
    private Long brandId;

    /**
     * 宝贝所属品牌名称
     */
    private String brandName;

    /**
     * 宝贝评论数
     */
    private String commentNum;

    /**
     * 宝贝佣金比（%）
     */
    private String commissionRate;

    /**
     * 搜索宝贝url
     */
    private String detailUrl;

    /**
     * 搜索宝贝的图片url
     */
    private String picUrl;

    /**
     * 搜索宝贝原价
     */
    private String price;

    /**
     * 搜索宝贝特卖价
     */
    private String promotionPrice;

    /**
     * 宝贝热门标签名称
     */
    private String tagHot;

    /**
     * 宝贝限量标签名称
     */
    private String tagLq;

    /**
     * 宝贝新品标签名称
     */
    private String tagNew;

    /**
     * 搜索宝贝的标题
     */
    private String title;

    /**
     * 商品id（具有跟踪效果）代替原来的num_iid
     * <a href="http://dev.open.taobao.com/bbs/read.php?tid=24323">详细说明</a>
     */
    private String trackIid;

    /**
     * 搜索宝贝的已售数量 （月销量）
     */
    private Long volume;

    public Long getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getCommentNum() {
        return this.commentNum;
    }

    public String getCommissionRate() {
        return this.commissionRate;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public String getTagHot() {
        return this.tagHot;
    }

    public String getTagLq() {
        return this.tagLq;
    }

    public String getTagNew() {
        return this.tagNew;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackIid() {
        return this.trackIid;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setTagHot(String tagHot) {
        this.tagHot = tagHot;
    }

    public void setTagLq(String tagLq) {
        this.tagLq = tagLq;
    }

    public void setTagNew(String tagNew) {
        this.tagNew = tagNew;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrackIid(String trackIid) {
        this.trackIid = trackIid;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

}
