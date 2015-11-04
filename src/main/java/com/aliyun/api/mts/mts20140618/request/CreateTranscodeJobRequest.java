package com.aliyun.api.mts.mts20140618.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.mts.mts20140618.response.CreateTranscodeJobResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: mts.aliyuncs.com.CreateTranscodeJob.2014-06-18 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:42
 */
public class CreateTranscodeJobRequest implements AliyunRequest<CreateTranscodeJobResponse> {

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
     * 媒资ID
     */
    private String mediaId;

    /**
     * 转码模板ID
     */
    private String templateId;

    /**
     * 转码时进行打水印功能,至多四个水印，中间以逗号分隔。 1、imageUrl 为水印的url,
     * 值需要urlencode,此水印需存储在oss上 2、referencePos 为参考位置："TopLeft", "TopRight",
     * "BottomLeft", "BottomRight" 3、dx与dy 为水印参考位置的偏移量，是相对于原视频画面大小，单位px或百分比
     * 4、width, height 为水印缩略尺寸，单位px (可选) 5、整串参数需要base64编码
     */
    private String watermarks;

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setWatermarks(String watermarks) {
        this.watermarks = watermarks;
    }

    public String getWatermarks() {
        return this.watermarks;
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
        return "mts.aliyuncs.com.CreateTranscodeJob.2014-06-18";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("MediaId", this.mediaId);
        txtParams.put("TemplateId", this.templateId);
        txtParams.put("Watermarks", this.watermarks);
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

    public Class<CreateTranscodeJobResponse> getResponseClass() {
        return CreateTranscodeJobResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
        RequestCheckUtils.checkNotEmpty(templateId, "templateId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
