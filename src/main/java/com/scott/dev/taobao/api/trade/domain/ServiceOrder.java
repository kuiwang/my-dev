package com.scott.dev.taobao.api.trade.domain;

/*
 * 商城虚拟服务子订单数据结构
 */
public class ServiceOrder {

    /*
     * 卖家昵称
     */
    private String buyerNick;

    /*
     * 服务所属的交易订单号。如果服务为一年包换，则item_oid这笔订单享受改服务的保护
     */
    private Number itemOid;

    /*
     *购买数量，取值范围为大于0的整数
     */
    private Number num;

    /*
     * 虚拟服务子订单订单号
     */
    private Number oid;

    /*
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。
     */
    private String payment;

    /*
     * 服务图片地址
     */
    private String picPath;

    /*
     *  服务价格，精确到小数点后两位：单位:元
     */
    private String price;

    /*
     * 最近退款的id
     */
    private Number refundId;

    /*
     * 卖家昵称
     */
    private String sellerNick;

    /*
     * 服务详情的URL地址
     */
    private String serviceDetailUrl;

    /*
     *  服务数字id
     */
    private Number serviceId;

    /*
     * 商品名称
     */
    private String title;

    /*
     * 服务子订单总费用
     */
    private String totalFee;

    public String getBuyerNick() {
        return buyerNick;
    }

    public Number getItemOid() {
        return itemOid;
    }

    public Number getNum() {
        return num;
    }

    public Number getOid() {
        return oid;
    }

    public String getPayment() {
        return payment;
    }

    public String getPicPath() {
        return picPath;
    }

    public String getPrice() {
        return price;
    }

    public Number getRefundId() {
        return refundId;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public String getServiceDetailUrl() {
        return serviceDetailUrl;
    }

    public Number getServiceId() {
        return serviceId;
    }

    public String getTitle() {
        return title;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setItemOid(Number itemOid) {
        this.itemOid = itemOid;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public void setOid(Number oid) {
        this.oid = oid;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRefundId(Number refundId) {
        this.refundId = refundId;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setServiceDetailUrl(String serviceDetailUrl) {
        this.serviceDetailUrl = serviceDetailUrl;
    }

    public void setServiceId(Number serviceId) {
        this.serviceId = serviceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }
}
