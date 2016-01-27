package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家积分明细记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class SellerPointRecordModule extends TaobaoObject {

    private static final long serialVersionUID = 5782843623268193971L;

    /**
     * 业务扩展信息 ，用于ISV描述积分记录的具体业务信息
     */
    @ApiField("business_info")
    private String businessInfo;

    /**
     * 买家NICK
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 积分数量
     */
    @ApiField("point_num")
    private Long pointNum;

    /**
     * 记录状态 1成功 0冻结 -1失败
     */
    @ApiField("status")
    private Long status;

    /**
     * upp内部业务ID，由预扣或预发积分接口返回，ISV可以直接使用，或映射自己的业务ID。
     */
    @ApiField("transaction_id")
    private Long transactionId;

    /**
     * 业务发生时间
     */
    @ApiField("transaction_time")
    private Date transactionTime;

    /**
     * 3：ISV送积分 4：ISV扣减积分
     */
    @ApiField("type")
    private Long type;

    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Long getPointNum() {
        return this.pointNum;
    }

    public Long getStatus() {
        return this.status;
    }

    public Long getTransactionId() {
        return this.transactionId;
    }

    public Date getTransactionTime() {
        return this.transactionTime;
    }

    public Long getType() {
        return this.type;
    }

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setPointNum(Long pointNum) {
        this.pointNum = pointNum;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
