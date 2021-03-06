package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemQualificationCheckResponse;

/**
 * TOP API: taobao.item.qualification.check request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemQualificationCheckRequest
        implements TaobaoRequest<ItemQualificationCheckResponse> {

    /**
     * 类目ID
     */
    private Long categoryId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 需要校验的项
     */
    private String name;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 校验的内容
     */
    private String value;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkNotEmpty(value, "value");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.qualification.check";
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Class<ItemQualificationCheckResponse> getResponseClass() {
        return ItemQualificationCheckResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("name", this.name);
        txtParams.put("value", this.value);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
