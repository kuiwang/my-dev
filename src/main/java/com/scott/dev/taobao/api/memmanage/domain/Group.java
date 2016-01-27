package com.scott.dev.taobao.api.memmanage.domain;

import java.util.Date;

//描述分组的数据结构
public class Group {

    //分组的创建时间
    private Date groupCreate;

    //分组的id
    private Number groupId;

    //分组的修改时间
    private Date groupModify;

    //分组的名称
    private String groupName;

    //分组所拥有的会员数量,如果返回值为-1，表示当前服务忙或数据在初始化。
    private Number memberCount;

    //分组的状态，1表示正常
    private String status;

    public Date getGroupCreate() {
        return groupCreate;
    }

    public Number getGroupId() {
        return groupId;
    }

    public Date getGroupModify() {
        return groupModify;
    }

    public String getGroupName() {
        return groupName;
    }

    public Number getMemberCount() {
        return memberCount;
    }

    public String getStatus() {
        return status;
    }

    public void setGroupCreate(Date groupCreate) {
        this.groupCreate = groupCreate;
    }

    public void setGroupId(Number groupId) {
        this.groupId = groupId;
    }

    public void setGroupModify(Date groupModify) {
        this.groupModify = groupModify;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setMemberCount(Number memberCount) {
        this.memberCount = memberCount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
