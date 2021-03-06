package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaNonsearchAdgroupplacesUpdateResponse;

/**
 * TOP API: taobao.simba.nonsearch.adgroupplaces.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaNonsearchAdgroupplacesUpdateRequest
        implements TaobaoRequest<SimbaNonsearchAdgroupplacesUpdateResponse> {

    /**
     * 推广组id，投放位置id，出价，是否默认出价 json数组字符串，数组个数最多200个。是否默认出价不能为空,
     * 出价以“分”为单位，不能小于5分，不能大于最高日限额，不能大于9999分。
     * json数组中的key必须和对应实体AdGroupPlace中的属性字段保持一致，否则对应的实体对象属性获取不到相应的值
     */
    private String adgroupPlacesJson;

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
        RequestCheckUtils.checkNotEmpty(adgroupPlacesJson, "adgroupPlacesJson");
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public String getAdgroupPlacesJson() {
        return this.adgroupPlacesJson;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.nonsearch.adgroupplaces.update";
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
    public Class<SimbaNonsearchAdgroupplacesUpdateResponse> getResponseClass() {
        return SimbaNonsearchAdgroupplacesUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_places_json", this.adgroupPlacesJson);
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

    public void setAdgroupPlacesJson(String adgroupPlacesJson) {
        this.adgroupPlacesJson = adgroupPlacesJson;
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
