package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CampaignPlatform;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.platform.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignPlatformUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5313968121347713936L;

    /**
     * 修改后的推广计划投放平台设置
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
