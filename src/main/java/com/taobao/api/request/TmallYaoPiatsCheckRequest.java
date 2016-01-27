package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallYaoPiatsCheckResponse;

/**
 * TOP API: tmall.yao.piats.check request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:52
 */
public class TmallYaoPiatsCheckRequest implements TaobaoRequest<TmallYaoPiatsCheckResponse> {

    /**
     * 子订单号
     */
    private Long bizOrderId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 药监码(多个用逗号分隔)
     */
    private String piatsCodes;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizOrderId, "bizOrderId");
        RequestCheckUtils.checkNotEmpty(piatsCodes, "piatsCodes");
        RequestCheckUtils.checkMaxListSize(piatsCodes, 10, "piatsCodes");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.yao.piats.check";
    }

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPiatsCodes() {
        return this.piatsCodes;
    }

    @Override
    public Class<TmallYaoPiatsCheckResponse> getResponseClass() {
        return TmallYaoPiatsCheckResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_order_id", this.bizOrderId);
        txtParams.put("piats_codes", this.piatsCodes);
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

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setPiatsCodes(String piatsCodes) {
        this.piatsCodes = piatsCodes;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
