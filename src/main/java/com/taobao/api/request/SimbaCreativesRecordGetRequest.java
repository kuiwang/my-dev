package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCreativesRecordGetResponse;

/**
 * TOP API: taobao.simba.creatives.record.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaCreativesRecordGetRequest implements
        TaobaoRequest<SimbaCreativesRecordGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 创意Id数组，最多200个
     */
    private String creativeIds;

    /**
     * 主人昵称
     */
    private String nick;

    public void setCreativeIds(String creativeIds) {
        this.creativeIds = creativeIds;
    }

    public String getCreativeIds() {
        return this.creativeIds;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.creatives.record.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("creative_ids", this.creativeIds);
        txtParams.put("nick", this.nick);
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

    public Class<SimbaCreativesRecordGetResponse> getResponseClass() {
        return SimbaCreativesRecordGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(creativeIds, "creativeIds");
        RequestCheckUtils.checkMaxListSize(creativeIds, 200, "creativeIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
