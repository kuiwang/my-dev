package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroups.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupsChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2866841328427194142L;

    /**
     * 推广组分页对象
     */
    @ApiField("adgroups")
    private ADGroupPage adgroups;

    public ADGroupPage getAdgroups() {
        return this.adgroups;
    }

    public void setAdgroups(ADGroupPage adgroups) {
        this.adgroups = adgroups;
    }

}
