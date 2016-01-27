package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TicketItemsGetResponse;

/**
 * TOP API: taobao.ticket.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TicketItemsGetRequest implements TaobaoRequest<TicketItemsGetResponse> {

    /**
     * 需要返回的门票商品（TicketItem）对象字段，如title,price,skus等。<br>
     * 可选值：TicketItem商品结构体中所有字段均可返回；多个字段用“,”分隔。
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 批量获取信息的商品标识。最多不能超过20个。
     */
    private String itemIds;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ticket.items.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    @Override
    public Class<TicketItemsGetResponse> getResponseClass() {
        return TicketItemsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("item_ids", this.itemIds);
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
