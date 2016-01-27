package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Aliyun安全组信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SecurityGroup extends TaobaoObject {

    private static final long serialVersionUID = 1848591544415764421L;

    /**
     * 创建时间
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 安全组描述信息
     */
    @ApiField("Description")
    private String description;

    /**
     * 安全组ID
     */
    @ApiField("SecurityGroupId")
    private String securityGroupId;

    /**
     * 安全组名称，不填则为空，默认值为空
     */
    @ApiField("SecurityGroupName")
    private String securityGroupName;

    /**
     * 虚拟专有网络Id
     */
    @ApiField("VpcId")
    private String vpcId;

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return this.description;
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

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setDescription(String description) {
        this.description = description;
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
