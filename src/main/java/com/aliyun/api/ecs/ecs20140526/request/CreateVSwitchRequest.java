package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.CreateVSwitchResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.CreateVSwitch.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:35
 */
public class CreateVSwitchRequest implements AliyunRequest<CreateVSwitchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 新建的虚拟交换机分配的网络地址
     */
    private String cidrBlock;

    /**
     * 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一，最大不值过64个ASCII字符。
     */
    private String clientToken;

    /**
     * 虚拟交换机描述，[1,256]英文或中文字符，不能以http://和https://开头。
     */
    private String description;

    /**
     * 虚拟交换机名称，[1,128]英文或中文字符，不能以http://和https://开头。
     */
    private String vSwitchName;

    /**
     * 新建的虚拟交换机所在的虚拟网络
     */
    private String vpcId;

    /**
     * 可用区Id
     */
    private String zoneId;

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setvSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
    }

    public String getvSwitchName() {
        return this.vSwitchName;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "ecs.aliyuncs.com.CreateVSwitch.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("CidrBlock", this.cidrBlock);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("Description", this.description);
        txtParams.put("VSwitchName", this.vSwitchName);
        txtParams.put("VpcId", this.vpcId);
        txtParams.put("ZoneId", this.zoneId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<CreateVSwitchResponse> getResponseClass() {
        return CreateVSwitchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cidrBlock, "cidrBlock");
        RequestCheckUtils.checkNotEmpty(vpcId, "vpcId");
        RequestCheckUtils.checkNotEmpty(zoneId, "zoneId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
