package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroupsbycampaignid.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupsbycampaignidGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6564461476114281575L;

    /**
     * 返回的推广组分页对象
     */
    @ApiField("adgroups")
    private ADGroupPage adgroups;

    public void setAdgroups(ADGroupPage adgroups) {
        this.adgroups = adgroups;
    }

    public ADGroupPage getAdgroups() {
        return this.adgroups;
    }

}
