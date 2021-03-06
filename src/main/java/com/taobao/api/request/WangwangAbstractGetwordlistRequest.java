package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangAbstractGetwordlistResponse;

/**
 * TOP API: taobao.wangwang.abstract.getwordlist request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class WangwangAbstractGetwordlistRequest
        implements TaobaoRequest<WangwangAbstractGetwordlistResponse> {

    /**
     * 传入参数的字符集
     */
    private String charset;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.abstract.getwordlist";
    }

    public String getCharset() {
        return this.charset;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WangwangAbstractGetwordlistResponse> getResponseClass() {
        return WangwangAbstractGetwordlistResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
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

    public void setCharset(String charset) {
        this.charset = charset;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
