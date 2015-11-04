package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignPlatformUpdateResponse;

/**
 * TOP API: taobao.simba.campaign.platform.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:16
 */
public class SimbaCampaignPlatformUpdateRequest implements
        TaobaoRequest<SimbaCampaignPlatformUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广计划Id
     */
    private Long campaignId;

    /**
     * 站内无线频道折扣。百分比，数值必须是大于等于 1小于等于200的整数
     */
    private Long mobileDiscount;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 非搜索投放频道代码数组，频道代码必须是直通车非搜索类频道列表中的值。<br />
     * 支持最大值为：128<br />
     * 支持最小值为：0
     */
    private String nonsearchChannels;

    /**
     * 溢价的百分比，必须是大于等于 1小于等于200的整数<br />
     * 支持最大值为：200<br />
     * 支持最小值为：1
     */
    private Long outsideDiscount;

    /**
     * 搜索投放频道代码数组，频道代码必须是直通车搜索类频道列表中的值，必须包含淘宝内网。<br />
     * 支持最大值为：128<br />
     * 支持最小值为：0
     */
    private String searchChannels;

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public void setMobileDiscount(Long mobileDiscount) {
        this.mobileDiscount = mobileDiscount;
    }

    public Long getMobileDiscount() {
        return this.mobileDiscount;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNonsearchChannels(String nonsearchChannels) {
        this.nonsearchChannels = nonsearchChannels;
    }

    public String getNonsearchChannels() {
        return this.nonsearchChannels;
    }

    public void setOutsideDiscount(Long outsideDiscount) {
        this.outsideDiscount = outsideDiscount;
    }

    public Long getOutsideDiscount() {
        return this.outsideDiscount;
    }

    public void setSearchChannels(String searchChannels) {
        this.searchChannels = searchChannels;
    }

    public String getSearchChannels() {
        return this.searchChannels;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.campaign.platform.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("mobile_discount", this.mobileDiscount);
        txtParams.put("nick", this.nick);
        txtParams.put("nonsearch_channels", this.nonsearchChannels);
        txtParams.put("outside_discount", this.outsideDiscount);
        txtParams.put("search_channels", this.searchChannels);
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

    public Class<SimbaCampaignPlatformUpdateResponse> getResponseClass() {
        return SimbaCampaignPlatformUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(mobileDiscount, "mobileDiscount");
        RequestCheckUtils.checkMaxListSize(nonsearchChannels, 10, "nonsearchChannels");
        RequestCheckUtils.checkNotEmpty(outsideDiscount, "outsideDiscount");
        RequestCheckUtils.checkMaxValue(outsideDiscount, 200L, "outsideDiscount");
        RequestCheckUtils.checkMinValue(outsideDiscount, 1L, "outsideDiscount");
        RequestCheckUtils.checkNotEmpty(searchChannels, "searchChannels");
        RequestCheckUtils.checkMaxListSize(searchChannels, 10, "searchChannels");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
