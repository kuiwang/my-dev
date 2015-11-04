package com.scott.dev.taobao.api.airticket.domain;

import java.util.Date;

/**
 * 订单基础信息
 */
public class TripBaseInfo {

    /**
     * 支付宝交易号
     */
    private String alipayTradeNo;

    /**
     * 佣金，单位：分
     */
    private String commission;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 扩展信息
     */
    private String extra;

    /**
     * 是否强制保险订单，有一张票为强制保险即为true
     */
    private Boolean forceInsure;

    /**
     * 是否保险分润订单，有一个乘机人支持分润即为 True
     */
    private Boolean insurePromotion;

    /**
     * 订单表最近一次修改时间
     */
    private Date modifyTime;

    /**
     * 淘宝机票订单id
     */
    private Long orderId;

    /**
     * 订单最晚支付时间
     */
    private Date payLatestTime;

    /**
     * 订单支付状态==>
     * 0:未付款;1:已付款，冻结买家定金;2:付款给卖家;3:解冻定金给买家;4:已扣佣;5:交易关闭;6:确认可支付;7:确认不可支付
     */
    private Long payStatus;

    /**
     * 联系人邮箱
     */
    private String relationEmail;

    /**
     * 联系人手机号
     */
    private String relationMobile;

    /**
     * 联系人姓名
     */
    private String relationName;

    /**
     * 联系人备用电话
     */
    private String relationPhoneBak;

    /**
     * 订单状态定义==>
     * 0:未付款;(注：支持保险分润时，订单已付款，保险未付款也为0)1:处理中;2:确定出票;3:预定成功;4:预定失败;
     * 5:处理中超时失效;6:支付超时失效;7:买家取消
     */
    private Long status;

    /**
     * 总金额，所有乘机人加机建燃油，单位：分
     */
    private Long totalPrice;

    /**
     * 航程类型：0，单程；1，往返；
     */
    private Long tripType;

    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public String getCommission() {
        return this.commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Boolean getForceInsure() {
        return this.forceInsure;
    }

    public void setForceInsure(Boolean forceInsure) {
        this.forceInsure = forceInsure;
    }

    public Boolean getInsurePromotion() {
        return this.insurePromotion;
    }

    public void setInsurePromotion(Boolean insurePromotion) {
        this.insurePromotion = insurePromotion;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getPayLatestTime() {
        return this.payLatestTime;
    }

    public void setPayLatestTime(Date payLatestTime) {
        this.payLatestTime = payLatestTime;
    }

    public Long getPayStatus() {
        return this.payStatus;
    }

    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }

    public String getRelationEmail() {
        return this.relationEmail;
    }

    public void setRelationEmail(String relationEmail) {
        this.relationEmail = relationEmail;
    }

    public String getRelationMobile() {
        return this.relationMobile;
    }

    public void setRelationMobile(String relationMobile) {
        this.relationMobile = relationMobile;
    }

    public String getRelationName() {
        return this.relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getRelationPhoneBak() {
        return this.relationPhoneBak;
    }

    public void setRelationPhoneBak(String relationPhoneBak) {
        this.relationPhoneBak = relationPhoneBak;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getTripType() {
        return this.tripType;
    }

    public void setTripType(Long tripType) {
        this.tripType = tripType;
    }

}
