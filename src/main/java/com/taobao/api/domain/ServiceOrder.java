package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商城虚拟服务子订单数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class ServiceOrder extends TaobaoObject {

    private static final long serialVersionUID = 3874637522142927753L;

    /**
     * 卖家昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 服务所属的交易订单号。如果服务为一年包换，则item_oid这笔订单享受改服务的保护
     */
    @ApiField("item_oid")
    private Long itemOid;

    /**
     * 购买数量，取值范围为大于0的整数
     */
    @ApiField("num")
    private Long num;

    /**
     * 虚拟服务子订单订单号
     */
    @ApiField("oid")
    private Long oid;

    /**
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。
     */
    @ApiField("payment")
    private String payment;

    /**
     * 服务图片地址
     */
    @ApiField("pic_path")
    private String picPath;

    /**
     * 服务价格，精确到小数点后两位：单位:元
     */
    @ApiField("price")
    private String price;

    /**
     * 最近退款的id
     */
    @ApiField("refund_id")
    private Long refundId;

    /**
     * 卖家昵称
     */
    @ApiField("seller_nick")
    private String sellerNick;

    /**
     * 服务详情的URL地址
     */
    @ApiField("service_detail_url")
    private String serviceDetailUrl;

    /**
     * 服务数字id
     */
    @ApiField("service_id")
    private Long serviceId;

    /**
     * 商品名称
     */
    @ApiField("title")
    private String title;

    /**
     * 服务子订单总费用
     */
    @ApiField("total_fee")
    private String totalFee;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Long getItemOid() {
        return this.itemOid;
    }

    public Long getNum() {
        return this.num;
    }

    public Long getOid() {
        return this.oid;
    }

    public String getPayment() {
        return this.payment;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getServiceDetailUrl() {
        return this.serviceDetailUrl;
    }

    public Long getServiceId() {
        return this.serviceId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setItemOid(Long itemOid) {
        this.itemOid = itemOid;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setOid(Long oid) {
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

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setServiceDetailUrl(String serviceDetailUrl) {
        this.serviceDetailUrl = serviceDetailUrl;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

}
