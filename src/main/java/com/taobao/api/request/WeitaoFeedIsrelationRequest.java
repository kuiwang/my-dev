package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoFeedIsrelationResponse;

/**
 * TOP API: taobao.weitao.feed.isrelation request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoFeedIsrelationRequest implements TaobaoRequest<WeitaoFeedIsrelationResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 要查询的粉丝的淘宝昵称
     */
    private String fansNick;

    /**
     * 要查询的公共账号的淘宝昵称
     */
    private String sellerNick;

    public void setFansNick(String fansNick) {
        this.fansNick = fansNick;
    }

    public String getFansNick() {
        return this.fansNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.feed.isrelation";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fans_nick", this.fansNick);
        txtParams.put("seller_nick", this.sellerNick);
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

    public Class<WeitaoFeedIsrelationResponse> getResponseClass() {
        return WeitaoFeedIsrelationResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fansNick, "fansNick");
        RequestCheckUtils.checkNotEmpty(sellerNick, "sellerNick");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
