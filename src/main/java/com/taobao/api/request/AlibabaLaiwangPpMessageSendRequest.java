package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangPpMessageSendResponse;

/**
 * TOP API: alibaba.laiwang.pp.message.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangPpMessageSendRequest implements
        TaobaoRequest<AlibabaLaiwangPpMessageSendResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 发送的消息体，使用json格式来进行发送.
     */
    private String message;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(message, "message");
    }

    @Override
    public String getApiMethodName() {
        return "alibaba.laiwang.pp.message.send";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Class<AlibabaLaiwangPpMessageSendResponse> getResponseClass() {
        return AlibabaLaiwangPpMessageSendResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message", this.message);
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

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
