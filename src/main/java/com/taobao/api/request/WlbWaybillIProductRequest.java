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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 查询物流商电子面单产品类型入参
     */
    private String waybillProductTypeRequest;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillProductTypeRequest, "waybillProductTypeRequest");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.product";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WlbWaybillIProductResponse> getResponseClass() {
        return WlbWaybillIProductResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_product_type_request", this.waybillProductTypeRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWaybillProductTypeRequest() {
        return this.waybillProductTypeRequest;
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

    public void setWaybillProductTypeRequest(String waybillProductTypeRequest) {
        this.waybillProductTypeRequest = waybillProductTypeRequest;
    }
}
