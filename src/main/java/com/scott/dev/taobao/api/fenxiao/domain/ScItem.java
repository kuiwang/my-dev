package com.scott.dev.taobao.api.fenxiao.domain;

/**
 * 后端商品
 */
public class ScItem {

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 高 单位：mm
     */
    private Long height;

    /**
     * 1表示区域销售，0或是空是非区域销售
     */
    private Long isAreaSale;

    /**
     * 贵重品:false:不是 true：是
     */
    private Boolean isCostly;

    /**
     * 是否危险 false：不是 true：是
     */
    private Boolean isDangerous;

    /**
     * 是否易碎 false ：不是 true：是
     */
    private Boolean isFriable;

    /**
     * 是否保质期：false:不是 true：是
     */
    private Boolean isWarranty;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 1.普通供应链商品 2.供应链组合主商品
     */
    private Long itemType;

    /**
     * 长度 单位：mm
     */
    private Long length;

    /**
     * LIQUID:液体，1：粉体，SOLID：固体
     */
    private String matterStatus;

    /**
     * 后端商品options字段
     */
    private Long options;

    /**
     * 商家编码
     */
    private String outerCode;

    /**
     * 价格：分（吊牌价）
     */
    private Long price;

    /**
     * 商品属性格式是 p1:v1,p2:v2,p3:v3
     */
    private String properties;

    /**
     * 备注
     */
    private String remark;

    /**
     * 体积：立方厘米
     */
    private Long volume;

    /**
     * 重量.单位：克
     */
    private Long weight;

    /**
     * 宽 单位：mm
     */
    private Long width;

    /**
     * 仓储商编码，可以支持多个，格式wmsname:code
     */
    private String wmsCode;

    public String getBarCode() {
        return this.barCode;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getIsAreaSale() {
        return this.isAreaSale;
    }

    public Boolean getIsCostly() {
        return this.isCostly;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    public Boolean getIsFriable() {
        return this.isFriable;
    }

    public Boolean getIsWarranty() {
        return this.isWarranty;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public Long getLength() {
        return this.length;
    }

    public String getMatterStatus() {
        return this.matterStatus;
    }

    public Long getOptions() {
        return this.options;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public Long getPrice() {
        return this.price;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getRemark() {
        return this.remark;
    }

    public Long getVolume() {
        return this.volume;
    }

    public Long getWeight() {
        return this.weight;
    }

    public Long getWidth() {
        return this.width;
    }

    public String getWmsCode() {
        return this.wmsCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setIsAreaSale(Long isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public void setIsCostly(Boolean isCostly) {
        this.isCostly = isCostly;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public void setIsFriable(Boolean isFriable) {
        this.isFriable = isFriable;
    }

    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setMatterStatus(String matterStatus) {
        this.matterStatus = matterStatus;
    }

    public void setOptions(Long options) {
        this.options = options;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }

}
