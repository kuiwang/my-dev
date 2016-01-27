package com.scott.dev.taobao.api.subuser.domain;

import java.util.List;

/**
 * 部门信息
 */
public class Department {

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 当前部门的父部门ID
     */
    private Long parentId;

    /**
     * 部门下关联的子账号id列表
     */
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
