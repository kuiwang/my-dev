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
public class AlipayMicropayOrderUnfreezeRequest
        implements TaobaoRequest<AlipayMicropayOrderUnfreezeResponse> {

    /**
     * 冻结资金流水号,在创建资金订单时支付宝返回的流水号
     */
    private String alipayOrderNo;

    /**
     * 支付宝用户给应用的授权.
     */
    private String authToken;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 冻结备注
     */
    private String memo;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(alipayOrderNo, "alipayOrderNo");
        RequestCheckUtils.checkNotEmpty(memo, "memo");
    }

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    @Override
    public String getApiMethodName() {
        return "alipay.micropay.order.unfreeze";
    }

    public String getAuthToken() {
        return this.authToken;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMemo() {
        return this.memo;
    }

    @Override
    public Class<AlipayMicropayOrderUnfreezeResponse> getResponseClass() {
        return AlipayMicropayOrderUnfreezeResponse.class;
    }

    @Override
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

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
