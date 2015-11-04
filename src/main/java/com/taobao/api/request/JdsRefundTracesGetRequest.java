package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JdsRefundTracesGetResponse;

/**
 * TOP API: taobao.jds.refund.traces.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JdsRefundTracesGetRequest implements TaobaoRequest<JdsRefundTracesGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 淘宝的退款编号<br />
     * 支持最小值为：1
     */
    private Long refundId;

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jds.refund.traces.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("refund_id", this.refundId);
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

    public Class<JdsRefundTracesGetResponse> getResponseClass() {
        return JdsRefundTracesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
        RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
