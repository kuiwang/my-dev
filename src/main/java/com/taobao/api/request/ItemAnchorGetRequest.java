package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemAnchorGetResponse;

/**
 * TOP API: taobao.item.anchor.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemAnchorGetRequest implements TaobaoRequest<ItemAnchorGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 对应类目编号
     */
    private Long catId;

    /**
     * 宝贝模板类型是人工打标还是自动打标：人工打标为1，自动打标为0.人工和自动打标为-1.<br />
     * 支持最大值为：1<br />
     * 支持最小值为：-1
     */
    private Long type;

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.anchor.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("type", this.type);
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

    public Class<ItemAnchorGetResponse> getResponseClass() {
        return ItemAnchorGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(catId, "catId");
        RequestCheckUtils.checkNotEmpty(type, "type");
        RequestCheckUtils.checkMaxValue(type, 1L, "type");
        RequestCheckUtils.checkMinValue(type, -1L, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
