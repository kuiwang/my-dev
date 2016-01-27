package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserPermission;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sellercenter.subuser.permissions.roles.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SellercenterSubuserPermissionsRolesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1312366535668719381L;

    /**
     * 子账号被所拥有的权限
     */
    @ApiField("subuser_permission")
    private SubUserPermission subuserPermission;

    public SubUserPermission getSubuserPermission() {
        return this.subuserPermission;
    }

    public void setSubuserPermission(SubUserPermission subuserPermission) {
        this.subuserPermission = subuserPermission;
    }

}
