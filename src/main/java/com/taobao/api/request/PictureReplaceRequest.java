package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureReplaceResponse;

/**
 * TOP API: taobao.picture.replace request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureReplaceRequest implements TaobaoUploadRequest<PictureReplaceResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 图片二进制文件流,不能为空,允许png、jpg、gif图片格式
     */
    private FileItem imageData;

    /**
     * 要替换的图片的id，必须大于0
     */
    private Long pictureId;

    public void setImageData(FileItem imageData) {
        this.imageData = imageData;
    }

    public FileItem getImageData() {
        return this.imageData;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.picture.replace";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_id", this.pictureId);
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
        params.put("image_data", this.imageData);
        return params;
    }

    public Class<PictureReplaceResponse> getResponseClass() {
        return PictureReplaceResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(imageData, "imageData");
        RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
