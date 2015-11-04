package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderConsignResponse;

/**
 * TOP API: taobao.wlb.order.consign request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbOrderConsignRequest implements TaobaoRequest<WlbOrderConsignResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 物流宝订单编号<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String wlbOrderCode;

    public void setWlbOrderCode(String wlbOrderCode) {
        this.wlbOrderCode = wlbOrderCode;
    }

    public String getWlbOrderCode() {
        return this.wlbOrderCode;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.order.consign";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("wlb_order_code", this.wlbOrderCode);
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

    public Class<WlbOrderConsignResponse> getResponseClass() {
        return WlbOrderConsignResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(wlbOrderCode, "wlbOrderCode");
        RequestCheckUtils.checkMaxLength(wlbOrderCode, 64, "wlbOrderCode");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
