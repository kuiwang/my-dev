package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 投放人群
 *
 * @author auto create
 * @since 1.0, null
 */
public class Demographic extends TaobaoObject {

    private static final long serialVersionUID = 7154196848167316445L;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 投放人群所属的组ID
     */
    @ApiField("group_id")
    private Long groupId;

    /**
     * 投放人群所属组的组名
     */
    @ApiField("group_name")
    private String groupName;

    /**
     * 投放人群ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 最后修改时间
     */
    @ApiField("last_update_time")
    private Date lastUpdateTime;

    /**
     * 投放人群名称
     */
    @ApiField("name")
    private String name;

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
