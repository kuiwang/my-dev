package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillIQuerydetailResponse;

/**
 * TOP API: taobao.wlb.waybill.i.querydetail request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillIQuerydetailRequest implements TaobaoRequest<WlbWaybillIQuerydetailResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 面单查询请求
     */
    private String waybillDetailQueryRequest;

    public void setWaybillDetailQueryRequest(String waybillDetailQueryRequest) {
        this.waybillDetailQueryRequest = waybillDetailQueryRequest;
    }

    public String getWaybillDetailQueryRequest() {
        return this.waybillDetailQueryRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.querydetail";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_detail_query_request", this.waybillDetailQueryRequest);
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

    public Class<WlbWaybillIQuerydetailResponse> getResponseClass() {
        return WlbWaybillIQuerydetailResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillDetailQueryRequest, "waybillDetailQueryRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
