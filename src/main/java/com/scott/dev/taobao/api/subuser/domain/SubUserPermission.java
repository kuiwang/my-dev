package com.scott.dev.taobao.api.subuser.domain;

import java.util.List;

/**
 * 子账号所拥有的权限对象(直接赋予的权限和通过角色赋予的权限的总和对象)
 */
public class SubUserPermission {

    /**
     * 子账号被直接赋予的权限点列表
     */
    private List<Permission> permissions;

    /**
     * 子账号被赋予的角色信息(Role)列表。列表中的角色对象只有role_id，role_name，permissions信息
     */
    private List<Role> roles;

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public List<Role> getRoles() {
        return this.roles;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
