package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GroupMember;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.groupmember.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceGroupmemberGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6458573982124791387L;

    /**
     * 组及其成员列表
     */
    @ApiListField("group_member_list")
    @ApiField("group_member")
    private List<GroupMember> groupMemberList;

    public void setGroupMemberList(List<GroupMember> groupMemberList) {
        this.groupMemberList = groupMemberList;
    }

    public List<GroupMember> getGroupMemberList() {
        return this.groupMemberList;
    }

}
