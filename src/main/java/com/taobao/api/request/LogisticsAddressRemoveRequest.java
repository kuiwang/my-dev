package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressRemoveResponse;

/**
 * TOP API: taobao.logistics.address.remove request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsAddressRemoveRequest implements TaobaoRequest<LogisticsAddressRemoveResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 地址库ID
     */
    private Long contactId;

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getContactId() {
        return this.contactId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.remove";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("contact_id", this.contactId);
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

    public Class<LogisticsAddressRemoveResponse> getResponseClass() {
        return LogisticsAddressRemoveResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(contactId, "contactId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
