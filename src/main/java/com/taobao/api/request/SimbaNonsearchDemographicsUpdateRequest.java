package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaNonsearchDemographicsUpdateResponse;

/**
 * TOP API: taobao.simba.nonsearch.demographics.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:21
 */
public class SimbaNonsearchDemographicsUpdateRequest
        implements TaobaoRequest<SimbaNonsearchDemographicsUpdateResponse> {

    /**
     * 推广计划ID
     */
    private Long campaignId;

    /**
     * 投放人群维度Id，加价json数组字符串。数组长度不能超过15，
     * json数组中的key必须和相应实体DemographicSetting中的属性字段保持一致，否则对应的实体对象属性获取不到相应的值
     * incrementalPrice是整数，以“分”为单位，不能小于1，不能大于日限额,不能大于9999分;
     * 可以为0表示不加价；投放人群维度ID必须有效
     */
    private String demographicIdPriceJson;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(demographicIdPriceJson, "demographicIdPriceJson");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.nonsearch.demographics.update";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public String getDemographicIdPriceJson() {
        return this.demographicIdPriceJson;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaNonsearchDemographicsUpdateResponse> getResponseClass() {
        return SimbaNonsearchDemographicsUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("demographic_id_price_json", this.demographicIdPriceJson);
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

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setDemographicIdPriceJson(String demographicIdPriceJson) {
        this.demographicIdPriceJson = demographicIdPriceJson;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
