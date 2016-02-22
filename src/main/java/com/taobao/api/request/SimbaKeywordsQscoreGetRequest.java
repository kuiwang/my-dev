package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordsQscoreGetResponse;

/**
 * TOP API: taobao.simba.keywords.qscore.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaKeywordsQscoreGetRequest
        implements TaobaoRequest<SimbaKeywordsQscoreGetResponse> {

    /**
     * 推广组Id
     */
    private Long adgroupId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.keywords.qscore.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaKeywordsQscoreGetResponse> getResponseClass() {
        return SimbaKeywordsQscoreGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
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

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
