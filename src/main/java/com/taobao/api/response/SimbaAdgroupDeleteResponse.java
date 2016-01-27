package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroup;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1887579366119257646L;

    /**
     * 被删除的推广组
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
