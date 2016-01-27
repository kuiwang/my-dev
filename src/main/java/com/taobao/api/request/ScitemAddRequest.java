package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemAddResponse;

/**
 * TOP API: taobao.scitem.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ScitemAddRequest implements TaobaoRequest<ScitemAddResponse> {

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * brand_Name
     */
    private String brandName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 高 单位：mm
     */
    private Long height;

    /**
     * 1表示区域销售，0或是空是非区域销售
     */
    private Long isAreaSale;

    /**
     * 是否是贵重品 0:不是 1：是
     */
    private Long isCostly;

    /**
     * 是否危险 0：不是 1：是
     */
    private Long isDangerous;

    /**
     * 是否易碎 0：不是 1：是
     */
    private Long isFriable;

    /**
     * 是否保质期：0:不是 1：是
     */
    private Long isWarranty;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 0.普通供应链商品 1.供应链组合主商品
     */
    private Long itemType;

    /**
     * 长度 单位：mm
     */
    private Long length;

    /**
     * 0:液体，1：粉体，2：固体
     */
    private Long matterStatus;

    /**
     * 商家编码
     */
    private String outerCode;

    /**
     * 价格 单位：分
     */
    private Long price;

    /**
     * 商品属性格式是 p1:v1,p2:v2,p3:v3
     */
    private String properties;

    /**
     * remark
     */
    private String remark;

    /**
     * spuId或是cspuid
     */
    private Long spuId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 体积：立方厘米
     */
    private Long volume;

    /**
     * 重量 单位：g
     */
    private Long weight;

    /**
     * 宽 单位：mm
     */
    private Long width;

    /**
     * 仓储商编码
     */
    private String wmsCode;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemName, "itemName");
        RequestCheckUtils.checkNotEmpty(outerCode, "outerCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.scitem.add";
    }

    public String getBarCode() {
        return this.barCode;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getIsAreaSale() {
        return this.isAreaSale;
    }

    public Long getIsCostly() {
        return this.isCostly;
    }

    public Long getIsDangerous() {
        return this.isDangerous;
    }

    public Long getIsFriable() {
        return this.isFriable;
    }

    public Long getIsWarranty() {
        return this.isWarranty;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public Long getLength() {
        return this.length;
    }

    public Long getMatterStatus() {
        return this.matterStatus;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public Long getPrice() {
        return this.price;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getRemark() {
        return this.remark;
    }

    @Override
    public Class<ScitemAddResponse> getResponseClass() {
        return ScitemAddResponse.class;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bar_code", this.barCode);
        txtParams.put("brand_id", this.brandId);
        txtParams.put("brand_name", this.brandName);
        txtParams.put("height", this.height);
        txtParams.put("is_area_sale", this.isAreaSale);
        txtParams.put("is_costly", this.isCostly);
        txtParams.put("is_dangerous", this.isDangerous);
        txtParams.put("is_friable", this.isFriable);
        txtParams.put("is_warranty", this.isWarranty);
        txtParams.put("item_name", this.itemName);
        txtParams.put("item_type", this.itemType);
        txtParams.put("length", this.length);
        txtParams.put("matter_status", this.matterStatus);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("price", this.price);
        txtParams.put("properties", this.properties);
        txtParams.put("remark", this.remark);
        txtParams.put("spu_id", this.spuId);
        txtParams.put("volume", this.volume);
        txtParams.put("weight", this.weight);
        txtParams.put("width", this.width);
        txtParams.put("wms_code", this.wmsCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
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

    public String getWmsCode() {
        return this.wmsCode;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setIsAreaSale(Long isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public void setIsCostly(Long isCostly) {
        this.isCostly = isCostly;
    }

    public void setIsDangerous(Long isDangerous) {
        this.isDangerous = isDangerous;
    }

    public void setIsFriable(Long isFriable) {
        this.isFriable = isFriable;
    }

    public void setIsWarranty(Long isWarranty) {
        this.isWarranty = isWarranty;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setMatterStatus(Long matterStatus) {
        this.matterStatus = matterStatus;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }
}
