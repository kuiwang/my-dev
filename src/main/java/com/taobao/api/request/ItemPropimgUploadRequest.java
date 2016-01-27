package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPropimgUploadResponse;

/**
 * TOP API: taobao.item.propimg.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemPropimgUploadRequest implements TaobaoUploadRequest<ItemPropimgUploadResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 属性图片ID。如果是新增不需要填写
     */
    private Long id;

    /**
     * 属性图片内容。类型:JPG,GIF;最大长度:500K;图片大小不超过:1M<br />
     * 支持的文件类型为：gif,jpg,jpeg,png,bmp<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 商品数字ID，必选<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * 图片位置
     */
    private Long position;

    /**
     * 属性列表。调用taobao.itemprops.get获取类目属性，属性必须是颜色属性，再用taobao.itempropvalues.
     * get取得vid。格式:pid:vid。
     */
    private String properties;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.propimg.upload";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public FileItem getImage() {
        return this.image;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getProperties() {
        return this.properties;
    }

    @Override
    public Class<ItemPropimgUploadResponse> getResponseClass() {
        return ItemPropimgUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("position", this.position);
        txtParams.put("properties", this.properties);
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
