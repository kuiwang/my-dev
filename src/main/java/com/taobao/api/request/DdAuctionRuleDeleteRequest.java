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

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIsTakeout(Boolean isTakeout) {
        this.isTakeout = isTakeout;
    }

    public Boolean getIsTakeout() {
        return this.isTakeout;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.dd.auction.rule.delete";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<DdAuctionRuleDeleteResponse> getResponseClass() {
        return DdAuctionRuleDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(isTakeout, "isTakeout");
        RequestCheckUtils.checkNotEmpty(storeId, "storeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
