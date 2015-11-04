package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CampaignBudget;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.budget.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignBudgetUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6387378189632528387L;

    /**
     * 修改后的推广计划日限额
     */
    @ApiField("campaign_budget")
    private CampaignBudget campaignBudget;

    public void setCampaignBudget(CampaignBudget campaignBudget) {
        this.campaignBudget = campaignBudget;
    }

    public CampaignBudget getCampaignBudget() {
        return this.campaignBudget;
    }

}
