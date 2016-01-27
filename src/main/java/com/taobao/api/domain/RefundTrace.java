package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 订单全链路退款追踪详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class RefundTrace extends TaobaoObject {

    private static final long serialVersionUID = 3287677273178869127L;

    /**
     * 动作发生的时间
     */
    @ApiField("action_time")
    private Date actionTime;

    /**
     * 应用标题
     */
    @ApiField("app_title")
    private String appTitle;

    /**
     * 退款编号
     */
    @ApiField("refund_id")
    private Long refundId;

    /**
     * 备注字段
     */
    @ApiField("remark")
    private String remark;

    /**
     * 卖家的淘宝nick
     */
    @ApiField("seller_nick")
    private String sellerNick;

    /**
     * 回流的订单状态
     */
    @ApiField("status")
    private String status;

    /**
     * 交易tid
     */
    @ApiField("tid")
    private Long tid;

    public Date getActionTime() {
        return this.actionTime;
    }

    public String getAppTitle() {
        return this.appTitle;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

}
