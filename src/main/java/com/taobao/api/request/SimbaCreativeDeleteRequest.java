package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCreativeDeleteResponse;

/**
 * TOP API: taobao.simba.creative.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:17
 */
public class SimbaCreativeDeleteRequest implements TaobaoRequest<SimbaCreativeDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 创意Id
     */
    private Long creativeId;

    /**
     * 主人昵称
     */
    private String nick;

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public Long getCreativeId() {
        return this.creativeId;
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
        return "taobao.simba.creative.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("creative_id", this.creativeId);
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

    public Class<SimbaCreativeDeleteResponse> getResponseClass() {
        return SimbaCreativeDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(creativeId, "creativeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
