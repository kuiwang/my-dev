package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuItemsGetResponse;

/**
 * TOP API: taobao.ju.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class JuItemsGetRequest implements TaobaoRequest<JuItemsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 代表需要返回的商品对象字段。可选值：ItemData商品结构体中所有字段均可返回；多个字段用","分隔。如果fields为空，
     * 或者不传该参数，就默认获得所有的字段
     */
    private String fields;

    /**
     * 商品ID列表。id列表超过6条也只返回前6条的商品
     */
    private String ids;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ju.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("ids", this.ids);
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

    public Class<JuItemsGetResponse> getResponseClass() {
        return JuItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ids, "ids");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
