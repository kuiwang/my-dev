package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 部门信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Department extends TaobaoObject {

    private static final long serialVersionUID = 5438497215388413923L;

    /**
     * 部门ID
     */
    @ApiField("department_id")
    private Long departmentId;

    /**
     * 部门名称
     */
    @ApiField("department_name")
    private String departmentName;

    /**
     * 当前部门的父部门ID
     */
    @ApiField("parent_id")
    private Long parentId;

    /**
     * 部门下关联的子账号id列表
     */
    @ApiListField("sub_user_ids")
    @ApiField("number")
    private List<Long> subUserIds;

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public List<Long> getSubUserIds() {
        return this.subUserIds;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setSubUserIds(List<Long> subUserIds) {
        this.subUserIds = subUserIds;
    }

}
