package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.adgroup.nonsearchstates.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupNonsearchstatesUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1857399196514296372L;

    /**
     * 推广组列表
     */
    @ApiListField("adgroup_list")
    @ApiField("a_d_group")
    private List<ADGroup> adgroupList;

    public List<ADGroup> getAdgroupList() {
        return this.adgroupList;
    }

    public void setAdgroupList(List<ADGroup> adgroupList) {
        this.adgroupList = adgroupList;
    }

}
