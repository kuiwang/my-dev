package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductUpdateRequest implements
        TaobaoUploadRequest<FenxiaoProductUpdateResponse> {

    /**
     * 警戒库存必须是0到29999。
     */
    private Long alarmNumber;

    /**
     * 所属类目id，参考Taobao.itemcats.get，不支持成人等类目，输入成人类目id保存提示类目属性错误。
     */
    private Long categoryId;

    /**
     * 所在地：市，例：“杭州”
     */
    private String city;

    /**
     * 代销采购价格，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
     */
    private String costPrice;

    /**
     * 经销采购价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
     */
    private String dealerCostPrice;

    /**
     * 产品描述，长度为5到25000字符。
     */
    private String desc;

    /**
     * 折扣ID
     */
    private Long discountId;

    /**
     * 是否有保修，可选值：false（否）、true（是），默认false。
     */
    private String haveGuarantee;

    /**
     * 是否有发票，可选值：false（否）、true（是），默认false。
     */
    private String haveInvoice;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主图图片，如果pic_path参数不空，则优先使用pic_path，忽略该参数<br />
     * 支持的文件类型为：gif,jpg,jpeg,png,bmp<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem image;

    /**
     * 自定义属性。格式为pid:value;pid:value
     */
    private String inputProperties;

    /**
     * 产品是否需要授权isAuthz:yes|no yes:需要授权 no:不需要授权
     */
    private String isAuthz;

    /**
     * 产品名称，长度不超过60个字节。
     */
    private String name;

    /**
     * 商家编码，长度不能超过60个字节。
     */
    private String outerId;

    /**
     * 产品主图图片空间相对路径或绝对路径
     */
    private String picPath;

    /**
     * 产品ID
     */
    private Long pid;

    /**
     * ems费用，单位：元。例：“10.56”。大小为0.01元到999999元之间。更新时必须指定运费类型为buyer，否则不更新。
     */
    private String postageEms;

    /**
     * 快递费用，单位：元。例：“10.56”。大小为0.01元到999999元之间。更新时必须指定运费类型为buyer，否则不更新。
     */
    private String postageFast;

    /**
     * 运费模板ID，参考taobao.postages.get。更新时必须指定运费类型为 buyer，否则不更新。
     */
    private Long postageId;

    /**
     * 平邮费用，单位：元。例：“10.56”。大小为0.01元到999999元之间。更新时必须指定运费类型为buyer，否则不更新。
     */
    private String postageOrdinary;

    /**
     * 运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）。
     */
    private String postageType;

    /**
     * 产品属性
     */
    private String properties;

    /**
     * 属性别名
     */
    private String propertyAlias;

    /**
     * 所在地：省，例：“浙江”
     */
    private String prov;

    /**
     * 产品库存必须是1到999999。
     */
    private Long quantity;

    /**
     * 最高零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间，最高零售价必须大于最低零售价。
     */
    private String retailPriceHigh;

    /**
     * 最低零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
     */
    private String retailPriceLow;

    /**
     * sku采购价格，单位元，例："10.50,11.00,20.50"，字段必须和上面的sku_ids或sku_properties保持一致
     * 。
     */
    private String skuCostPrices;

    /**
     * sku的经销采购价。如果多个，用逗号分隔，并与其他sku信息保持相同顺序。其中每个值的单位：元。例：“10.56,12.3”。必须在0
     * .01元到10000000元之间。
     */
    private String skuDealerCostPrices;

    /**
     * sku id列表，例：1001,1002,1003。如果传入sku_properties将忽略此参数。
     */
    private String skuIds;

    /**
     * sku商家编码
     * ，单位元，例："S1000,S1002,S1003"，字段必须和上面的id或sku_properties保持一致，如果没有可以写成
     * ",,"
     */
    private String skuOuterIds;

    /**
     * sku属性。格式:pid:vid;pid:vid,表示一组属性如:1627207:3232483;1630696:3284570,
     * 表示一组
     * :机身颜色:军绿色;手机套餐:一电一充。多组之间用逗号“,”区分。(属性的pid调用taobao.itemprops.get取得，
     * 属性值的vid用taobao.itempropvalues.get取得vid)
     * 通过此字段可新增和更新sku。若传入此值将忽略sku_ids字段。sku其他字段与此值保持一致。
     */
    private String skuProperties;

    /**
     * 根据sku属性删除sku信息。需要按组删除属性。
     */
    private String skuPropertiesDel;

    /**
     * sku库存，单位元，例："10,20,30"，字段必须和sku_ids或sku_properties保持一致。
     */
    private String skuQuantitys;

    /**
     * sku采购基准价，单位元，例："10.50,11.00,20.50"，
     * 字段必须和上面的sku_ids或sku_properties保持一致。
     */
    private String skuStandardPrices;

    /**
     * 采购基准价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
     */
    private String standardPrice;

    /**
     * 零售基准价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
     */
    private String standardRetailPrice;

    /**
     * 发布状态，可选值：up（上架）、down（下架）、delete（删除），输入非法字符则忽略。
     */
    private String status;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(image, 512000, "image");
        RequestCheckUtils.checkNotEmpty(pid, "pid");
    }

    public Long getAlarmNumber() {
        return this.alarmNumber;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.update";
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCity() {
        return this.city;
    }

    public String getCostPrice() {
        return this.costPrice;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    public String getHaveGuarantee() {
        return this.haveGuarantee;
    }

    public String getHaveInvoice() {
        return this.haveInvoice;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getImage() {
        return this.image;
    }

    public String getInputProperties() {
        return this.inputProperties;
    }

    public String getIsAuthz() {
        return this.isAuthz;
    }

    public String getName() {
        return this.name;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public Long getPid() {
        return this.pid;
    }

    public String getPostageEms() {
        return this.postageEms;
    }

    public String getPostageFast() {
        return this.postageFast;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public String getPostageOrdinary() {
        return this.postageOrdinary;
    }

    public String getPostageType() {
        return this.postageType;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public String getProv() {
        return this.prov;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Override
    public Class<FenxiaoProductUpdateResponse> getResponseClass() {
        return FenxiaoProductUpdateResponse.class;
    }

    public String getRetailPriceHigh() {
        return this.retailPriceHigh;
    }

    public String getRetailPriceLow() {
        return this.retailPriceLow;
    }

    public String getSkuCostPrices() {
        return this.skuCostPrices;
    }

    public String getSkuDealerCostPrices() {
        return this.skuDealerCostPrices;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public String getSkuOuterIds() {
        return this.skuOuterIds;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public String getSkuPropertiesDel() {
        return this.skuPropertiesDel;
    }

    public String getSkuQuantitys() {
        return this.skuQuantitys;
    }

    public String getSkuStandardPrices() {
        return this.skuStandardPrices;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public String getStandardRetailPrice() {
        return this.standardRetailPrice;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alarm_number", this.alarmNumber);
        txtParams.put("category_id", this.categoryId);
        txtParams.put("city", this.city);
        txtParams.put("cost_price", this.costPrice);
        txtParams.put("dealer_cost_price", this.dealerCostPrice);
        txtParams.put("desc", this.desc);
        txtParams.put("discount_id", this.discountId);
        txtParams.put("have_guarantee", this.haveGuarantee);
        txtParams.put("have_invoice", this.haveInvoice);
        txtParams.put("input_properties", this.inputProperties);
        txtParams.put("is_authz", this.isAuthz);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("pid", this.pid);
        txtParams.put("postage_ems", this.postageEms);
        txtParams.put("postage_fast", this.postageFast);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("postage_ordinary", this.postageOrdinary);
        txtParams.put("postage_type", this.postageType);
        txtParams.put("properties", this.properties);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("prov", this.prov);
        txtParams.put("quantity", this.quantity);
        txtParams.put("retail_price_high", this.retailPriceHigh);
        txtParams.put("retail_price_low", this.retailPriceLow);
        txtParams.put("sku_cost_prices", this.skuCostPrices);
        txtParams.put("sku_dealer_cost_prices", this.skuDealerCostPrices);
        txtParams.put("sku_ids", this.skuIds);
        txtParams.put("sku_outer_ids", this.skuOuterIds);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_properties_del", this.skuPropertiesDel);
        txtParams.put("sku_quantitys", this.skuQuantitys);
        txtParams.put("sku_standard_prices", this.skuStandardPrices);
        txtParams.put("standard_price", this.standardPrice);
        txtParams.put("standard_retail_price", this.standardRetailPrice);
        txtParams.put("status", this.status);
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

    public void setAlarmNumber(Long alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public void setHaveGuarantee(String haveGuarantee) {
        this.haveGuarantee = haveGuarantee;
    }

    public void setHaveInvoice(String haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public void setInputProperties(String inputProperties) {
        this.inputProperties = inputProperties;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setPostageEms(String postageEms) {
        this.postageEms = postageEms;
    }

    public void setPostageFast(String postageFast) {
        this.postageFast = postageFast;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public void setPostageOrdinary(String postageOrdinary) {
        this.postageOrdinary = postageOrdinary;
    }

    public void setPostageType(String postageType) {
        this.postageType = postageType;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setRetailPriceHigh(String retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public void setRetailPriceLow(String retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public void setSkuCostPrices(String skuCostPrices) {
        this.skuCostPrices = skuCostPrices;
    }

    public void setSkuDealerCostPrices(String skuDealerCostPrices) {
        this.skuDealerCostPrices = skuDealerCostPrices;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public void setSkuOuterIds(String skuOuterIds) {
        this.skuOuterIds = skuOuterIds;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public void setSkuPropertiesDel(String skuPropertiesDel) {
        this.skuPropertiesDel = skuPropertiesDel;
    }

    public void setSkuQuantitys(String skuQuantitys) {
        this.skuQuantitys = skuQuantitys;
    }

    public void setSkuStandardPrices(String skuStandardPrices) {
        this.skuStandardPrices = skuStandardPrices;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public void setStandardRetailPrice(String standardRetailPrice) {
        this.standardRetailPrice = standardRetailPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
