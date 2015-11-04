package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignScheduleGetResponse;

/**
 * TOP API: taobao.simba.campaign.schedule.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:17
 */
public class SimbaCampaignScheduleGetRequest implements
        TaobaoRequest<SimbaCampaignScheduleGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广计划Id
     */
    private Long campaignId;

    /**
     * 主人昵称
     */
    private String nick;

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
        return "taobao.simba.campaign.schedule.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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

    public Class<SimbaCampaignScheduleGetResponse> getResponseClass() {
        return SimbaCampaignScheduleGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
