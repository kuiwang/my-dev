package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaNonsearchAdgroupplacesGetResponse;

/**
 * TOP API: taobao.simba.nonsearch.adgroupplaces.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaNonsearchAdgroupplacesGetRequest
        implements TaobaoRequest<SimbaNonsearchAdgroupplacesGetResponse> {

    /**
     * 推广组ID数组
     */
    private String adgroupIds;

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
        RequestCheckUtils.checkNotEmpty(adgroupIds, "adgroupIds");
        RequestCheckUtils.checkMaxListSize(adgroupIds, 200, "adgroupIds");
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public String getAdgroupIds() {
        return this.adgroupIds;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.nonsearch.adgroupplaces.get";
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
    public Class<SimbaNonsearchAdgroupplacesGetResponse> getResponseClass() {
        return SimbaNonsearchAdgroupplacesGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_ids", this.adgroupIds);
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

    public void setAdgroupIds(String adgroupIds) {
        this.adgroupIds = adgroupIds;
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
