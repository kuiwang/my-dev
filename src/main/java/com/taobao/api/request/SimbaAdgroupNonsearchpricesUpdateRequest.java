package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupNonsearchpricesUpdateResponse;

/**
 * TOP API: taobao.simba.adgroup.nonsearchprices.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupNonsearchpricesUpdateRequest
        implements TaobaoRequest<SimbaAdgroupNonsearchpricesUpdateResponse> {

    /**
     * 推广组id，通投位置价格，是否使用默认出价json 数组字符串，数组个数最多200个.
     * json数组中的key必须和对应实体ADGroup中的属性字段保持一致，否则对应的实体对象属性获取不到相应的值，
     * adgroupId,isNonsearchDefaultPrice不能为空
     * 。nonsearchMaxPrice是整数，以“分”为单位，不能小于5，不能大于日限额,不能大于9999分。
     * 启用非搜索默认出价时nonsearchMaxPrice为0
     */
    private String adgroupidPriceJson;

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
        RequestCheckUtils.checkNotEmpty(adgroupidPriceJson, "adgroupidPriceJson");
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
    }

    public String getAdgroupidPriceJson() {
        return this.adgroupidPriceJson;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroup.nonsearchprices.update";
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
    public Class<SimbaAdgroupNonsearchpricesUpdateResponse> getResponseClass() {
        return SimbaAdgroupNonsearchpricesUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroupid_price_json", this.adgroupidPriceJson);
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

    public void setAdgroupidPriceJson(String adgroupidPriceJson) {
        this.adgroupidPriceJson = adgroupidPriceJson;
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
