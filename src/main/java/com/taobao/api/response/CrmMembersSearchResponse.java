package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CrmMember;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.crm.members.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembersSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2869694412875556633L;

    /**
     * 根据一定条件查询的卖家会员
     */
    @ApiListField("members")
    @ApiField("crm_member")
    private List<CrmMember> members;

    /**
     * 记录的总条数
     */
    @ApiField("total_result")
    private Long totalResult;

    public void setMembers(List<CrmMember> members) {
        this.members = members;
    }

    public List<CrmMember> getMembers() {
        return this.members;
    }

    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public Long getTotalResult() {
        return this.totalResult;
    }

}
