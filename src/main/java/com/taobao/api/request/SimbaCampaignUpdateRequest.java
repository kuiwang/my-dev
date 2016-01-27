package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignUpdateResponse;

/**
 * TOP API: taobao.simba.campaign.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:17
 */
public class SimbaCampaignUpdateRequest implements TaobaoRequest<SimbaCampaignUpdateResponse> {

    /**
     * 推广计划Id
     */
    private Long campaignId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 用户设置的上下限状态；offline-下线；online-上线；
     */
    private String onlineStatus;

    private Long timestamp;

    /**
     * 推广计划名称，不能多余40个字符，不能和客户其他推广计划同名。<br />
     * 支持最大长度为：40<br />
     * 支持的最大列表长度为：40
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(onlineStatus, "onlineStatus");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 40, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.campaign.update";
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

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    @Override
    public Class<SimbaCampaignUpdateResponse> getResponseClass() {
        return SimbaCampaignUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("nick", this.nick);
        txtParams.put("online_status", this.onlineStatus);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
