package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 分销产品
 */
public class FenxiaoProduct {

    /*
     * 产品ID
     */
    private Number pid;

    /*
     * 产品名称
     */
    private String name;

    /*
     * 产品线ID
     */
    private Number productcatId;

    /*
     * 采购价格，单位：元。
     */
    private Price costPrice;

    /*
     * 最低零售价，单位：分。
     */
    private Price retailPriceLow;

    /*
     *  最高零售价，单位：分。
     */
    private Price retailPriceHigh;

    /*
     *  商家编码
     */
    private String outerId;

    /*
     * 产品库存
     */
    private Number quantity;

    /*
     * 警戒库存
     */
    private Number alarmNumber;

    /*
     * 产品图片路径
     */
    private String pictures;

    /*
     * 产品描述路径，通过http请求获取
     */
    private String descPath;

    /*
     * 所在地：省
     */
    private String prov;

    /*
     * 所在地：市
     */
    private String city;

    /*
     *  运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）
     */
    private String postageType;

    /*
     * 运费模板ID
     */
    private Number postageId;

    /*
     * 平邮费用，单位：元
     */
    private Price postageOrdinary;

    /*
     * 快递费用，单位：元
     */
    private Price postageFast;

    /*
     * ems费用，单位：元
     */
    private Price postageEms;

    /*
     * 是否有发票，可选值：false（否）、true（是）
     */
    private Boolean haveInvoice;

    /*
     * 是否有保修，可选值：false（否）、true（是）
     */
    private Boolean haveGuarantee;

    /*
     * 发布状态，可选值：up（上架）、down（下架）
     */
    private String status;

    /*
     * 下载人数
     */
    private Number itemsCount;

    /*
     * 累计采购次数
     */
    private Number ordersCount;

    /*
     * 创建时间
     */
    private Date created;

    /*
     * 更新时间
     */
    private Date modified;

    /*
     * sku列表
     */
    private FenxiaoSku[] skus;

    /*
     * 折扣ID（新增参数）
     */
    private Number discountId;

    /*
     * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
     */
    private String tradeType;

    /*
     * 采购基准价，单位：元。
     */
    private Price standardPrice;

    /*
     * 铺货时间
     */
    private Date upshelfTime;

    /*
     * 查询产品列表时，查询入参增加is_authz:yes|no yes:需要授权 no:不需要授权
     */
    private String isAuthz;

    /*
     * 类目id
     */
    private String categoryId;

    /*
     * 产品属性，格式为pid:vid;pid:vid
     */
    private String properties;

    /*
     * 属性别名，格式为pid:vid:alias;pid:vid:alias
     */
    private String propertyAlias;

    /*
     * 自定义属性，格式为pid:value;pid:value
     */
    private String inputProperties;

    /*
     * 产品描述的内容
     */
    private String description;

    /*
     * 经销采购价
     */
    private String dealerCostPrice;

    /*
     * 导入的商品ID
     */
    private Number itemId;

    /*
     * 产品分销商信息
     */
    private FenxiaoPdu[] pdus;

    /*
     * 关联的后端商品id
     */
    private Number scitemId;

    /*
     * 零售基准价，单位：元
     */
    private Price standardRetailPrice;

    /*
     * 产品图片
     */
    private FenxiaoImage[] images;

    /*
     * 根据商品ID查询时，返回这个产品对应的商品ID，只对分销商查询接口有效
     */
    private Number queryItemId;

    /*
     *  预扣库存
     */
    private Number reservedQuantity;

    /*
     * 配额可用库存
     */
    private Number quotaQuantity;

    /*
     * 产品spu id
     */
    private Number spuId;

    public Number getPid() {
        return pid;
    }

    public void setPid(Number pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getProductcatId() {
        return productcatId;
    }

    public void setProductcatId(Number productcatId) {
        this.productcatId = productcatId;
    }

    public Price getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Price costPrice) {
        this.costPrice = costPrice;
    }

    public Price getRetailPriceLow() {
        return retailPriceLow;
    }

    public void setRetailPriceLow(Price retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public Price getRetailPriceHigh() {
        return retailPriceHigh;
    }

    public void setRetailPriceHigh(Price retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getAlarmNumber() {
        return alarmNumber;
    }

    public void setAlarmNumber(Number alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getDescPath() {
        return descPath;
    }

    public void setDescPath(String descPath) {
        this.descPath = descPath;
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

    public String getPostageType() {
        return postageType;
    }

    public void setPostageType(String postageType) {
        this.postageType = postageType;
    }

    public Number getPostageId() {
        return postageId;
    }

    public void setPostageId(Number postageId) {
        this.postageId = postageId;
    }

    public Price getPostageOrdinary() {
        return postageOrdinary;
    }

    public void setPostageOrdinary(Price postageOrdinary) {
        this.postageOrdinary = postageOrdinary;
    }

    public Price getPostageFast() {
        return postageFast;
    }

    public void setPostageFast(Price postageFast) {
        this.postageFast = postageFast;
    }

    public Price getPostageEms() {
        return postageEms;
    }

    public void setPostageEms(Price postageEms) {
        this.postageEms = postageEms;
    }

    public Boolean getHaveInvoice() {
        return haveInvoice;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public Boolean getHaveGuarantee() {
        return haveGuarantee;
    }

    public void setHaveGuarantee(Boolean haveGuarantee) {
        this.haveGuarantee = haveGuarantee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Number getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Number itemsCount) {
        this.itemsCount = itemsCount;
    }

    public Number getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Number ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public FenxiaoSku[] getSkus() {
        return skus;
    }

    public void setSkus(FenxiaoSku[] skus) {
        this.skus = skus;
    }

    public Number getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Number discountId) {
        this.discountId = discountId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Price getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Price standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Date getUpshelfTime() {
        return upshelfTime;
    }

    public void setUpshelfTime(Date upshelfTime) {
        this.upshelfTime = upshelfTime;
    }

    public String getIsAuthz() {
        return isAuthz;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getInputProperties() {
        return inputProperties;
    }

    public void setInputProperties(String inputProperties) {
        this.inputProperties = inputProperties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDealerCostPrice() {
        return dealerCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public FenxiaoPdu[] getPdus() {
        return pdus;
    }

    public void setPdus(FenxiaoPdu[] pdus) {
        this.pdus = pdus;
    }

    public Number getScitemId() {
        return scitemId;
    }

    public void setScitemId(Number scitemId) {
        this.scitemId = scitemId;
    }

    public Price getStandardRetailPrice() {
        return standardRetailPrice;
    }

    public void setStandardRetailPrice(Price standardRetailPrice) {
        this.standardRetailPrice = standardRetailPrice;
    }

    public FenxiaoImage[] getImages() {
        return images;
    }

    public void setImages(FenxiaoImage[] images) {
        this.images = images;
    }

    public Number getQueryItemId() {
        return queryItemId;
    }

    public void setQueryItemId(Number queryItemId) {
        this.queryItemId = queryItemId;
    }

    public Number getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Number reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Number getQuotaQuantity() {
        return quotaQuantity;
    }

    public void setQuotaQuantity(Number quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    public Number getSpuId() {
        return spuId;
    }

    public void setSpuId(Number spuId) {
        this.spuId = spuId;
    }
}
