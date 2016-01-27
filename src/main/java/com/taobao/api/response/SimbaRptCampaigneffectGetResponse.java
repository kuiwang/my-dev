package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.campaigneffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptCampaigneffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2516777339968659569L;

    /**
     * 推广计划效果报表数据对象
     */
    @ApiField("rpt_campaign_effect_list")
    private String rptCampaignEffectList;

    public String getRptCampaignEffectList() {
        return this.rptCampaignEffectList;
    }

    public void setRptCampaignEffectList(String rptCampaignEffectList) {
        this.rptCampaignEffectList = rptCampaignEffectList;
    }

}
