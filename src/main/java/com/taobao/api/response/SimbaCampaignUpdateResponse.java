package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Campaign;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6858316861973675196L;

    /**
     * 修改后的推广计划
     */
    @ApiField("campaign")
    private Campaign campaign;

    public Campaign getCampaign() {
        return this.campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

}
