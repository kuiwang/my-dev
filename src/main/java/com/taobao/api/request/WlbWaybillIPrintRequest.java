package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillIPrintResponse;

/**
 * TOP API: taobao.wlb.waybill.i.print request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillIPrintRequest implements TaobaoRequest<WlbWaybillIPrintResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 打印请求
     */
    private String waybillApplyPrintCheckRequest;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(waybillApplyPrintCheckRequest,
                "waybillApplyPrintCheckRequest");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.print";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WlbWaybillIPrintResponse> getResponseClass() {
        return WlbWaybillIPrintResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_print_check_request", this.waybillApplyPrintCheckRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWaybillApplyPrintCheckRequest() {
        return this.waybillApplyPrintCheckRequest;
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

    public void setWaybillApplyPrintCheckRequest(String waybillApplyPrintCheckRequest) {
        this.waybillApplyPrintCheckRequest = waybillApplyPrintCheckRequest;
    }
}
