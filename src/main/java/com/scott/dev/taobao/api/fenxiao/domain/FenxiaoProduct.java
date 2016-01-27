package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 分销产品
 */
public class FenxiaoProduct {

    /*
     * 警戒库存
     */
    private Number alarmNumber;

    /*
     * 类目id
     */
    private String categoryId;

    /*
     * 所在地：市
     */
    private String city;

    /*
     * 采购价格，单位：元。
     */
    private Price costPrice;

    /*
     * 创建时间
     */
    private Date created;

    /*
     * 经销采购价
     */
    private String dealerCostPrice;

    /*
     * 产品描述路径，通过http请求获取
     */
    private String descPath;

    /*
     * 产品描述的内容
     */
    private String description;

    /*
     * 折扣ID（新增参数）
     */
    private Number discountId;

    /*
     * 是否有保修，可选值：false（否）、true（是）
     */
    private Boolean haveGuarantee;

    /*
     * 是否有发票，可选值：false（否）、true（是）
     */
    private Boolean haveInvoice;

    /*
     * 产品图片
     */
    private FenxiaoImage[] images;

    /*
     * 自定义属性，格式为pid:value;pid:value
     */
    private String inputProperties;

    /*
     * 查询产品列表时，查询入参增加is_authz:yes|no yes:需要授权 no:不需要授权
     */
    private String isAuthz;

    /*
     * 导入的商品ID
     */
    private Number itemId;

    /*
     * 下载人数
     */
    private Number itemsCount;

    /*
     * 更新时间
     */
    private Date modified;

    /*
     * 产品名称
     */
    private String name;

    /*
     * 累计采购次数
     */
    private Number ordersCount;

    /*
     *  商家编码
     */
    private String outerId;

    /*
     * 产品分销商信息
     */
    private FenxiaoPdu[] pdus;

    /*
     * 产品图片路径
     */
    private String pictures;

    /*
     * 产品ID
     */
    private Number pid;

    /*
     * ems费用，单位：元
     */
    private Price postageEms;

    /*
     * 快递费用，单位：元
     */
    private Price postageFast;

    /*
     * 运费模板ID
     */
    private Number postageId;

    /*
     * 平邮费用，单位：元
     */
    private Price postageOrdinary;

    /*
     *  运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）
     */
    private String postageType;

    /*
     * 产品线ID
     */
    private Number productcatId;

    /*
     * 产品属性，格式为pid:vid;pid:vid
     */
    private String properties;

    /*
     * 属性别名，格式为pid:vid:alias;pid:vid:alias
     */
    private String propertyAlias;

    /*
     * 所在地：省
     */
    private String prov;

    /*
     * 产品库存
     */
    private Number quantity;

    /*
     * 根据商品ID查询时，返回这个产品对应的商品ID，只对分销商查询接口有效
     */
    private Number queryItemId;

    /*
     * 配额可用库存
     */
    private Number quotaQuantity;

    /*
     *  预扣库存
     */
    private Number reservedQuantity;

    /*
     *  最高零售价，单位：分。
     */
    private Price retailPriceHigh;

    /*
     * 最低零售价，单位：分。
     */
    private Price retailPriceLow;

    /*
     * 关联的后端商品id
     */
    private Number scitemId;

    /*
     * sku列表
     */
    private FenxiaoSku[] skus;

    /*
     * 产品spu id
     */
    private Number spuId;

    /*
     * 采购基准价，单位：元。
     */
    private Price standardPrice;

    /*
     * 零售基准价，单位：元
     */
    private Price standardRetailPrice;

    /*
     * 发布状态，可选值：up（上架）、down（下架）
     */
    private String status;

    /*
     * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
     */
    private String tradeType;

    /*
     * 铺货时间
     */
    private Date upshelfTime;

    public Number getAlarmNumber() {
        return alarmNumber;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCity() {
        return city;
    }

    public Price getCostPrice() {
        return costPrice;
    }

    public Date getCreated() {
        return created;
    }

    public String getDealerCostPrice() {
        return dealerCostPrice;
    }

    public String getDescPath() {
        return descPath;
    }

    public String getDescription() {
        return description;
    }

    public Number getDiscountId() {
        return discountId;
    }

    public Boolean getHaveGuarantee() {
        return haveGuarantee;
    }

    public Boolean getHaveInvoice() {
        return haveInvoice;
    }

    public FenxiaoImage[] getImages() {
        return images;
    }

    public String getInputProperties() {
        return inputProperties;
    }

    public String getIsAuthz() {
        return isAuthz;
    }

    public Number getItemId() {
        return itemId;
    }

    public Number getItemsCount() {
        return itemsCount;
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public Number getOrdersCount() {
        return ordersCount;
    }

    public String getOuterId() {
        return outerId;
    }

    public FenxiaoPdu[] getPdus() {
        return pdus;
    }

    public String getPictures() {
        return pictures;
    }

    public Number getPid() {
        return pid;
    }

    public Price getPostageEms() {
        return postageEms;
    }

    public Price getPostageFast() {
        return postageFast;
    }

    public Number getPostageId() {
        return postageId;
    }

    public Price getPostageOrdinary() {
        return postageOrdinary;
    }

    public String getPostageType() {
        return postageType;
    }

    public Number getProductcatId() {
        return productcatId;
    }

    public String getProperties() {
        return properties;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public String getProv() {
        return prov;
    }

    public Number getQuantity() {
        return quantity;
    }

    public Number getQueryItemId() {
        return queryItemId;
    }

    public Number getQuotaQuantity() {
        return quotaQuantity;
    }

    public Number getReservedQuantity() {
        return reservedQuantity;
    }

    public Price getRetailPriceHigh() {
        return retailPriceHigh;
    }

    public Price getRetailPriceLow() {
        return retailPriceLow;
    }

    public Number getScitemId() {
        return scitemId;
    }

    public FenxiaoSku[] getSkus() {
        return skus;
    }

    public Number getSpuId() {
        return spuId;
    }

    public Price getStandardPrice() {
        return standardPrice;
    }

    public Price getStandardRetailPrice() {
        return standardRetailPrice;
    }

    public String getStatus() {
        return status;
    }

    public String getTradeType() {
        return tradeType;
    }

    public Date getUpshelfTime() {
        return upshelfTime;
    }

    public void setAlarmNumber(Number alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCostPrice(Price costPrice) {
        this.costPrice = costPrice;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public void setDescPath(String descPath) {
        this.descPath = descPath;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiscountId(Number discountId) {
        this.discountId = discountId;
    }

    public void setHaveGuarantee(Boolean haveGuarantee) {
        this.haveGuarantee = haveGuarantee;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public void setImages(FenxiaoImage[] images) {
        this.images = images;
    }

    public void setInputProperties(String inputProperties) {
        this.inputProperties = inputProperties;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public void setItemsCount(Number itemsCount) {
        this.itemsCount = itemsCount;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrdersCount(Number ordersCount) {
        this.ordersCount = ordersCount;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPdus(FenxiaoPdu[] pdus) {
        this.pdus = pdus;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public void setPid(Number pid) {
        this.pid = pid;
    }

    public void setPostageEms(Price postageEms) {
        this.postageEms = postageEms;
    }

    public void setPostageFast(Price postageFast) {
        this.postageFast = postageFast;
    }

    public void setPostageId(Number postageId) {
        this.postageId = postageId;
    }

    public void setPostageOrdinary(Price postageOrdinary) {
        this.postageOrdinary = postageOrdinary;
    }

    public void setPostageType(String postageType) {
        this.postageType = postageType;
    }

    public void setProductcatId(Number productcatId) {
        this.productcatId = productcatId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public void setQueryItemId(Number queryItemId) {
        this.queryItemId = queryItemId;
    }

    public void setQuotaQuantity(Number quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    public void setReservedQuantity(Number reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public void setRetailPriceHigh(Price retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public void setRetailPriceLow(Price retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public void setScitemId(Number scitemId) {
        this.scitemId = scitemId;
    }

    public void setSkus(FenxiaoSku[] skus) {
        this.skus = skus;
    }

    public void setSpuId(Number spuId) {
        this.spuId = spuId;
    }

    public void setStandardPrice(Price standardPrice) {
        this.standardPrice = standardPrice;
    }

    public void setStandardRetailPrice(Price standardRetailPrice) {
        this.standardRetailPrice = standardRetailPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public void setUpshelfTime(Date upshelfTime) {
        this.upshelfTime = upshelfTime;
    }
}
