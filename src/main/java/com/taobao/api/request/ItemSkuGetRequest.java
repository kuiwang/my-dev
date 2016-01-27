package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuGetResponse;

/**
 * TOP API: taobao.item.sku.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemSkuGetRequest implements TaobaoRequest<ItemSkuGetResponse> {

    /**
     * 需返回的字段列表。可选值：Sku结构体中的所有字段；字段之间用“,”分隔。
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 卖家nick(num_iid和nick必传一个)，只传卖家nick时候，该api返回的结果不包含cspu（SKu上的产品规格信息）。
     */
    private String nick;

    /**
     * 商品的数字IID（num_iid和nick必传一个，推荐用num_iid），传商品的数字id返回的结果里包含cspu（
     * SKu上的产品规格信息）。<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * Sku的id。可以通过taobao.item.get得到
     */
    private Long skuId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(skuId, "skuId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.sku.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    @Override
    public Class<ItemSkuGetResponse> getResponseClass() {
        return ItemSkuGetResponse.class;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("nick", this.nick);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("sku_id", this.skuId);
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
