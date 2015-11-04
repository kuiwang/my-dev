package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemcatsAuthorizeGetResponse;

/**
 * TOP API: taobao.itemcats.authorize.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemcatsAuthorizeGetRequest implements TaobaoRequest<ItemcatsAuthorizeGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要返回的字段。目前支持有： brand.vid, brand.name, item_cat.cid, item_cat.name,
     * item_cat
     * .status,item_cat.sort_order,item_cat.parent_cid,item_cat.is_parent,
     * xinpin_item_cat.cid, xinpin_item_cat.name, xinpin_item_cat.status,
     * xinpin_item_cat.sort_order, xinpin_item_cat.parent_cid,
     * xinpin_item_cat.is_parent
     */
    private String fields;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.itemcats.authorize.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
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

    public Class<ItemcatsAuthorizeGetResponse> getResponseClass() {
        return ItemcatsAuthorizeGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
