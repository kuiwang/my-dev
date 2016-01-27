package com.scott.dev.taobao.api.subuser.domain;

import java.util.Date;
import java.util.List;

/**
 * 子账号角色
 */
public class Role {

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 修改时间
     */
    private Date modifiedTime;

    /**
     * 所拥有权限
     */
    private List<Permission> permissions;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 卖家Id
     */
    private Long sellerId;

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

}
