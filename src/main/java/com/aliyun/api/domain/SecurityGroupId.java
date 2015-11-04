package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 安全组ID
 *
 * @author auto create
 * @since 1.0, null
 */
public class SecurityGroupId extends TaobaoObject {

    private static final long serialVersionUID = 1888157716118581173L;

    /**
     * 安全组ID
     */
    @ApiField("SecurityGroupId")
    private String securityGroupId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}
