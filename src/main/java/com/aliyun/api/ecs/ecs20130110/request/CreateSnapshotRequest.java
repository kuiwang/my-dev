package com.aliyun.api.ecs.ecs20130110.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20130110.response.CreateSnapshotResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.CreateSnapshot.2013-01-10 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:34
 */
public class CreateSnapshotRequest implements AliyunRequest<CreateSnapshotResponse> {

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
     * 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一，最大不值过64个ASCII字符。 具体参见附录：如何保证幂等性。
     */
    private String clientToken;

    /**
     * 指定的磁盘ID
     */
    private String diskId;

    /**
     * 指定的实例ID
     */
    private String instanceId;

    /**
     * 快照的显示名称，由字母、数字、"-"组成，长度取值范围为[0,300]
     */
    private String snapshotName;

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskId() {
        return this.diskId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getSnapshotName() {
        return this.snapshotName;
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
        return "ecs.aliyuncs.com.CreateSnapshot.2013-01-10";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DiskId", this.diskId);
        txtParams.put("InstanceId", this.instanceId);
        txtParams.put("SnapshotName", this.snapshotName);
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

    public Class<CreateSnapshotResponse> getResponseClass() {
        return CreateSnapshotResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(diskId, "diskId");
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
