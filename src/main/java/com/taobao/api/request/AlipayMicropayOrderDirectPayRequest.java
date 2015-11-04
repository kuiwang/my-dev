package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayMicropayOrderDirectPayResponse;

/**
 * TOP API: alipay.micropay.order.direct.pay request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayMicropayOrderDirectPayRequest implements
        TaobaoRequest<AlipayMicropayOrderDirectPayResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 支付宝订单号，冻结流水号.这个是创建冻结订单支付宝返回的
     */
    private String alipayOrderNo;

    /**
     * 支付金额,区间必须在[0.01,30]，只能保留小数点后两位
     */
    private String amount;

    /**
     * 支付宝给应用的授权
     */
    private String authToken;

    /**
     * 支付备注
     */
    private String memo;

    /**
     * 收款方的支付宝ID
     */
    private String receiveUserId;

    /**
     * 本次转账的外部单据号（只能由字母和数字组成,maxlength=32
     */
    private String transferOutOrderNo;

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getReceiveUserId() {
        return this.receiveUserId;
    }

    public void setTransferOutOrderNo(String transferOutOrderNo) {
        this.transferOutOrderNo = transferOutOrderNo;
    }

    public String getTransferOutOrderNo() {
        return this.transferOutOrderNo;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.micropay.order.direct.pay";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alipay_order_no", this.alipayOrderNo);
        txtParams.put("amount", this.amount);
        txtParams.put("auth_token", this.authToken);
        txtParams.put("memo", this.memo);
        txtParams.put("receive_user_id", this.receiveUserId);
        txtParams.put("transfer_out_order_no", this.transferOutOrderNo);
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

    public Class<AlipayMicropayOrderDirectPayResponse> getResponseClass() {
        return AlipayMicropayOrderDirectPayResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(alipayOrderNo, "alipayOrderNo");
        RequestCheckUtils.checkNotEmpty(amount, "amount");
        RequestCheckUtils.checkNotEmpty(authToken, "authToken");
        RequestCheckUtils.checkNotEmpty(memo, "memo");
        RequestCheckUtils.checkNotEmpty(receiveUserId, "receiveUserId");
        RequestCheckUtils.checkNotEmpty(transferOutOrderNo, "transferOutOrderNo");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
