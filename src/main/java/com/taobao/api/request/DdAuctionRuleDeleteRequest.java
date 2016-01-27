package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdAuctionRuleDeleteResponse;

/**
 * TOP API: taobao.dd.auction.rule.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdAuctionRuleDeleteRequest implements TaobaoRequest<DdAuctionRuleDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 规则ID
     */
    private Long id;

    /**
     * 是否是外卖
     */
    private Boolean isTakeout;

    /**
     * 店铺id
     */
    private String storeId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(isTakeout, "isTakeout");
        RequestCheckUtils.checkNotEmpty(storeId, "storeId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.dd.auction.rule.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsTakeout() {
        return this.isTakeout;
    }

    @Override
    public Class<DdAuctionRuleDeleteResponse> getResponseClass() {
        return DdAuctionRuleDeleteResponse.class;
    }

    public String getStoreId() {
        return this.storeId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_takeout", this.isTakeout);
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

    public void setIsTakeout(Boolean isTakeout) {
        this.isTakeout = isTakeout;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
