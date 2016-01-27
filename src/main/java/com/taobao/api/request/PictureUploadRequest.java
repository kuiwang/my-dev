package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUploadResponse;

/**
 * TOP API: taobao.picture.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureUploadRequest implements TaobaoUploadRequest<PictureUploadResponse> {

    /**
     * 图片上传的来源，有电脑版本宝贝发布，手机版本宝贝发布 client:computer电脑版本宝贝使用
     * client:phone手机版本宝贝使用
     */
    private String clientType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 包括后缀名的图片标题,不能为空，如Bule.jpg,有些卖家希望图片上传后取图片文件的默认名
     */
    private String imageInputTitle;

    /**
     * 图片二进制文件流,不能为空,允许png、jpg、gif图片格式,3M以内。
     */
    private FileItem img;

    /**
     * 图片分类ID，设置具体某个分类ID或设置0上传到默认分类，只能传入一个分类<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：0
     */
    private Long pictureCategoryId;

    private Long timestamp;

    /**
     * 图片标题,如果为空,传的图片标题就取去掉后缀名的image_input_title,超过50字符长度会截取50字符,重名会在标题末尾加
     * "(1)";标题末尾已经有"(数字)"了，则数字加1
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(imageInputTitle, "imageInputTitle");
        RequestCheckUtils.checkNotEmpty(img, "img");
        RequestCheckUtils.checkNotEmpty(pictureCategoryId, "pictureCategoryId");
        RequestCheckUtils.checkMaxValue(pictureCategoryId, 9223372036854775807L,
                "pictureCategoryId");
        RequestCheckUtils.checkMinValue(pictureCategoryId, 0L, "pictureCategoryId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.upload";
    }

    public String getClientType() {
        return this.clientType;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("img", this.img);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getImageInputTitle() {
        return this.imageInputTitle;
    }

    public FileItem getImg() {
        return this.img;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    @Override
    public Class<PictureUploadResponse> getResponseClass() {
        return PictureUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("client_type", this.clientType);
        txtParams.put("image_input_title", this.imageInputTitle);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("title", this.title);
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

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setImageInputTitle(String imageInputTitle) {
        this.imageInputTitle = imageInputTitle;
    }

    public void setImg(FileItem img) {
        this.img = img;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
