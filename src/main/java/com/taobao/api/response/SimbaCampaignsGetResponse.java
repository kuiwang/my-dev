package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Campaign;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.campaigns.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCampaignsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2658777449949375267L;

    /**
     * 推广计划列表
     */
    @ApiListField("campaigns")
    @ApiField("campaign")
    private List<Campaign> campaigns;

    public List<Campaign> getCampaigns() {
        return this.campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

}
