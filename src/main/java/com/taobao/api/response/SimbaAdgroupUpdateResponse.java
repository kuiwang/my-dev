package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroup;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1646536788912935138L;

    /**
     * 被修改的推广组
     */
    @ApiField("adgroup")
    private ADGroup adgroup;

    public ADGroup getAdgroup() {
        return this.adgroup;
    }

    public void setAdgroup(ADGroup adgroup) {
        this.adgroup = adgroup;
    }

}
