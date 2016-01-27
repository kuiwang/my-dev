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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 面单申请
     */
    private String waybillApplyNewRequest;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyNewRequest, "waybillApplyNewRequest");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WlbWaybillIGetResponse> getResponseClass() {
        return WlbWaybillIGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_new_request", this.waybillApplyNewRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWaybillApplyNewRequest() {
        return this.waybillApplyNewRequest;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWaybillApplyNewRequest(String waybillApplyNewRequest) {
        this.waybillApplyNewRequest = waybillApplyNewRequest;
    }
}
