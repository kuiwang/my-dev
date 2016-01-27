package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallTemaiSubcatsSearchResponse;

/**
 * TOP API: tmall.temai.subcats.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class TmallTemaiSubcatsSearchRequest implements
        TaobaoRequest<TmallTemaiSubcatsSearchResponse> {

    /**
     * 父类目ID，固定是特卖前台一级类目id：50100982
     */
    private Long cat;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cat, "cat");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.temai.subcats.search";
    }

    public Long getCat() {
        return this.cat;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TmallTemaiSubcatsSearchResponse> getResponseClass() {
        return TmallTemaiSubcatsSearchResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat", this.cat);
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

    public void setCat(Long cat) {
        this.cat = cat;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
