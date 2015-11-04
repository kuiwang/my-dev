package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillIProductResponse;

/**
 * TOP API: taobao.wlb.waybill.i.product request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillIProductRequest implements TaobaoRequest<WlbWaybillIProductResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询物流商电子面单产品类型入参
     */
    private String waybillProductTypeRequest;

    public void setWaybillProductTypeRequest(String waybillProductTypeRequest) {
        this.waybillProductTypeRequest = waybillProductTypeRequest;
    }

    public String getWaybillProductTypeRequest() {
        return this.waybillProductTypeRequest;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.product";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_product_type_request", this.waybillProductTypeRequest);
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

    public Class<WlbWaybillIProductResponse> getResponseClass() {
        return WlbWaybillIProductResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillProductTypeRequest, "waybillProductTypeRequest");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
