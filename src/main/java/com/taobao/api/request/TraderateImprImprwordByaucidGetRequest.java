package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateImprImprwordByaucidGetResponse;

/**
 * TOP API: taobao.traderate.impr.imprword.byaucid.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TraderateImprImprwordByaucidGetRequest implements
        TaobaoRequest<TraderateImprImprwordByaucidGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 淘宝的商品id
     */
    private Long auctionId;

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.traderate.impr.imprword.byaucid.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
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

    public Class<TraderateImprImprwordByaucidGetResponse> getResponseClass() {
        return TraderateImprImprwordByaucidGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
