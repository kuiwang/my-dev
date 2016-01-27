package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 组及其成员列表
 */
public class GroupMember {

    /**
     * 组编号
     */
    private Long groupId;

    /**
     * 组名称
     */
    private String groupName;

    /**
     * 组成员列表，逗号分隔
     */
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
