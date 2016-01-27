package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpItemInfoListGetResponse;

/**
 * TOP API: taobao.sp.item.info.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpItemInfoListGetRequest implements TaobaoRequest<SpItemInfoListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品ID,可批量查询, 多个商品ID中间用逗号分隔, 最多可查20个id, ID之间不能有空格
     */
    private String id;

    /**
     * 每个站点的唯一Key(加密的site id)
     */
    private String siteKey;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.item.info.list.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public Class<SpItemInfoListGetResponse> getResponseClass() {
        return SpItemInfoListGetResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("site_key", this.siteKey);
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

    public void setId(String id) {
        this.id = id;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
