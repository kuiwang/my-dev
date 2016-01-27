package com.aliyun.api.ecs.ecs20130110.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20130110.response.ModifyInstanceAttributeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifyInstanceAttribute.2013-01-10 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:38
 */
public class ModifyInstanceAttributeRequest implements
        AliyunRequest<ModifyInstanceAttributeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 表示实例的主机名。必须以字母开始，并只可以含有字母、“-”字符。Windows系统最长为15字节，Linux系统最长为30字节
     */
    private String hostName;

    /**
     * 指定的实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 重置为用户指定的密码，密码只能是数字或者英文 字母。长度必须在6~30个英文字符
     */
    private String password;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 安全组代码。修改实例所属的安全组
     */
    private String securityGroupId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.ModifyInstanceAttribute.2013-01-10";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getPassword() {
        return this.password;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<ModifyInstanceAttributeResponse> getResponseClass() {
        return ModifyInstanceAttributeResponse.class;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("HostName", this.hostName);
        txtParams.put("InstanceId", this.instanceId);
        txtParams.put("InstanceName", this.instanceName);
        txtParams.put("Password", this.password);
        txtParams.put("SecurityGroupId", this.securityGroupId);
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

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
