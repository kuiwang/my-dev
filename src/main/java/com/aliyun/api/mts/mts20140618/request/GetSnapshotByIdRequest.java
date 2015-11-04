package com.aliyun.api.mts.mts20140618.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.mts.mts20140618.response.GetSnapshotByIdResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: mts.aliyuncs.com.GetSnapshotById.2014-06-18 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:42
 */
public class GetSnapshotByIdRequest implements AliyunRequest<GetSnapshotByIdResponse> {

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
     * 需要获取的截图在视频中的时间点,单位毫秒
     */
    private Long time;

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTime() {
        return this.time;
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
        return "mts.aliyuncs.com.GetSnapshotById.2014-06-18";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("MediaId", this.mediaId);
        txtParams.put("Time", this.time);
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

    public Class<GetSnapshotByIdResponse> getResponseClass() {
        return GetSnapshotByIdResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
        RequestCheckUtils.checkNotEmpty(time, "time");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
