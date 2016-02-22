package com.aliyun.api.bss.bss20140714.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.bss.bss20140714.response.SetResourceBusinessStatusResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: bss.aliyuncs.com.SetResourceBusinessStatus.2014-07-14 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class SetResourceBusinessStatusRequest
        implements AliyunRequest<SetResourceBusinessStatusResponse> {

    /**
     * 操作类型 expired:过期状态 normal:正常状态
     */
    private String businessStatus;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 要操作的实例Id可创建多实例的服务，需要填写此参数。
     */
    private String resourceId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 要操作的资源的类型。
     */
    private String resourceType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(businessStatus, "businessStatus");
        RequestCheckUtils.checkNotEmpty(resourceId, "resourceId");
        RequestCheckUtils.checkNotEmpty(resourceType, "resourceType");
    }

    @Override
    public String getApiMethodName() {
        return "bss.aliyuncs.com.SetResourceBusinessStatus.2014-07-14";
    }

    public String getBusinessStatus() {
        return this.businessStatus;
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

    public String getResourceId() {
        return this.resourceId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    @Override
    public Class<SetResourceBusinessStatusResponse> getResponseClass() {
        return SetResourceBusinessStatusResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("BusinessStatus", this.businessStatus);
        txtParams.put("ResourceId", this.resourceId);
        txtParams.put("ResourceType", this.resourceType);
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

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
