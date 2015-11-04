package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemImgUploadResponse;

/**
 * TOP API: taobao.item.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemImgUploadRequest implements TaobaoUploadRequest<ItemImgUploadResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品图片id(如果是更新图片，则需要传该参数)
     */
    private Long id;

    /**
     * 商品图片内容类型:JPG,GIF;最大:500KB 。支持的文件类型：gif,jpg,jpeg,png<br />
     * 支持的文件类型为：gif,jpg,jpeg,png,bmp<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 是否将该图片设为主图,可选值:true,false;默认值:false(非主图)
     */
    private Boolean isMajor;

    /**
     * 商品数字ID，该参数必须<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * 图片序号
     */
    private Long position;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public Boolean getIsMajor() {
        return this.isMajor;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.img.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_major", this.isMajor);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("position", this.position);
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
        params.put("image", this.image);
        return params;
    }

    public Class<ItemImgUploadResponse> getResponseClass() {
        return ItemImgUploadResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
