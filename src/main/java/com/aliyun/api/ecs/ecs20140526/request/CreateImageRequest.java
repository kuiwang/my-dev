package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.CreateImageResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.CreateImage.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:34
 */
public class CreateImageRequest implements AliyunRequest<CreateImageResponse> {

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
     * 镜像的描述信息，长度限制在1~200个英文字符
     */
    private String description;

    /**
     * 镜像名称，[0,128]英文或中文字符。不能以http://和https://开头。
     */
    private String imageName;

    /**
     * 镜像版本号，长度限制在1~40个英文字符
     */
    private String imageVersion;

    /**
     * 镜像所在的Region ID
     */
    private String regionId;

    /**
     * 快照ID。从指定的快照创建自定义镜像。
     */
    private String snapshotId;

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

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public String getImageVersion() {
        return this.imageVersion;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotId() {
        return this.snapshotId;
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
        return "ecs.aliyuncs.com.CreateImage.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("Description", this.description);
        txtParams.put("ImageName", this.imageName);
        txtParams.put("ImageVersion", this.imageVersion);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SnapshotId", this.snapshotId);
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

    public Class<CreateImageResponse> getResponseClass() {
        return CreateImageResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(snapshotId, "snapshotId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}