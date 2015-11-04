package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductUpdateResponse;

/**
 * TOP API: taobao.product.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductUpdateRequest implements TaobaoUploadRequest<ProductUpdateResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 非关键属性.调用taobao.itemprops.get获取pid,调用taobao.itempropvalues.get获取vid;
     * 格式:pid:vid;pid:vid
     */
    private String binds;

    /**
     * 产品描述.最大不超过25000个字符
     */
    private String desc;

    /**
     * 存放产品扩展信息，由List(ProductExtraInfo)转化成jsonArray存入.<br />
     * 支持最大长度为：25000<br />
     * 支持的最大列表长度为：25000
     */
    private String extraInfo;

    /**
     * 产品主图.最大500K,目前仅支持GIF,JPG<br />
     * 支持的文件类型为：gif,jpg,png,jpeg<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 是否是主图
     */
    private Boolean major;

    /**
     * 市场ID，1为更新C2C市场的产品信息， 2为更新B2C市场的产品信息。
     * 不填写此值则C用户更新B2C市场的产品信息，B用户更新B2C市场的产品信息。
     */
    private String marketId;

    /**
     * 产品名称.最大不超过30个字符
     */
    private String name;

    /**
     * 自定义非关键属性
     */
    private String nativeUnkeyprops;

    /**
     * 外部产品ID
     */
    private String outerId;

    /**
     * 保证清单。
     */
    private String packingList;

    /**
     * 产品市场价.精确到2位小数;单位为元.如:200.07
     */
    private String price;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 销售属性.调用taobao.itemprops.get获取pid,调用taobao.itempropvalues.get获取vid;格式
     * :pid:vid;pid:vid
     */
    private String saleProps;

    /**
     * 产品卖点描述，最长40个字节
     */
    private String sellPt;

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public String getBinds() {
        return this.binds;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setMajor(Boolean major) {
        this.major = major;
    }

    public Boolean getMajor() {
        return this.major;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNativeUnkeyprops(String nativeUnkeyprops) {
        this.nativeUnkeyprops = nativeUnkeyprops;
    }

    public String getNativeUnkeyprops() {
        return this.nativeUnkeyprops;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getPackingList() {
        return this.packingList;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public String getSaleProps() {
        return this.saleProps;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public String getSellPt() {
        return this.sellPt;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.product.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("binds", this.binds);
        txtParams.put("desc", this.desc);
        txtParams.put("extra_info", this.extraInfo);
        txtParams.put("major", this.major);
        txtParams.put("market_id", this.marketId);
        txtParams.put("name", this.name);
        txtParams.put("native_unkeyprops", this.nativeUnkeyprops);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("packing_list", this.packingList);
        txtParams.put("price", this.price);
        txtParams.put("product_id", this.productId);
        txtParams.put("sale_props", this.saleProps);
        txtParams.put("sell_pt", this.sellPt);
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

    public Class<ProductUpdateResponse> getResponseClass() {
        return ProductUpdateResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(extraInfo, 25000, "extraInfo");
        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
        RequestCheckUtils.checkNotEmpty(productId, "productId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
