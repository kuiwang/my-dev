package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallTraderateFeedsGetResponse;

/**
 * TOP API: tmall.traderate.feeds.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallTraderateFeedsGetRequest implements TaobaoRequest<TmallTraderateFeedsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 交易子订单ID
     */
    private Long childTradeId;

    public void setChildTradeId(Long childTradeId) {
        this.childTradeId = childTradeId;
    }

    public Long getChildTradeId() {
        return this.childTradeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.traderate.feeds.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("child_trade_id", this.childTradeId);
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

    public Class<TmallTraderateFeedsGetResponse> getResponseClass() {
        return TmallTraderateFeedsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(childTradeId, "childTradeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
