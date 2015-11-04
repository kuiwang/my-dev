package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Permission;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSecurityGroupAttribute.2013-01-10
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSecurityGroupAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 1324971723589876696L;

    /**
     * 安全组描述信息
     */
    @ApiField("Description")
    private String description;

    /**
     * 安全组中的权限规则列表
     */
    @ApiListField("Permissions")
    @ApiField("Permission")
    private List<Permission> permissions;

    /**
     * 地域Id
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 请求的唯一ID，系统自动生成
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 安全组名称
     */
    @ApiField("SecurityGroupId")
    private String securityGroupId;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
