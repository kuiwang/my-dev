package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillIFullupdateResponse;

/**
 * TOP API: taobao.wlb.waybill.i.fullupdate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillIFullupdateRequest implements TaobaoRequest<WlbWaybillIFullupdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 更新面单信息请求
     */
    private String waybillApplyFullUpdateRequest;

    public void setWaybillApplyFullUpdateRequest(String waybillApplyFullUpdateRequest) {
        this.waybillApplyFullUpdateRequest = waybillApplyFullUpdateRequest;
    }

    public String getWaybillApplyFullUpdateRequest() {
        return this.waybillApplyFullUpdateRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.fullupdate";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_full_update_request", this.waybillApplyFullUpdateRequest);
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

    public Class<WlbWaybillIFullupdateResponse> getResponseClass() {
        return WlbWaybillIFullupdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyFullUpdateRequest,
                "waybillApplyFullUpdateRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
