package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookYunpanTokenGetResponse;

/**
 * TOP API: taobao.ebook.yunpan.token.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookYunpanTokenGetRequest implements TaobaoRequest<EbookYunpanTokenGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 申请云盘应用的client_id
     */
    private String clientId;

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ebook.yunpan.token.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("client_id", this.clientId);
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

    public Class<EbookYunpanTokenGetResponse> getResponseClass() {
        return EbookYunpanTokenGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(clientId, "clientId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
