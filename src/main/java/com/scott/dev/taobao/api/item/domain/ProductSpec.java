package com.scott.dev.taobao.api.item.domain;

/*
 * ProductSpec(产品规格)结构
 */
public class ProductSpec {

    /*
     * 产品规格条形码，支持EAN-13格式。
     */
    private String barcode;

    /*
     * 产品品牌id
     */
    private Number brandId;

    /*
     * 认证图片列表
     */
    private CertPicInfo[] certifiedPics;

    /*
     * 认证文本列表
     */
    private CertTxtInfo[] certifiedTxts;

    /*
     * 基础色数据
     */
    private String changeProp;

    /*
     * 用户输入的属性值存放位置，例如可输入的销售属性，
     * 当用户获取pid vid后，应该先从spec_props_alias中获取，
     * 然后通过类目属性获取，获取不到，可以通过这个字段获取。
     */
    private String customePropsName;

    /*
     * 产品规格吊牌价，以分为单位的整数，非负,无默认值，上限999999999
     */
    private Number labelPrice;

    /*
     * 上市时间
     */
    private String marketTime;

    /*
     * 规格的数量，仅当通过组合产品获取时有值
     */
    private Number number;

    /*
     * 产品的主图片地址。绝对地址，格式：http://host/image_path。
     */
    private String picUrl;

    /*
     * 产品货号
     */
    private String productCode;

    /*
     * 产品ID。
     */
    private Number productId;

    /*
     * 产品规格ID。
     */
    private Number specId;

    /*
     * 产品规格的销售属性组合。格式为：pid:vid;pid:vid。
     * 其中：pid是销售属性id，vid是销售属性值id。如果该类目品牌下面没有销售属性，可以不用填写。
     * 销售属性通过tmall.brandcat.salespro.get接口获取。
     */
    private String specProps;

    /*
     * 用户输入的属性值存放位置，例如可输入的销售属性，
     * 当用户获取pid vid后，应该先从spec_props_alias中获取，
     * 然后通过类目属性获取，获取不到，可以通过这个字段获取。
     */
    private String specPropsAlias;

    /*
     * 1:表示可以使用的数据，也就是审核通过的。 3：表示等待小二审核的产品规格，这个数据暂时还不能使用，要等待审核通过后，才能使用
     */
    private Number status;

    public String getBarcode() {
        return barcode;
    }

    public Number getBrandId() {
        return brandId;
    }

    public CertPicInfo[] getCertifiedPics() {
        return certifiedPics;
    }

    public CertTxtInfo[] getCertifiedTxts() {
        return certifiedTxts;
    }

    public String getChangeProp() {
        return changeProp;
    }

    public String getCustomePropsName() {
        return customePropsName;
    }

    public Number getLabelPrice() {
        return labelPrice;
    }

    public String getMarketTime() {
        return marketTime;
    }

    public Number getNumber() {
        return number;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public Number getProductId() {
        return productId;
    }

    public Number getSpecId() {
        return specId;
    }

    public String getSpecProps() {
        return specProps;
    }

    public String getSpecPropsAlias() {
        return specPropsAlias;
    }

    public Number getStatus() {
        return status;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setBrandId(Number brandId) {
        this.brandId = brandId;
    }

    public void setCertifiedPics(CertPicInfo[] certifiedPics) {
        this.certifiedPics = certifiedPics;
    }

    public void setCertifiedTxts(CertTxtInfo[] certifiedTxts) {
        this.certifiedTxts = certifiedTxts;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public void setCustomePropsName(String customePropsName) {
        this.customePropsName = customePropsName;
    }

    public void setLabelPrice(Number labelPrice) {
        this.labelPrice = labelPrice;
    }

    public void setMarketTime(String marketTime) {
        this.marketTime = marketTime;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public void setSpecId(Number specId) {
        this.specId = specId;
    }

    public void setSpecProps(String specProps) {
        this.specProps = specProps;
    }

    public void setSpecPropsAlias(String specPropsAlias) {
        this.specPropsAlias = specPropsAlias;
    }

    public void setStatus(Number status) {
        this.status = status;
    }
}
