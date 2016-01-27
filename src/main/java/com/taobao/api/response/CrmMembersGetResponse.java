package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BasicMember;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.crm.members.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembersGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6246255941772468917L;

    /**
     * 根据一定条件查询到卖家的会员
     */
    @ApiListField("members")
    @ApiField("basic_member")
    private List<BasicMember> members;

    /**
     * 记录总数
     */
    @ApiField("total_result")
    private Long totalResult;

    public List<BasicMember> getMembers() {
        return this.members;
    }

    public Long getTotalResult() {
        return this.totalResult;
    }

    public void setMembers(List<BasicMember> members) {
        this.members = members;
    }

    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

}
