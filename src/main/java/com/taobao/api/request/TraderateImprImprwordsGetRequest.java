package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateImprImprwordsGetResponse;

/**
 * TOP API: taobao.traderate.impr.imprwords.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TraderateImprImprwordsGetRequest implements
        TaobaoRequest<TraderateImprImprwordsGetResponse> {

    /**
     * 淘宝叶子类目id
     */
    private Long catLeafId;

    /**
     * 淘宝一级类目id
     */
    private Long catRootId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(catRootId, "catRootId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.traderate.impr.imprwords.get";
    }

    public Long getCatLeafId() {
        return this.catLeafId;
    }

    public Long getCatRootId() {
        return this.catRootId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TraderateImprImprwordsGetResponse> getResponseClass() {
        return TraderateImprImprwordsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_leaf_id", this.catLeafId);
        txtParams.put("cat_root_id", this.catRootId);
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

    public void setCatLeafId(Long catLeafId) {
        this.catLeafId = catLeafId;
    }

    public void setCatRootId(Long catRootId) {
        this.catRootId = catRootId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
