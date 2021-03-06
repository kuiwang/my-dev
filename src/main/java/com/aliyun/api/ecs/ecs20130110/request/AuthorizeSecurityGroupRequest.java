package com.aliyun.api.ecs.ecs20130110.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20130110.response.AuthorizeSecurityGroupResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.AuthorizeSecurityGroup.2013-01-10 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:34
 */
public class AuthorizeSecurityGroupRequest
        implements AliyunRequest<AuthorizeSecurityGroupResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * P 协议，取值：tcp|udp|icmp|gre|all； All 表示同时支持四种协议
     */
    private String ipProtocol;

    /**
     * 网络类型，取值：internet|intranet； 默认值为internet
     */
    private String nicType;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 授权策略，参数值可为：accept（接受访问）、 drop（访问时丢弃包）、reject（访问时拒 绝包） 默认值为：accept
     */
    private String policy;

    /**
     * IP 协议相关的端口号范围，tcp、udp协议 的默认端口号，取值范围为1~65535；例
     * 如“1/200”意思是端口号范围为1~200， 若输入值为：“200/1”接口调用将报错。 icmp
     * 协议时端口号范围值为-1/-1，gre协 议时端口号范围值为-1/-1，当
     * IpProtocol为all时端口号范围值为-1/-1；取值范围
     */
    private String portRange;

    /**
     * 安全组所属Region ID
     */
    private String regionId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 安全组编码
     */
    private String securityGroupId;

    /**
     * 授权可访问目标安全组的源IP 地址范围 （采用CIDR格式来指定IP 地址范围）， 默认值为0.0.0.0/0（表示不受限制），其
     * 他支持的格式如10.159.6.18/12、 10.159.6.186、或 10.159.6.186-10.159.6.201（IP
     * 区间）
     */
    private String sourceCidrIp;

    /**
     * 授权同一Region内可访问目标安全组的源 安全组编码，SourceGroupId或者 SourceCidrIp参数必须设置一项，如果
     * 两项都设置，则默认对SourceCidrIp授 权。指定了该字段之后，NicType只能选 择intranet
     */
    private String sourceGroupId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ipProtocol, "ipProtocol");
        RequestCheckUtils.checkNotEmpty(portRange, "portRange");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(securityGroupId, "securityGroupId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.AuthorizeSecurityGroup.2013-01-10";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public String getNicType() {
        return this.nicType;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getPolicy() {
        return this.policy;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<AuthorizeSecurityGroupResponse> getResponseClass() {
        return AuthorizeSecurityGroupResponse.class;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("IpProtocol", this.ipProtocol);
        txtParams.put("NicType", this.nicType);
        txtParams.put("Policy", this.policy);
        txtParams.put("PortRange", this.portRange);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityGroupId", this.securityGroupId);
        txtParams.put("SourceCidrIp", this.sourceCidrIp);
        txtParams.put("SourceGroupId", this.sourceGroupId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public void setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
    }

    public void setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
