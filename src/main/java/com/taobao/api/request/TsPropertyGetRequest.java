package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TsPropertyGetResponse;

/**
 * TOP API: taobao.ts.property.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class TsPropertyGetRequest implements TaobaoRequest<TsPropertyGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 服务收费项code<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String serviceItemCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(serviceItemCode, "serviceItemCode");
        RequestCheckUtils.checkMaxLength(serviceItemCode, 64, "serviceItemCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ts.property.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TsPropertyGetResponse> getResponseClass() {
        return TsPropertyGetResponse.class;
    }

    public String getServiceItemCode() {
        return this.serviceItemCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("service_item_code", this.serviceItemCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
