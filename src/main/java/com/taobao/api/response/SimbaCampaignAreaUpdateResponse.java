package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CampaignArea;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.area.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignAreaUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1343516627557692651L;

    /**
     * 修改后的推广计划投放地域
     */
    @ApiField("campaign_area")
    private CampaignArea campaignArea;

    public CampaignArea getCampaignArea() {
        return this.campaignArea;
    }

    public void setCampaignArea(CampaignArea campaignArea) {
        this.campaignArea = campaignArea;
    }

}
