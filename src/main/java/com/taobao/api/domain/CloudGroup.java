package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 微淘粉丝分组信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class CloudGroup extends TaobaoObject {

    private static final long serialVersionUID = 6732623412441729553L;

    /**
     * 分组描述
     */
    @ApiField("desc")
    private String desc;

    /**
     * 分组表达式
     */
    @ApiField("expression")
    private String expression;

    /**
     * 分组id
     */
    @ApiField("group_id")
    private String groupId;

    /**
     * 分组名字
     */
    @ApiField("name")
    private String name;

    /**
     * 分组状态
     */
    @ApiField("status")
    private String status;

    public String getDesc() {
        return this.desc;
    }

    public String getExpression() {
        return this.expression;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
