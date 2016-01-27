package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupCatmatch;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.catmatch.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupCatmatchUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1478547793832797458L;

    /**
     * 推广组的类目出价对象
     */
    @ApiField("adgroupcatmatch")
    private ADGroupCatmatch adgroupcatmatch;

    public ADGroupCatmatch getAdgroupcatmatch() {
        return this.adgroupcatmatch;
    }

    public void setAdgroupcatmatch(ADGroupCatmatch adgroupcatmatch) {
        this.adgroupcatmatch = adgroupcatmatch;
    }

}
