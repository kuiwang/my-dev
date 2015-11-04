package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupCatmatch;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.catmatch.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupCatmatchGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7116662927363333182L;

    /**
     * 推广组的类目出价对象
     */
    @ApiField("adgroupcatmatch")
    private ADGroupCatmatch adgroupcatmatch;

    public void setAdgroupcatmatch(ADGroupCatmatch adgroupcatmatch) {
        this.adgroupcatmatch = adgroupcatmatch;
    }

    public ADGroupCatmatch getAdgroupcatmatch() {
        return this.adgroupcatmatch;
    }

}
