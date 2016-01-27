package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.campaignbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptCampaignbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4629517611549574984L;

    /**
     * 推广计划查询结果
     */
    @ApiField("rpt_campaign_base_list")
    private String rptCampaignBaseList;

    public String getRptCampaignBaseList() {
        return this.rptCampaignBaseList;
    }

    public void setRptCampaignBaseList(String rptCampaignBaseList) {
        this.rptCampaignBaseList = rptCampaignBaseList;
    }

}
