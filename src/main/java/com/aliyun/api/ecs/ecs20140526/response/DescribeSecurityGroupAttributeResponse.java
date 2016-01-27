package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Permission;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSecurityGroupAttribute.2014-05-26
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSecurityGroupAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 2634971431346995884L;

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

    /**
     * 安全组名称
     */
    @ApiField("SecurityGroupName")
    private String securityGroupName;

    /**
     * Vpc实例Id
     */
    @ApiField("VpcId")
    private String vpcId;

    public String getDescription() {
        return this.description;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}
