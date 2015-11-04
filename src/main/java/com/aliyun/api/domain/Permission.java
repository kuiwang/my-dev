package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 安全组中的权限规则
 *
 * @author auto create
 * @since 1.0, null
 */
public class Permission extends TaobaoObject {

    private static final long serialVersionUID = 3777292688349146591L;

    /**
     * IP协议
     */
    @ApiField("IpProtocol")
    private String ipProtocol;

    /**
     * 网络类型
     */
    @ApiField("NicType")
    private String nicType;

    /**
     * 授权策略
     */
    @ApiField("Policy")
    private String policy;

    /**
     * 授权指定的端口范围
     */
    @ApiField("PortRange")
    private String portRange;

    /**
     * 授权给指定IP地址段
     */
    @ApiField("SourceCidrIp")
    private String sourceCidrIp;

    /**
     * 源安全组编码
     */
    @ApiField("SourceGroupId")
    private String sourceGroupId;

    /**
     * 源安全组归属信息
     */
    @ApiField("SourceGroupOwnerAccount")
    private String sourceGroupOwnerAccount;

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public String getNicType() {
        return this.nicType;
    }

    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    public String getPolicy() {
        return this.policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public void setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
    }

    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public void setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
    }

    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
    }

}
