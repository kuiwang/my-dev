package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 小额支付单笔支付
 *
 * @author auto create
 * @since 1.0, null
 */
public class SinglePayDetail extends TaobaoObject {

    private static final long serialVersionUID = 6739265864821732815L;

    /**
     * 支付宝冻结订单号
     */
    @ApiField("alipay_order_no")
    private String alipayOrderNo;

    /**
     * 本次支付金额
     */
    @ApiField("amount")
    private String amount;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 最近修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 本次支付url地址
     */
    @ApiField("pay_url")
    private String payUrl;

    /**
     * 收款人的userId
     */
    @ApiField("receive_user_id")
    private String receiveUserId;

    /**
     * 本次支付的支付宝流水号
     */
    @ApiField("transfer_order_no")
    private String transferOrderNo;

    /**
     * 本次支付的外部单据号
     */
    @ApiField("transfer_out_order_no")
    private String transferOutOrderNo;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public String getAmount() {
        return this.amount;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getPayUrl() {
        return this.payUrl;
    }

    public String getReceiveUserId() {
        return this.receiveUserId;
    }

    public String getTransferOrderNo() {
        return this.transferOrderNo;
    }

    public String getTransferOutOrderNo() {
        return this.transferOutOrderNo;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public void setTransferOrderNo(String transferOrderNo) {
        this.transferOrderNo = transferOrderNo;
    }

    public void setTransferOutOrderNo(String transferOutOrderNo) {
        this.transferOutOrderNo = transferOutOrderNo;
    }

}
