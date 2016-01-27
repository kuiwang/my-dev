package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdReservedUpdateResponse;

/**
 * TOP API: taobao.dd.reserved.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdReservedUpdateRequest implements TaobaoRequest<DdReservedUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 预定订单编号
     */
    private Long id;

    /**
     * 0-未标注 1-已到店 2-未到店 3-不来了
     */
    private Long mark;

    /**
     * 打印状态 0 : 未打印 1 : 已打印 2 : 已处理
     */
    private Long option;

    /**
     * 卖家备注
     */
    private String sellerMemo;

    /**
     * 淘宝店铺id
     */
    private String storeId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(storeId, "storeId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.dd.reserved.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public Long getMark() {
        return this.mark;
    }

    public Long getOption() {
        return this.option;
    }

    @Override
    public Class<DdReservedUpdateResponse> getResponseClass() {
        return DdReservedUpdateResponse.class;
    }

    public String getSellerMemo() {
        return this.sellerMemo;
    }

    public String getStoreId() {
        return this.storeId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("mark", this.mark);
        txtParams.put("option", this.option);
        txtParams.put("seller_memo", this.sellerMemo);
        txtParams.put("store_id", this.storeId);
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public void setOption(Long option) {
        this.option = option;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
