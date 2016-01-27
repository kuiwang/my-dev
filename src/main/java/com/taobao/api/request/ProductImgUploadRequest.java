package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductImgUploadResponse;

/**
 * TOP API: taobao.product.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductImgUploadRequest implements TaobaoUploadRequest<ProductImgUploadResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品图片ID.修改图片时需要传入
     */
    private Long id;

    /**
     * 图片内容.图片最大为500K,只支持JPG,GIF格式.<br />
     * 支持的文件类型为：gif,jpg,png,jpeg<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 是否将该图片设为主图.可选值:true,false;默认值:false.
     */
    private Boolean isMajor;

    /**
     * 图片序号
     */
    private Long position;

    /**
     * 产品ID.Product的id
     */
    private Long productId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(image, "image");
        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
        RequestCheckUtils.checkNotEmpty(productId, "productId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.product.img.upload";
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

    public Boolean getIsMajor() {
        return this.isMajor;
    }

    public Long getPosition() {
        return this.position;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<ProductImgUploadResponse> getResponseClass() {
        return ProductImgUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_major", this.isMajor);
        txtParams.put("position", this.position);
        txtParams.put("product_id", this.productId);
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

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
