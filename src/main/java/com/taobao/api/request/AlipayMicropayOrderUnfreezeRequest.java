package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayMicropayOrderUnfreezeResponse;

/**
 * TOP API: alipay.micropay.order.unfreeze request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayMicropayOrderUnfreezeRequest implements
        TaobaoRequest<AlipayMicropayOrderUnfreezeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 冻结资金流水号,在创建资金订单时支付宝返回的流水号
     */
    private String alipayOrderNo;

    /**
     * 支付宝用户给应用的授权.
     */
    private String authToken;

    /**
     * 冻结备注
     */
    private String memo;

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
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

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.micropay.order.unfreeze";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alipay_order_no", this.alipayOrderNo);
        txtParams.put("auth_token", this.authToken);
        txtParams.put("memo", this.memo);
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

    public Class<AlipayMicropayOrderUnfreezeResponse> getResponseClass() {
        return AlipayMicropayOrderUnfreezeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(alipayOrderNo, "alipayOrderNo");
        RequestCheckUtils.checkNotEmpty(memo, "memo");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
