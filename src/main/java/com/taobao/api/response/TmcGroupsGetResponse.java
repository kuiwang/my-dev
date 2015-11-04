package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcGroup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tmc.groups.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcGroupsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8556957582691539558L;

    /**
     * 分组列表
     */
    @ApiListField("groups")
    @ApiField("tmc_group")
    private List<TmcGroup> groups;

    /**
     * 分组总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setGroups(List<TmcGroup> groups) {
        this.groups = groups;
    }

    public List<TmcGroup> getGroups() {
        return this.groups;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
