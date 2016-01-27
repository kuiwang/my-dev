package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuAddResponse;

/**
 * TOP API: taobao.item.sku.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemSkuAddRequest implements TaobaoRequest<ItemSkuAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 忽略警告提示.
     */
    private String ignorewarning;

    /**
     * sku所属商品的价格。当用户新增sku，使商品价格不属于sku价格之间的时候，用于修改商品的价格，使sku能够添加成功
     */
    private String itemPrice;

    /**
     * Sku文字的版本。可选值:zh_HK(繁体),zh_CN(简体);默认值:zh_CN
     */
    private String lang;

    /**
     * Sku所属商品数字id，可通过 taobao.item.get 获取。必选<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * Sku的商家外部id
     */
    private String outerId;

    /**
     * Sku的销售价格。商品的价格要在商品所有的sku的价格之间。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String price;

    /**
     * Sku属性串。格式:pid:vid;pid:vid,如:1627207:3232483;1630696:3284570,表示:机身颜色:
     * 军绿色;手机套餐:一电一充。 如果包含自定义属性则格式为pid:vid;pid2:vid2;$pText:vText ,
     * 其中$pText:vText为自定义属性。限制：其中$pText的‘$’前缀不能少，且pText和vText文本中不可以存在
     * 冒号:和分号;以及逗号，
     */
    private String properties;

    /**
     * Sku的库存数量。sku的总数量应该小于等于商品总数量(Item的NUM)。取值范围:大于零的整数<br />
     * 支持最小值为：0
     */
    private Long quantity;

    /**
     * 家装建材类目，商品SKU的高度，单位为cm，部分类目必选。天猫商家专用。 可选值为："0-15", "15-25", "25-50",
     * "50-60", "60-80", "80-120", "120-160", "160-200"。
     * 数据和SKU一一对应，用,分隔，如：15-25,25-50,25-50
     */
    private String skuHdHeight;

    /**
     * 家装建材类目，商品SKU的灯头数量，正整数，大于等于3，部分类目必选。天猫商家专用。 数据和SKU一一对应，用,分隔，如：3,5,7
     */
    private String skuHdLampQuantity;

    /**
     * 家装建材类目，商品SKU的长度，正整数，单位为cm，部分类目必选。天猫商家专用。 数据和SKU一一对应，用,分隔，如：20,30,30
     */
    private String skuHdLength;

    /**
     * 产品的规格信息
     */
    private String specId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(price, "price");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
        RequestCheckUtils.checkNotEmpty(quantity, "quantity");
        RequestCheckUtils.checkMinValue(quantity, 0L, "quantity");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.sku.add";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIgnorewarning() {
        return this.ignorewarning;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public String getLang() {
        return this.lang;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProperties() {
        return this.properties;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Override
    public Class<ItemSkuAddResponse> getResponseClass() {
        return ItemSkuAddResponse.class;
    }

    public String getSkuHdHeight() {
        return this.skuHdHeight;
    }

    public String getSkuHdLampQuantity() {
        return this.skuHdLampQuantity;
    }

    public String getSkuHdLength() {
        return this.skuHdLength;
    }

    public String getSpecId() {
        return this.specId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("item_price", this.itemPrice);
        txtParams.put("lang", this.lang);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("price", this.price);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        txtParams.put("sku_hd_height", this.skuHdHeight);
        txtParams.put("sku_hd_lamp_quantity", this.skuHdLampQuantity);
        txtParams.put("sku_hd_length", this.skuHdLength);
        txtParams.put("spec_id", this.specId);
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

    public void setIgnorewarning(String ignorewarning) {
        this.ignorewarning = ignorewarning;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setSkuHdHeight(String skuHdHeight) {
        this.skuHdHeight = skuHdHeight;
    }

    public void setSkuHdLampQuantity(String skuHdLampQuantity) {
        this.skuHdLampQuantity = skuHdLampQuantity;
    }

    public void setSkuHdLength(String skuHdLength) {
        this.skuHdLength = skuHdLength;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
