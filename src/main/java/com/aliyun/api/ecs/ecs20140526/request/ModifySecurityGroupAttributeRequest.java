package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.ModifySecurityGroupAttributeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifySecurityGroupAttribute.2014-05-26
 * request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:39
 */
public class ModifySecurityGroupAttributeRequest implements
        AliyunRequest<ModifySecurityGroupAttributeResponse> {

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
     * 修改后的安全组描述，不填则为空，默认值为空，[2,256]英文或中文字符，不能以http://和https://开头。
     */
    private String description;

    /**
     * 安全组所在的地域
     */
    private String regionId;

    /**
     * 需要修改的安全组ID
     */
    private String securityGroupId;

    /**
     * 修改后的安全组名称，不填则为空，默认值为空，[2,128]英文或中文字符，必须以大小字母或中文开头，可包含数字，”_”或”-”，
     * 这个值会展示在控制台。不能以http://和https://开头。
     */
    private String securityGroupName;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
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
        return "ecs.aliyuncs.com.ModifySecurityGroupAttribute.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Description", this.description);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityGroupId", this.securityGroupId);
        txtParams.put("SecurityGroupName", this.securityGroupName);
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

    public Class<ModifySecurityGroupAttributeResponse> getResponseClass() {
        return ModifySecurityGroupAttributeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(securityGroupId, "securityGroupId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
