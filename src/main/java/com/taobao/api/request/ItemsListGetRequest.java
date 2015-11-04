package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsListGetResponse;

/**
 * TOP API: taobao.items.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemsListGetRequest implements TaobaoRequest<ItemsListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要返回的商品对象字段。可选值：Item商品结构体中字段均可返回(除item_weight,item_size)；多个字段用“,”分隔。
     * 如果想返回整个子对象，那字段为itemimg，如果是想返回子对象里面的字段，那字段为itemimg.url。
     */
    private String fields;

    /**
     * 商品数字id列表，多个num_iid用逗号隔开，一次不超过20个。
     */
    private String numIids;

    /**
     * 商品数字id列表，多个track_iid用逗号隔开，一次不超过20个。
     */
    private String trackIids;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setNumIids(String numIids) {
        this.numIids = numIids;
    }

    public String getNumIids() {
        return this.numIids;
    }

    public void setTrackIids(String trackIids) {
        this.trackIids = trackIids;
    }

    public String getTrackIids() {
        return this.trackIids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.items.list.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("num_iids", this.numIids);
        txtParams.put("track_iids", this.trackIids);
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

    public Class<ItemsListGetResponse> getResponseClass() {
        return ItemsListGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
