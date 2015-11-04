package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillIGetResponse;

/**
 * TOP API: taobao.wlb.waybill.i.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillIGetRequest implements TaobaoRequest<WlbWaybillIGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 面单申请
     */
    private String waybillApplyNewRequest;

    public void setWaybillApplyNewRequest(String waybillApplyNewRequest) {
        this.waybillApplyNewRequest = waybillApplyNewRequest;
    }

    public String getWaybillApplyNewRequest() {
        return this.waybillApplyNewRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_new_request", this.waybillApplyNewRequest);
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

    public Class<WlbWaybillIGetResponse> getResponseClass() {
        return WlbWaybillIGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyNewRequest, "waybillApplyNewRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
