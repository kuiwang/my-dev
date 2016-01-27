package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AthenaItemSolutionGetResponse;

/**
 * TOP API: taobao.athena.item.solution.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class AthenaItemSolutionGetRequest implements TaobaoRequest<AthenaItemSolutionGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 自定义问题的ID
     */
    private Long id;

    /**
     * 宝贝商品ID
     */
    private Long itemId;

    private Long timestamp;

    /**
     * 类型key
     */
    private String typeKey;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.athena.item.solution.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    @Override
    public Class<AthenaItemSolutionGetResponse> getResponseClass() {
        return AthenaItemSolutionGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("item_id", this.itemId);
        txtParams.put("type_key", this.typeKey);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }
}
