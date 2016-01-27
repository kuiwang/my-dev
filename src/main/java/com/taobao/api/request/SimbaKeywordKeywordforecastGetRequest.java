package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordKeywordforecastGetResponse;

/**
 * TOP API: taobao.simba.keyword.keywordforecast.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaKeywordKeywordforecastGetRequest implements
        TaobaoRequest<SimbaKeywordKeywordforecastGetResponse> {

    /**
     * 词的出价,范围在5-9999之间,单位分
     */
    private Long bidwordPrice;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 词ID
     */
    private Long keywordId;

    /**
     * 经典名表行
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordPrice, "bidwordPrice");
        RequestCheckUtils.checkNotEmpty(keywordId, "keywordId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.keyword.keywordforecast.get";
    }

    public Long getBidwordPrice() {
        return this.bidwordPrice;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getKeywordId() {
        return this.keywordId;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaKeywordKeywordforecastGetResponse> getResponseClass() {
        return SimbaKeywordKeywordforecastGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword_price", this.bidwordPrice);
        txtParams.put("keyword_id", this.keywordId);
        txtParams.put("nick", this.nick);
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

    public void setBidwordPrice(Long bidwordPrice) {
        this.bidwordPrice = bidwordPrice;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
