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
public class AlibabaLaiwangMediaUploadRequest
        implements TaobaoUploadRequest<AlibabaLaiwangMediaUploadResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 需要上传的文件内容.
     */
    private FileItem media;

    private Long timestamp;

    /**
     * 多媒体文件类型，目前支持: image(图片),audio(音频),video(视频)
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(media, "media");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    @Override
    public String getApiMethodName() {
        return "alibaba.laiwang.media.upload";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("media", this.media);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getMedia() {
        return this.media;
    }

    @Override
    public Class<AlibabaLaiwangMediaUploadResponse> getResponseClass() {
        return AlibabaLaiwangMediaUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setMedia(FileItem media) {
        this.media = media;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
