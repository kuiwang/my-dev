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
public class SimbaAdgroupNonsearchstatesUpdateRequest
        implements TaobaoRequest<SimbaAdgroupNonsearchstatesUpdateResponse> {

    /**
     * 推广组ID通投状态json数组字符串，数组个数最多200个。json数组中的key必须和对应实体ADGroup
     * 中的属性字段保持一致，否则对应的实体对象属性获取不到相应的值推广组ID,通投状态不传默认为1
     */
    private String adgroupidNonsearchstateJson;

    /**
     * 推广计划ID
     */
    private Long campaignId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupidNonsearchstateJson, "adgroupidNonsearchstateJson");
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public String getAdgroupidNonsearchstateJson() {
        return this.adgroupidNonsearchstateJson;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroup.nonsearchstates.update";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaAdgroupNonsearchstatesUpdateResponse> getResponseClass() {
        return SimbaAdgroupNonsearchstatesUpdateResponse.class;
    }

    @Override
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

    public void setAdgroupidNonsearchstateJson(String adgroupidNonsearchstateJson) {
        this.adgroupidNonsearchstateJson = adgroupidNonsearchstateJson;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
