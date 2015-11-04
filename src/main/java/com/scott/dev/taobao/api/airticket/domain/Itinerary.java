package com.scott.dev.taobao.api.airticket.domain;

/**
 * 国内机票行程单数据结构定义【top订单优化】
 */
public class Itinerary {

    /**
     * 收件人地址
     */
    private String address;

    /**
     * 支付宝交易号
     */
    private String alipayTradeNo;

    /**
     * 物流公司代码
     */
    private String companyCode;

    /**
     * 邮寄单号
     */
    private String expressCode;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * 淘宝主键id
     */
    private Long id;

    /**
     * 行程单号
     */
    private String itineraryNo;

    /**
     * 收件人手机号
     */
    private String mobile;

    /**
     * 收件人备用手机号
     */
    private String mobileBak;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 行程单价格，单位：分
     */
    private String price;

    /**
     * 邮寄时间
     */
    private String sendDate;

    /**
     * 行程单订单的状态 0：未付款 1：已付款 2：转交易成功 3：已邮寄 4：已取消
     */
    private Long status;

    /**
     * 行程单类型：6，快递
     */
    private Long type;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getExpressCode() {
        return this.expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItineraryNo() {
        return this.itineraryNo;
    }

    public void setItineraryNo(String itineraryNo) {
        this.itineraryNo = itineraryNo;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileBak() {
        return this.mobileBak;
    }

    public void setMobileBak(String mobileBak) {
        this.mobileBak = mobileBak;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSendDate() {
        return this.sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
