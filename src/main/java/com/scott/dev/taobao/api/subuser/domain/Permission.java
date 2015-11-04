package com.scott.dev.taobao.api.subuser.domain;

/**
 * 权限信息
 */
public class Permission {

    /**
     * 1 :允许授权 2：不允许授权 6：不允许授权但默认已有权限
     */
    private Long isAuthorize;

    /**
     * 父权限code
     */
    private String parentCode;

    /**
     * 注册到权限中心的code值
     */
    private String permissionCode;

    /**
     * 权限名称
     */
    private String permissionName;

    public Long getIsAuthorize() {
        return this.isAuthorize;
    }

    public void setIsAuthorize(Long isAuthorize) {
        this.isAuthorize = isAuthorize;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getPermissionCode() {
        return this.permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionName() {
        return this.permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
