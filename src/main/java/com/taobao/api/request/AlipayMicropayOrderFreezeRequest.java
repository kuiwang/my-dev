package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayMicropayOrderFreezeResponse;

/**
 * TOP API: alipay.micropay.order.freeze request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayMicropayOrderFreezeRequest implements
        TaobaoRequest<AlipayMicropayOrderFreezeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要冻结金额，[0.01,2000]，必须是正数，最多只能保留小数点两位,单位是元
     */
    private String amount;

    /**
     * 支付宝用户给应用的授权.
     */
    private String authToken;

    /**
     * 冻结资金的到期时间，超过此日期，冻结金会自动解冻,时间要求是:[当前时间+24h,订购时间-8h] .
     */
    private Date expireTime;

    /**
     * 冻结备注,maxLength=40
     */
    private String memo;

    /**
     * 商户订单号,只能由字母和数字组成，最大长度32.此外部订单号与支付宝的冻结订单号对应,注意
     * 应用id和订购者id和外部订单号必须保证唯一性。
     */
    private String merchantOrderNo;

    /**
     * 在解冻转账的时候的支付方式: NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD:
     * 在转账需要付款方用支付密码确认，才可以转账成功
     */
    private String payConfirm;

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

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public void setPayConfirm(String payConfirm) {
        this.payConfirm = payConfirm;
    }

    public String getPayConfirm() {
        return this.payConfirm;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.micropay.order.freeze";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("amount", this.amount);
        txtParams.put("auth_token", this.authToken);
        txtParams.put("expire_time", this.expireTime);
        txtParams.put("memo", this.memo);
        txtParams.put("merchant_order_no", this.merchantOrderNo);
        txtParams.put("pay_confirm", this.payConfirm);
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

    public Class<AlipayMicropayOrderFreezeResponse> getResponseClass() {
        return AlipayMicropayOrderFreezeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(amount, "amount");
        RequestCheckUtils.checkNotEmpty(expireTime, "expireTime");
        RequestCheckUtils.checkNotEmpty(memo, "memo");
        RequestCheckUtils.checkNotEmpty(merchantOrderNo, "merchantOrderNo");
        RequestCheckUtils.checkNotEmpty(payConfirm, "payConfirm");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
