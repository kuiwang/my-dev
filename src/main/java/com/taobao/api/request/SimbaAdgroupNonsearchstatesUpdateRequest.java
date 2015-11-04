package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupNonsearchstatesUpdateResponse;

/**
 * TOP API: taobao.simba.adgroup.nonsearchstates.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupNonsearchstatesUpdateRequest implements
        TaobaoRequest<SimbaAdgroupNonsearchstatesUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广组ID通投状态json数组字符串，数组个数最多200个。json数组中的key必须和对应实体ADGroup
     * 中的属性字段保持一致，否则对应的实体对象属性获取不到相应的值推广组ID,通投状态不传默认为1
     */
    private String adgroupidNonsearchstateJson;

    /**
     * 推广计划ID
     */
    private Long campaignId;

    /**
     * 主人昵称
     */
    private String nick;

    public void setAdgroupidNonsearchstateJson(String adgroupidNonsearchstateJson) {
        this.adgroupidNonsearchstateJson = adgroupidNonsearchstateJson;
    }

    public String getAdgroupidNonsearchstateJson() {
        return this.adgroupidNonsearchstateJson;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Long getCampaignId() {
        return this.campaignId;
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
        return "taobao.simba.adgroup.nonsearchstates.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroupid_nonsearchstate_json", this.adgroupidNonsearchstateJson);
        txtParams.put("campaign_id", this.campaignId);
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

    public Class<SimbaAdgroupNonsearchstatesUpdateResponse> getResponseClass() {
        return SimbaAdgroupNonsearchstatesUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupidNonsearchstateJson, "adgroupidNonsearchstateJson");
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
