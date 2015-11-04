package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillICancelResponse;

/**
 * TOP API: taobao.wlb.waybill.i.cancel request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillICancelRequest implements TaobaoRequest<WlbWaybillICancelResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 取消接口入参
     */
    private String waybillApplyCancelRequest;

    public void setWaybillApplyCancelRequest(String waybillApplyCancelRequest) {
        this.waybillApplyCancelRequest = waybillApplyCancelRequest;
    }

    public String getWaybillApplyCancelRequest() {
        return this.waybillApplyCancelRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.cancel";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_cancel_request", this.waybillApplyCancelRequest);
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

    public Class<WlbWaybillICancelResponse> getResponseClass() {
        return WlbWaybillICancelResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyCancelRequest, "waybillApplyCancelRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
