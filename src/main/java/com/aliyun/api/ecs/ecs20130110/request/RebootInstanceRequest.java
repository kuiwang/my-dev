package com.aliyun.api.ecs.ecs20130110.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20130110.response.RebootInstanceResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.RebootInstance.2013-01-10 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:39
 */
public class RebootInstanceRequest implements AliyunRequest<RebootInstanceResponse> {

    /**
     * 重启机器时的是否强制关机策略。取值：true|false； 若为false则走正常关机流程；若为true则强制关机。
     * 如果不指定，则默认值为false。
     */
    private Boolean forceStop;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定实例的ID
     */
    private String instanceId;

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

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.RebootInstance.2013-01-10";
    }

    public Boolean getForceStop() {
        return this.forceStop;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceId() {
        return this.instanceId;
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
    public Class<RebootInstanceResponse> getResponseClass() {
        return RebootInstanceResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ForceStop", this.forceStop);
        txtParams.put("InstanceId", this.instanceId);
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

    public void setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
}
