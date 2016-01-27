package com.scott.dev.taobao.api.trade.domain;

import java.util.Date;

/*
 * 交易订单的帐务信息详情
 */
public class TradeAmount {

    /*
     * 支付宝交易号，如：2009112081173831
     */
    private String alipayNo;

    /*
     * 买家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
     */
    private String buyerCodFee;

    /*
     *  买家获得积分,返点的积分。格式:100;单位:个
     */
    private Number buyerObtainPointFee;

    /*
     *  货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
     */
    private String codFee;

    /*
     * 交易佣金。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String commissionFee;

    /*
     * 交易创建时间
     */
    private Date created;

    /*
     * 交易成功时间(更新交易状态为成功的同时更新)/确认收货时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date endTime;

    /*
     * 快递代收款。精确到2位小数;单位:元。如:212.07，表示:212元7分
     */
    private String expressAgencyFee;

    /*
     * 子订单的帐务金额详情列表
     */
    private OrderAmount[] orderAmounts;

    /*
     * 主订单实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分，
     * 计算公式如下： 如果主订单只有一笔子订单 payment = 子订单的实付金额 + 货到付款服务费(如果是货到付款订单) - 主订单的系统级优惠；
     * 如果主订单有多笔子订单 payment = 各子订单的实付金额之和 + 货到付款服务费(如果是货到付款订单) + 邮费 - 主订单的系统级优惠
     */
    private String payment;

    /*
     * 付款时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date payTime;

    /*
     * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分。目前只提供整笔交易的邮费，暂不提供各子订单的邮费
     */
    private String postFee;

    /*
     *  主交易订单的系统级优惠详情
     */
    private PromotionDetail[] promotionDetails;

    /*
     *  卖家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
     */
    private String sellerCodFee;

    /*
     * 交易主订单编号
     */
    private Number tid;

    /*
     * 主订单的商品金额（各子订单中商品price * num的和，不包括任何优惠信息）。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String totalFee;

    public String getAlipayNo() {
        return alipayNo;
    }

    public String getBuyerCodFee() {
        return buyerCodFee;
    }

    public Number getBuyerObtainPointFee() {
        return buyerObtainPointFee;
    }

    public String getCodFee() {
        return codFee;
    }

    public String getCommissionFee() {
        return commissionFee;
    }

    public Date getCreated() {
        return created;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getExpressAgencyFee() {
        return expressAgencyFee;
    }

    public OrderAmount[] getOrderAmounts() {
        return orderAmounts;
    }

    public String getPayment() {
        return payment;
    }

    public Date getPayTime() {
        return payTime;
    }

    public String getPostFee() {
        return postFee;
    }

    public PromotionDetail[] getPromotionDetails() {
        return promotionDetails;
    }

    public String getSellerCodFee() {
        return sellerCodFee;
    }

    public Number getTid() {
        return tid;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public void setBuyerCodFee(String buyerCodFee) {
        this.buyerCodFee = buyerCodFee;
    }

    public void setBuyerObtainPointFee(Number buyerObtainPointFee) {
        this.buyerObtainPointFee = buyerObtainPointFee;
    }

    public void setCodFee(String codFee) {
        this.codFee = codFee;
    }

    public void setCommissionFee(String commissionFee) {
        this.commissionFee = commissionFee;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setExpressAgencyFee(String expressAgencyFee) {
        this.expressAgencyFee = expressAgencyFee;
    }

    public void setOrderAmounts(OrderAmount[] orderAmounts) {
        this.orderAmounts = orderAmounts;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public void setPromotionDetails(PromotionDetail[] promotionDetails) {
        this.promotionDetails = promotionDetails;
    }

    public void setSellerCodFee(String sellerCodFee) {
        this.sellerCodFee = sellerCodFee;
    }

    public void setTid(Number tid) {
        this.tid = tid;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

}
