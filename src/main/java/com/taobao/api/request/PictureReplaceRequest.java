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

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片二进制文件流,不能为空,允许png、jpg、gif图片格式
     */
    private FileItem imageData;

    /**
     * 要替换的图片的id，必须大于0
     */
    private Long pictureId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(imageData, "imageData");
        RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.replace";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image_data", this.imageData);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getImageData() {
        return this.imageData;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    @Override
    public Class<PictureReplaceResponse> getResponseClass() {
        return PictureReplaceResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_id", this.pictureId);
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

    public void setImageData(FileItem imageData) {
        this.imageData = imageData;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
