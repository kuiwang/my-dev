package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.ModifyDiskAttributeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifyDiskAttribute.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:38
 */
public class ModifyDiskAttributeRequest implements AliyunRequest<ModifyDiskAttributeResponse> {

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
     * 删除实例的时候是否删除此磁盘
     */
    private Boolean deleteWithInstance;

    /**
     * 磁盘描述，不填则保持原值，默认值为空，[0,256]英文或中文字符，磁盘描述会展示在控制台。不能以http://和https://开头。
     */
    private String description;

    /**
     * 磁盘ID
     */
    private String diskId;

    /**
     * 磁盘名称，不填则原值，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String diskName;

    public void setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
    }

    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskName() {
        return this.diskName;
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
        return "ecs.aliyuncs.com.ModifyDiskAttribute.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DeleteWithInstance", this.deleteWithInstance);
        txtParams.put("Description", this.description);
        txtParams.put("DiskId", this.diskId);
        txtParams.put("DiskName", this.diskName);
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

    public Class<ModifyDiskAttributeResponse> getResponseClass() {
        return ModifyDiskAttributeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(diskId, "diskId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
