package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAddResponse;

/**
 * TOP API: taobao.wlb.item.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemAddRequest implements TaobaoRequest<WlbItemAddResponse> {

    /**
     * 商品颜色
     */
    private String color;

    /**
     * 货类
     */
    private String goodsCat;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品高度，单位毫米
     */
    private Long height;

    /**
     * 是否危险品
     */
    private Boolean isDangerous;

    /**
     * 是否易碎品
     */
    private Boolean isFriable;

    /**
     * 是否sku
     */
    private String isSku;

    /**
     * 商品编码
     */
    private String itemCode;

    /**
     * 商品长度，单位毫米
     */
    private Long length;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品包装材料类型
     */
    private String packageMaterial;

    /**
     * 商品价格，单位：分
     */
    private Long price;

    /**
     * 计价货类
     */
    private String pricingCat;

    /**
     * 属性名列表,目前支持的属性： 毛重:GWeight 净重:Nweight 皮重: Tweight 自定义属性： paramkey1
     * paramkey2 paramkey3 paramkey4
     */
    private String proNameList;

    /**
     * 属性值列表： 10,8
     */
    private String proValueList;

    /**
     * 商品备注
     */
    private String remark;

    /**
     * 是否支持批次
     */
    private Boolean supportBatch;

    private Long timestamp;

    /**
     * 商品标题
     */
    private String title;

    /**
     * NORMAL--普通商品 COMBINE--组合商品 DISTRIBUTION--分销
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 商品体积，单位立方厘米
     */
    private Long volume;

    /**
     * 商品重量，单位G
     */
    private Long weight;

    /**
     * 商品宽度，单位毫米
     */
    private Long width;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isSku, "isSku");
        RequestCheckUtils.checkNotEmpty(itemCode, "itemCode");
        RequestCheckUtils.checkNotEmpty(name, "name");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.add";
    }

    public String getColor() {
        return this.color;
    }

    public String getGoodsCat() {
        return this.goodsCat;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHeight() {
        return this.height;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    public Boolean getIsFriable() {
        return this.isFriable;
    }

    public String getIsSku() {
        return this.isSku;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public Long getLength() {
        return this.length;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageMaterial() {
        return this.packageMaterial;
    }

    public Long getPrice() {
        return this.price;
    }

    public String getPricingCat() {
        return this.pricingCat;
    }

    public String getProNameList() {
        return this.proNameList;
    }

    public String getProValueList() {
        return this.proValueList;
    }

    public String getRemark() {
        return this.remark;
    }

    @Override
    public Class<WlbItemAddResponse> getResponseClass() {
        return WlbItemAddResponse.class;
    }

    public Boolean getSupportBatch() {
        return this.supportBatch;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("color", this.color);
        txtParams.put("goods_cat", this.goodsCat);
        txtParams.put("height", this.height);
        txtParams.put("is_dangerous", this.isDangerous);
        txtParams.put("is_friable", this.isFriable);
        txtParams.put("is_sku", this.isSku);
        txtParams.put("item_code", this.itemCode);
        txtParams.put("length", this.length);
        txtParams.put("name", this.name);
        txtParams.put("package_material", this.packageMaterial);
        txtParams.put("price", this.price);
        txtParams.put("pricing_cat", this.pricingCat);
        txtParams.put("pro_name_list", this.proNameList);
        txtParams.put("pro_value_list", this.proValueList);
        txtParams.put("remark", this.remark);
        txtParams.put("support_batch", this.supportBatch);
        txtParams.put("title", this.title);
        txtParams.put("type", this.type);
        txtParams.put("volume", this.volume);
        txtParams.put("weight", this.weight);
        txtParams.put("width", this.width);
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

    public String getType() {
        return this.type;
    }

    public Long getVolume() {
        return this.volume;
    }

    public Long getWeight() {
        return this.weight;
    }

    public Long getWidth() {
        return this.width;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGoodsCat(String goodsCat) {
        this.goodsCat = goodsCat;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public void setIsFriable(Boolean isFriable) {
        this.isFriable = isFriable;
    }

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPackageMaterial(String packageMaterial) {
        this.packageMaterial = packageMaterial;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setPricingCat(String pricingCat) {
        this.pricingCat = pricingCat;
    }

    public void setProNameList(String proNameList) {
        this.proNameList = proNameList;
    }

    public void setProValueList(String proValueList) {
        this.proValueList = proValueList;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSupportBatch(Boolean supportBatch) {
        this.supportBatch = supportBatch;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
