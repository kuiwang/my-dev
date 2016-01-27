package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.EnableScalingGroupResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.EnableScalingGroup.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class EnableScalingGroupRequest implements AliyunRequest<EnableScalingGroupResponse> {

    /**
     * 伸缩配置的ID
     */
    private String activeScalingConfigurationId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 最多可以支持20个。（需要在启动伸缩组后优先加入的既有实例）
     */
    private String instanceId1;

    /**
     * InstanceId.
     */
    private String instanceId10;

    /**
     * InstanceId.
     */
    private String instanceId11;

    /**
     * InstanceId.
     */
    private String instanceId12;

    /**
     * InstanceId.
     */
    private String instanceId13;

    /**
     * InstanceId.
     */
    private String instanceId14;

    /**
     * InstanceId.
     */
    private String instanceId15;

    /**
     * InstanceId.
     */
    private String instanceId16;

    /**
     * InstanceId.
     */
    private String instanceId17;

    /**
     * InstanceId.
     */
    private String instanceId18;

    /**
     * InstanceId.
     */
    private String instanceId19;

    /**
     * InstanceId
     */
    private String instanceId2;

    /**
     * InstanceId.
     */
    private String instanceId3;

    /**
     * InstanceId.
     */
    private String instanceId4;

    /**
     * InstanceId.
     */
    private String instanceId5;

    /**
     * InstanceId.
     */
    private String instanceId6;

    /**
     * InstanceId.
     */
    private String instanceId7;

    /**
     * InstanceId.
     */
    private String instanceId8;

    /**
     * InstanceId.
     */
    private String instanceId9;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * Scaling Group的ID，用户账号下唯一。
     */
    private String scalingGroupId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(scalingGroupId, "scalingGroupId");
    }

    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.EnableScalingGroup.2014-08-28";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceId1() {
        return this.instanceId1;
    }

    public String getInstanceId10() {
        return this.instanceId10;
    }

    public String getInstanceId11() {
        return this.instanceId11;
    }

    public String getInstanceId12() {
        return this.instanceId12;
    }

    public String getInstanceId13() {
        return this.instanceId13;
    }

    public String getInstanceId14() {
        return this.instanceId14;
    }

    public String getInstanceId15() {
        return this.instanceId15;
    }

    public String getInstanceId16() {
        return this.instanceId16;
    }

    public String getInstanceId17() {
        return this.instanceId17;
    }

    public String getInstanceId18() {
        return this.instanceId18;
    }

    public String getInstanceId19() {
        return this.instanceId19;
    }

    public String getInstanceId2() {
        return this.instanceId2;
    }

    public String getInstanceId3() {
        return this.instanceId3;
    }

    public String getInstanceId4() {
        return this.instanceId4;
    }

    public String getInstanceId5() {
        return this.instanceId5;
    }

    public String getInstanceId6() {
        return this.instanceId6;
    }

    public String getInstanceId7() {
        return this.instanceId7;
    }

    public String getInstanceId8() {
        return this.instanceId8;
    }

    public String getInstanceId9() {
        return this.instanceId9;
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
    public Class<EnableScalingGroupResponse> getResponseClass() {
        return EnableScalingGroupResponse.class;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ActiveScalingConfigurationId", this.activeScalingConfigurationId);
        txtParams.put("InstanceId.1", this.instanceId1);
        txtParams.put("InstanceId.10", this.instanceId10);
        txtParams.put("InstanceId.11", this.instanceId11);
        txtParams.put("InstanceId.12", this.instanceId12);
        txtParams.put("InstanceId.13", this.instanceId13);
        txtParams.put("InstanceId.14", this.instanceId14);
        txtParams.put("InstanceId.15", this.instanceId15);
        txtParams.put("InstanceId.16", this.instanceId16);
        txtParams.put("InstanceId.17", this.instanceId17);
        txtParams.put("InstanceId.18", this.instanceId18);
        txtParams.put("InstanceId.19", this.instanceId19);
        txtParams.put("InstanceId.2", this.instanceId2);
        txtParams.put("InstanceId.3", this.instanceId3);
        txtParams.put("InstanceId.4", this.instanceId4);
        txtParams.put("InstanceId.5", this.instanceId5);
        txtParams.put("InstanceId.6", this.instanceId6);
        txtParams.put("InstanceId.7", this.instanceId7);
        txtParams.put("InstanceId.8", this.instanceId8);
        txtParams.put("InstanceId.9", this.instanceId9);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
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

    public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
    }

    public void setInstanceId1(String instanceId1) {
        this.instanceId1 = instanceId1;
    }

    public void setInstanceId10(String instanceId10) {
        this.instanceId10 = instanceId10;
    }

    public void setInstanceId11(String instanceId11) {
        this.instanceId11 = instanceId11;
    }

    public void setInstanceId12(String instanceId12) {
        this.instanceId12 = instanceId12;
    }

    public void setInstanceId13(String instanceId13) {
        this.instanceId13 = instanceId13;
    }

    public void setInstanceId14(String instanceId14) {
        this.instanceId14 = instanceId14;
    }

    public void setInstanceId15(String instanceId15) {
        this.instanceId15 = instanceId15;
    }

    public void setInstanceId16(String instanceId16) {
        this.instanceId16 = instanceId16;
    }

    public void setInstanceId17(String instanceId17) {
        this.instanceId17 = instanceId17;
    }

    public void setInstanceId18(String instanceId18) {
        this.instanceId18 = instanceId18;
    }

    public void setInstanceId19(String instanceId19) {
        this.instanceId19 = instanceId19;
    }

    public void setInstanceId2(String instanceId2) {
        this.instanceId2 = instanceId2;
    }

    public void setInstanceId3(String instanceId3) {
        this.instanceId3 = instanceId3;
    }

    public void setInstanceId4(String instanceId4) {
        this.instanceId4 = instanceId4;
    }

    public void setInstanceId5(String instanceId5) {
        this.instanceId5 = instanceId5;
    }

    public void setInstanceId6(String instanceId6) {
        this.instanceId6 = instanceId6;
    }

    public void setInstanceId7(String instanceId7) {
        this.instanceId7 = instanceId7;
    }

    public void setInstanceId8(String instanceId8) {
        this.instanceId8 = instanceId8;
    }

    public void setInstanceId9(String instanceId9) {
        this.instanceId9 = instanceId9;
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

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
