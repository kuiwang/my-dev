package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductPropimgUploadResponse;

/**
 * TOP API: taobao.product.propimg.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductPropimgUploadRequest
        implements TaobaoUploadRequest<ProductPropimgUploadResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品属性图片ID
     */
    private Long id;

    /**
     * 图片内容.图片最大为2M,只支持JPG,GIF.<br />
     * 支持的文件类型为：gif,jpg,png,jpeg<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 图片序号
     */
    private Long position;

    /**
     * 产品ID.Product的id
     */
    private Long productId;

    /**
     * 属性串.目前仅支持颜色属性.调用taobao.itemprops.get获取类目属性,取得颜色属性pid,再用taobao.
     * itempropvalues.get取得vid;格式:pid:vid,只能传入一个颜色pid:vid串;
     */
    private String props;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(image, "image");
        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(props, "props");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.product.propimg.upload";
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

    public Long getPosition() {
        return this.position;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProps() {
        return this.props;
    }

    @Override
    public Class<ProductPropimgUploadResponse> getResponseClass() {
        return ProductPropimgUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("position", this.position);
        txtParams.put("product_id", this.productId);
        txtParams.put("props", this.props);
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

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProps(String props) {
        this.props = props;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
