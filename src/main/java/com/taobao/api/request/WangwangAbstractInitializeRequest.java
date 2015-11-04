package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangAbstractInitializeResponse;

/**
 * TOP API: taobao.wangwang.abstract.initialize request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class WangwangAbstractInitializeRequest implements
        TaobaoRequest<WangwangAbstractInitializeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 传入参数的字符集
     */
    private String charset;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return this.charset;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wangwang.abstract.initialize";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
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

    public Class<WangwangAbstractInitializeResponse> getResponseClass() {
        return WangwangAbstractInitializeResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
