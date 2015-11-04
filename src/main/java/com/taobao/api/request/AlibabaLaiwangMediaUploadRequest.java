package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangMediaUploadResponse;

/**
 * TOP API: alibaba.laiwang.media.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangMediaUploadRequest implements
        TaobaoUploadRequest<AlibabaLaiwangMediaUploadResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要上传的文件内容.
     */
    private FileItem media;

    /**
     * 多媒体文件类型，目前支持: image(图片),audio(音频),video(视频)
     */
    private String type;

    public void setMedia(FileItem media) {
        this.media = media;
    }

    public FileItem getMedia() {
        return this.media;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alibaba.laiwang.media.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("type", this.type);
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

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("media", this.media);
        return params;
    }

    public Class<AlibabaLaiwangMediaUploadResponse> getResponseClass() {
        return AlibabaLaiwangMediaUploadResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(media, "media");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
