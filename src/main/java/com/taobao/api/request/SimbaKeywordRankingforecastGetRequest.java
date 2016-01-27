package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordRankingforecastGetResponse;

/**
 * TOP API: taobao.simba.keyword.rankingforecast.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaKeywordRankingforecastGetRequest implements
        TaobaoRequest<SimbaKeywordRankingforecastGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 关键词Id列表，最多支持1个
     */
    private String keywordIds;

    /**
     * 经典名表行
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(keywordIds, "keywordIds");
        RequestCheckUtils.checkMaxListSize(keywordIds, 1, "keywordIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.keyword.rankingforecast.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getKeywordIds() {
        return this.keywordIds;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaKeywordRankingforecastGetResponse> getResponseClass() {
        return SimbaKeywordRankingforecastGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("keyword_ids", this.keywordIds);
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

    public void setKeywordIds(String keywordIds) {
        this.keywordIds = keywordIds;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
