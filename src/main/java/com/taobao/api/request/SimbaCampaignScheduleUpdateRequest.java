package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignScheduleUpdateResponse;

/**
 * TOP API: taobao.simba.campaign.schedule.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:17
 */
public class SimbaCampaignScheduleUpdateRequest implements
        TaobaoRequest<SimbaCampaignScheduleUpdateResponse> {

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

    /**
     * 值为：“all”；或者用“;”分割的每天的设置字符串，该字符串为用“,”分割的时段折扣字符串，格式为：起始时间-结束时间:折扣，
     * 其中时间是24小时格式记录，折扣是1-150整数，表示折扣百分比；
     */
    private String schedule;

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

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.campaign.schedule.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("nick", this.nick);
        txtParams.put("schedule", this.schedule);
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

    public Class<SimbaCampaignScheduleUpdateResponse> getResponseClass() {
        return SimbaCampaignScheduleUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(schedule, "schedule");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
