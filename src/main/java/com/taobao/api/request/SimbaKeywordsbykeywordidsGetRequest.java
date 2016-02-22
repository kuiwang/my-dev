package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordsbykeywordidsGetResponse;

/**
 * TOP API: taobao.simba.keywordsbykeywordids.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaKeywordsbykeywordidsGetRequest
        implements TaobaoRequest<SimbaKeywordsbykeywordidsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 关键词Id数组，最多200个；
     */
    private String keywordIds;

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(keywordIds, 200, "keywordIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.keywordsbykeywordids.get";
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
    public Class<SimbaKeywordsbykeywordidsGetResponse> getResponseClass() {
        return SimbaKeywordsbykeywordidsGetResponse.class;
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
