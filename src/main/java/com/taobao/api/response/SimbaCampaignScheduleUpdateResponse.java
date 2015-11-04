package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CampaignSchedule;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.campaign.schedule.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignScheduleUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3676599127652634619L;

    /**
     * 修改后的推广计划分时折扣
     */
    @ApiField("campaign_schedule")
    private CampaignSchedule campaignSchedule;

    public void setCampaignSchedule(CampaignSchedule campaignSchedule) {
        this.campaignSchedule = campaignSchedule;
    }

    public CampaignSchedule getCampaignSchedule() {
        return this.campaignSchedule;
    }

}
