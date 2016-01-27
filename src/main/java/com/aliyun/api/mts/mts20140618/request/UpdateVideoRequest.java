package com.aliyun.api.mts.mts20140618.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.mts.mts20140618.response.UpdateVideoResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: mts.aliyuncs.com.UpdateVideo.2014-06-18 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class UpdateVideoRequest implements AliyunRequest<UpdateVideoResponse> {

    /**
     * 使用截图接口获取到的视频封面图片<br />
     * 支持最大长度为：1152<br />
     * 支持的最大列表长度为：1152
     */
    private String coverUrl;

    /**
     * 视频的描述<br />
     * 支持最大长度为：512<br />
     * 支持的最大列表长度为：512
     */
    private String description;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 视频ID
     */
    private String mediaId;

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
     * 视频标签，如果有多个用逗号分隔<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String tags;

    private Long timestamp;

    /**
     * 视频标题<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(coverUrl, 1152, "coverUrl");
        RequestCheckUtils.checkMaxLength(description, 512, "description");
        RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
        RequestCheckUtils.checkMaxLength(tags, 256, "tags");
        RequestCheckUtils.checkMaxLength(title, 256, "title");
    }

    @Override
    public String getApiMethodName() {
        return "mts.aliyuncs.com.UpdateVideo.2014-06-18";
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMediaId() {
        return this.mediaId;
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
    public Class<UpdateVideoResponse> getResponseClass() {
        return UpdateVideoResponse.class;
    }

    public String getTags() {
        return this.tags;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("CoverUrl", this.coverUrl);
        txtParams.put("Description", this.description);
        txtParams.put("MediaId", this.mediaId);
        txtParams.put("Tags", this.tags);
        txtParams.put("Title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
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

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
