package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UppShoppointSendResponse;

/**
 * TOP API: taobao.upp.shoppoint.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class UppShoppointSendRequest implements TaobaoRequest<UppShoppointSendResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家nick
     */
    private String buyerNick;

    /**
     * 处理的店铺积分数量
     */
    private Long pointNum;

    /**
     * 用于实际发放的时候关联系统发放记录，由预发放接口返回<br />
     * 支持的最大列表长度为：32
     */
    private Long transactionId;

    /**
     * 6:业务成功 4:业务失败<br />
     * 支持的最大列表长度为：1
     */
    private Long transactionStatus;

    /**
     * 业务发生的时间
     */
    private Date transactionTime;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setPointNum(Long pointNum) {
        this.pointNum = pointNum;
    }

    public Long getPointNum() {
        return this.pointNum;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionStatus(Long transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getTransactionStatus() {
        return this.transactionStatus;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime() {
        return this.transactionTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.upp.shoppoint.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("point_num", this.pointNum);
        txtParams.put("transaction_id", this.transactionId);
        txtParams.put("transaction_status", this.transactionStatus);
        txtParams.put("transaction_time", this.transactionTime);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<UppShoppointSendResponse> getResponseClass() {
        return UppShoppointSendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkNotEmpty(pointNum, "pointNum");
        RequestCheckUtils.checkNotEmpty(transactionId, "transactionId");
        RequestCheckUtils.checkNotEmpty(transactionStatus, "transactionStatus");
        RequestCheckUtils.checkNotEmpty(transactionTime, "transactionTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
