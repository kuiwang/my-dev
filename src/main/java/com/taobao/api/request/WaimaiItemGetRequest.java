package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiItemGetResponse;

/**
 * TOP API: taobao.waimai.item.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiItemGetRequest implements TaobaoRequest<WaimaiItemGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 只返回对应的字段信息，可输入(itemid,title,price,oriprice,goods_no,auction_status,
     * quantity ,auction_desc,pic_url,category_id,limit_buy,viceImage,sku,
     * recommend ,create_time,modify_time)，多个以英文逗号分隔
     */
    private String fields;

    /**
     * 外卖宝贝数字id
     */
    private Long itemId;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.item.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("item_id", this.itemId);
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

    public Class<WaimaiItemGetResponse> getResponseClass() {
        return WaimaiItemGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
