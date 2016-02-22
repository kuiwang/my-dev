package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.ModifyVSwitchAttributeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifyVSwitchAttribute.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:39
 */
public class ModifyVSwitchAttributeRequest
        implements AliyunRequest<ModifyVSwitchAttributeResponse> {

    /**
     * 修改后的虚拟交换机描述
     */
    private String description;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 需要修改的虚拟交换机的ID
     */
    private String vSwitchId;

    /**
     * 虚拟交换机名称
     */
    private String vSwitchName;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(vSwitchId, "vSwitchId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.ModifyVSwitchAttribute.2014-05-26";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<ModifyVSwitchAttributeResponse> getResponseClass() {
        return ModifyVSwitchAttributeResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Description", this.description);
        txtParams.put("VSwitchId", this.vSwitchId);
        txtParams.put("VSwitchName", this.vSwitchName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public String getvSwitchName() {
        return this.vSwitchName;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

    public void setvSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
    }
}
