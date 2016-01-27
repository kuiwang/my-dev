package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 组及其成员列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class GroupMember extends TaobaoObject {

    private static final long serialVersionUID = 4172433255354141317L;

    /**
     * 组编号
     */
    @ApiField("group_id")
    private Long groupId;

    /**
     * 组名称
     */
    @ApiField("group_name")
    private String groupName;

    /**
     * 组成员列表，逗号分隔
     */
    @ApiField("member_list")
    private String memberList;

    public Long getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getMemberList() {
        return this.memberList;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setMemberList(String memberList) {
        this.memberList = memberList;
    }

}
