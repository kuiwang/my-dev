package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CampaignPlatform;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.platform.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignPlatformGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7447342333864864515L;

    /**
     * 取得的推广计划的投放平台设置
     */
    @ApiField("campaign_platform")
    private CampaignPlatform campaignPlatform;

    public CampaignPlatform getCampaignPlatform() {
        return this.campaignPlatform;
    }

    public void setCampaignPlatform(CampaignPlatform campaignPlatform) {
        this.campaignPlatform = campaignPlatform;
    }

}
