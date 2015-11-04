package com.aliyun.api.mts.mts20140618.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.mts.mts20140618.response.AddVideoResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: mts.aliyuncs.com.AddVideo.2014-06-18 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:42
 */
public class AddVideoRequest implements AliyunRequest<AddVideoResponse> {

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
     * 视频的描述<br />
     * 支持最大长度为：512<br />
     * 支持的最大列表长度为：512
     */
    private String description;

    /**
     * 用户授权给视频服务访问的OSS Bucket下的视频文件地址<br />
     * 支持最大长度为：1152<br />
     * 支持的最大列表长度为：1152
     */
    private String inputFileUrl;

    /**
     * 视频标签，如果有多个用逗号分隔<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String tags;

    /**
     * 视频标题<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String title;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
    }

    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
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
        return "mts.aliyuncs.com.AddVideo.2014-06-18";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Description", this.description);
        txtParams.put("InputFileUrl", this.inputFileUrl);
        txtParams.put("Tags", this.tags);
        txtParams.put("Title", this.title);
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

    public Class<AddVideoResponse> getResponseClass() {
        return AddVideoResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(description, 512, "description");
        RequestCheckUtils.checkNotEmpty(inputFileUrl, "inputFileUrl");
        RequestCheckUtils.checkMaxLength(inputFileUrl, 1152, "inputFileUrl");
        RequestCheckUtils.checkMaxLength(tags, 256, "tags");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 256, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
