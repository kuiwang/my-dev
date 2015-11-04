package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemGetResponse;

/**
 * TOP API: taobao.item.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemGetRequest implements TaobaoRequest<ItemGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要返回的商品对象字段，如title,price,desc_modules等。可选值：Item商品结构体中所有字段均可返回；多个字段用“
     * ,”分隔。<br>
     * 新增返回字段：item_weight(商品的重量，格式为数字，包含小数)、item_size(商品的体积，格式为数字，包含小数)、
     * change_prop（商品基础色数据）
     */
    private String fields;

    /**
     * 商品数字ID<br />
     * 支持最小值为：1
     */
    private Long numIid;

    /**
     * 商品数字ID(带有跟踪效果)
     */
    private String trackIid;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setTrackIid(String trackIid) {
        this.trackIid = trackIid;
    }

    public String getTrackIid() {
        return this.trackIid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("track_iid", this.trackIid);
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

    public Class<ItemGetResponse> getResponseClass() {
        return ItemGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMinValue(numIid, 1L, "numIid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
