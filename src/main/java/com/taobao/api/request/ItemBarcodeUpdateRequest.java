package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemBarcodeUpdateResponse;

/**
 * TOP API: taobao.item.barcode.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemBarcodeUpdateRequest implements TaobaoRequest<ItemBarcodeUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否强制保存商品条码。 true：强制保存 false ：需要执行条码库校验
     */
    private Boolean isforce;

    /**
     * 商品条形码，如果不用更新，可选择不填
     */
    private String itemBarcode;

    /**
     * 被更新商品的ID
     */
    private Long itemId;

    /**
     * SKU维度的条形码，和sku_ids字段一一对应，中间以英文逗号分隔
     */
    private String skuBarcodes;

    /**
     * 被更新SKU的ID列表，中间以英文逗号进行分隔。如果没有SKU或者不需要更新SKU的条形码，不需要设置
     */
    private String skuIds;

    /**
     * 访问来源，这字段提供给千牛扫码枪用， 其他调用方，不需要填写
     */
    private String src;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.barcode.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsforce() {
        return this.isforce;
    }

    public String getItemBarcode() {
        return this.itemBarcode;
    }

    public Long getItemId() {
        return this.itemId;
    }

    @Override
    public Class<ItemBarcodeUpdateResponse> getResponseClass() {
        return ItemBarcodeUpdateResponse.class;
    }

    public String getSkuBarcodes() {
        return this.skuBarcodes;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public String getSrc() {
        return this.src;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("isforce", this.isforce);
        txtParams.put("item_barcode", this.itemBarcode);
        txtParams.put("item_id", this.itemId);
        txtParams.put("sku_barcodes", this.skuBarcodes);
        txtParams.put("sku_ids", this.skuIds);
        txtParams.put("src", this.src);
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

    public void setIsforce(Boolean isforce) {
        this.isforce = isforce;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setSkuBarcodes(String skuBarcodes) {
        this.skuBarcodes = skuBarcodes;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
