package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroup;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5826413313748671865L;

    /**
     * 新增加的推广组
     */
    @ApiField("adgroup")
    private ADGroup adgroup;

    public void setAdgroup(ADGroup adgroup) {
        this.adgroup = adgroup;
    }

    public ADGroup getAdgroup() {
        return this.adgroup;
    }

}
