package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangAbstractAddwordResponse;

/**
 * TOP API: taobao.wangwang.abstract.addword request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class WangwangAbstractAddwordRequest implements
        TaobaoRequest<WangwangAbstractAddwordResponse> {

    /**
     * 传入参数的字符集
     */
    private String charset;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 关键词，长度大于0<br />
     * 支持最大长度为：12<br />
     * 支持的最大列表长度为：12
     */
    private String word;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(word, "word");
        RequestCheckUtils.checkMaxLength(word, 12, "word");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.abstract.addword";
    }

    public String getCharset() {
        return this.charset;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WangwangAbstractAddwordResponse> getResponseClass() {
        return WangwangAbstractAddwordResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
        txtParams.put("word", this.word);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWord() {
        return this.word;
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

    public void setWord(String word) {
        this.word = word;
    }
}
