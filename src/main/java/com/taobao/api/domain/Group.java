package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 描述分组的数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Group extends TaobaoObject {

    private static final long serialVersionUID = 7749985611894492669L;

    /**
     * 分组的创建时间
     */
    @ApiField("group_create")
    private Date groupCreate;

    /**
     * 分组的id
     */
    @ApiField("group_id")
    private Long groupId;

    /**
     * 分组的修改时间
     */
    @ApiField("group_modify")
    private Date groupModify;

    /**
     * 分组的名称
     */
    @ApiField("group_name")
    private String groupName;

    /**
     * 分组所拥有的会员数量,如果返回值为-1，表示当前服务忙或数据在初始化。
     */
    @ApiField("member_count")
    private Long memberCount;

    /**
     * 分组的状态，1表示正常
     */
    @ApiField("status")
    private String status;

    public Date getGroupCreate() {
        return this.groupCreate;
    }

    public void setGroupCreate(Date groupCreate) {
        this.groupCreate = groupCreate;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Date getGroupModify() {
        return this.groupModify;
    }

    public void setGroupModify(Date groupModify) {
        this.groupModify = groupModify;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getMemberCount() {
        return this.memberCount;
    }

    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
