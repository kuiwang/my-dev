package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemQualificationSchemaGetResponse;

/**
 * TOP API: taobao.item.qualification.schema.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemQualificationSchemaGetRequest implements
        TaobaoRequest<ItemQualificationSchemaGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 传入商品发布时，叶子类目的ID
     */
    private Long categoryId;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.qualification.schema.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
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

    public Class<ItemQualificationSchemaGetResponse> getResponseClass() {
        return ItemQualificationSchemaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
