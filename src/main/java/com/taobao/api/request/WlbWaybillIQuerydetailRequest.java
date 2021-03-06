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
public class WlbWaybillIQuerydetailRequest
        implements TaobaoRequest<WlbWaybillIQuerydetailResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 面单查询请求
     */
    private String waybillDetailQueryRequest;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillDetailQueryRequest, "waybillDetailQueryRequest");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.querydetail";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WlbWaybillIQuerydetailResponse> getResponseClass() {
        return WlbWaybillIQuerydetailResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_detail_query_request", this.waybillDetailQueryRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWaybillDetailQueryRequest() {
        return this.waybillDetailQueryRequest;
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

    public void setWaybillDetailQueryRequest(String waybillDetailQueryRequest) {
        this.waybillDetailQueryRequest = waybillDetailQueryRequest;
    }
}
