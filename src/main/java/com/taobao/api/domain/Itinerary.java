package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 国内机票行程单数据结构定义【top订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class Itinerary extends TaobaoObject {

    private static final long serialVersionUID = 2492729137536644117L;

    /**
     * 收件人地址
     */
    @ApiField("address")
    private String address;

    /**
     * 支付宝交易号
     */
    @ApiField("alipay_trade_no")
    private String alipayTradeNo;

    /**
     * 物流公司代码
     */
    @ApiField("company_code")
    private String companyCode;

    /**
     * 邮寄单号
     */
    @ApiField("express_code")
    private String expressCode;

    /**
     * 扩展字段
     */
    @ApiField("extra")
    private String extra;

    /**
     * 淘宝主键id
     */
    @ApiField("id")
    private Long id;

    /**
     * 行程单号
     */
    @ApiField("itinerary_no")
    private String itineraryNo;

    /**
     * 收件人手机号
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 收件人备用手机号
     */
    @ApiField("mobile_bak")
    private String mobileBak;

    /**
     * 收件人姓名
     */
    @ApiField("name")
    private String name;

    /**
     * 行程单价格，单位：分
     */
    @ApiField("price")
    private String price;

    /**
     * 邮寄时间
     */
    @ApiField("send_date")
    private String sendDate;

    /**
     * 行程单订单的状态 0：未付款 1：已付款 2：转交易成功 3：已邮寄 4：已取消
     */
    @ApiField("status")
    private Long status;

    /**
     * 行程单类型：6，快递
     */
    @ApiField("type")
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
