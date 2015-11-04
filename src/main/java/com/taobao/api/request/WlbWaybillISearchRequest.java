package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillISearchResponse;

/**
 * TOP API: taobao.wlb.waybill.i.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillISearchRequest implements TaobaoRequest<WlbWaybillISearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询网点信息
     */
    private String waybillApplyRequest;

    public void setWaybillApplyRequest(String waybillApplyRequest) {
        this.waybillApplyRequest = waybillApplyRequest;
    }

    public String getWaybillApplyRequest() {
        return this.waybillApplyRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_request", this.waybillApplyRequest);
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

    public Class<WlbWaybillISearchResponse> getResponseClass() {
        return WlbWaybillISearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyRequest, "waybillApplyRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
