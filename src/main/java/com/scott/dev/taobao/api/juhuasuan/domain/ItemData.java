package com.scott.dev.taobao.api.juhuasuan.domain;

import java.util.List;

//聚划算商品对象
public class ItemData {

    /**
     * 商品的聚划算价格，单位分
     */
    private Long activityPrice;

    /**
     * 商品对应的淘宝类目id
     */
    private Long categoryId;

    /**
     * 商品对应的聚划算二级类目
     */
    private Long childCategory;

    /**
     * 商品所在城市
     */
    private String city;

    /**
     * 商品的当前库存
     */
    private Long currentStock;

    /**
     * 商品对应的折扣 聚划算价/原价
     */
    private String discount;

    /**
     * 是否存在占座（下单未支付的订单）
     */
    private Boolean existHoldStock;

    /**
     * 商品对应的团id
     */
    private Long groupId;

    /**
     * 商品是否为锁定状态,锁定状态的商品才显示为可销售
     */
    private Boolean isLock;

    /**
     * 商品对应的聚划算描述信息
     */
    private String itemDesc;

    /**
     * 代表聚划算支持的6种消保该商品是否支持，1支持，0不支持 第一位：如实描述 第二位：七天退换 第三位：假一陪三 第四位：商城正品保障
     * 第五位：商城提供发票 第六位：商城7天退换
     */
    private String itemGuarantee;

    /**
     * 商品的数字id
     */
    private Long itemId;

    /**
     * 描述商品的状态，AVAIL_BUY=可以购买 WAIT_FOR_START=即将开始 EXIST_HOLDER=有占座
     * NO_STOCK=卖光了 OUT_OF_TIME=团购已结束
     */
    private String itemStatus;

    /**
     * 商品对应的URl
     */
    private String itemUrl;

    /**
     * 商品的长名称
     */
    private String longName;

    /**
     * 商品活动结束时间点的毫秒值
     */
    private Long onlineEndTime;

    /**
     * 商品上架开始时间点的毫秒值
     */
    private Long onlineStartTime;

    /**
     * 商品的原价，单位分
     */
    private Long originalPrice;

    /**
     * 商品对应的聚划算一级类目
     */
    private Long parentCategory;

    /**
     * 商品是否包邮
     */
    private Boolean payPostage;

    /**
     * 商品对应的图片地址
     */
    private String picUrl;

    /**
     * 商品对应的交易线原始图片地址
     */
    private String picUrlFromIc;

    /**
     * 聚划算图片宽图的地址
     */
    private String picWideUrl;

    /**
     * 商品对应的平台id，1001=聚划算
     */
    private Long platformId;

    /**
     * 卖家对应的信用等级
     */
    private Long sellerCredit;

    /**
     * 商品对应的卖家账户id
     */
    private Long sellerId;

    /**
     * 商品对应的卖家账户nick
     */
    private String sellerNick;

    /**
     * 本地化服务对象的分店信息
     */
    private List<ShopPositionData> shopPositionList;

    /**
     * 商品对应的店铺类型，集市，商城
     */
    private String shopType;

    /**
     * 商品短名称
     */
    private String shortName;

    /**
     * 已参团的人数（付款）
     */
    private Long soldCount;

    public Long getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Long activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(Long childCategory) {
        this.childCategory = childCategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Long currentStock) {
        this.currentStock = currentStock;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Boolean getExistHoldStock() {
        return existHoldStock;
    }

    public void setExistHoldStock(Boolean existHoldStock) {
        this.existHoldStock = existHoldStock;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemGuarantee() {
        return itemGuarantee;
    }

    public void setItemGuarantee(String itemGuarantee) {
        this.itemGuarantee = itemGuarantee;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Long getOnlineEndTime() {
        return onlineEndTime;
    }

    public void setOnlineEndTime(Long onlineEndTime) {
        this.onlineEndTime = onlineEndTime;
    }

    public Long getOnlineStartTime() {
        return onlineStartTime;
    }

    public void setOnlineStartTime(Long onlineStartTime) {
        this.onlineStartTime = onlineStartTime;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Long parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Boolean getPayPostage() {
        return payPostage;
    }

    public void setPayPostage(Boolean payPostage) {
        this.payPostage = payPostage;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicUrlFromIc() {
        return picUrlFromIc;
    }

    public void setPicUrlFromIc(String picUrlFromIc) {
        this.picUrlFromIc = picUrlFromIc;
    }

    public String getPicWideUrl() {
        return picWideUrl;
    }

    public void setPicWideUrl(String picWideUrl) {
        this.picWideUrl = picWideUrl;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Long getSellerCredit() {
        return sellerCredit;
    }

    public void setSellerCredit(Long sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public List<ShopPositionData> getShopPositionList() {
        return shopPositionList;
    }

    public void setShopPositionList(List<ShopPositionData> shopPositionList) {
        this.shopPositionList = shopPositionList;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Long getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Long soldCount) {
        this.soldCount = soldCount;
    }
}
