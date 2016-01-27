package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemUpdateListingResponse;

/**
 * TOP API: taobao.item.update.listing request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemUpdateListingRequest implements TaobaoRequest<ItemUpdateListingResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 需要上架的商品的数量。取值范围:大于零的整数。如果商品有sku，则上架数量默认为所有sku数量总和，不可修改。
     * 否则商品数量根据设置数量调整为num<br />
     * 支持最小值为：0
     */
    private Long num;

    /**
     * 商品数字ID，该参数必须<br />
     * 支持最小值为：0
     */
    private Long numIid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(num, "num");
        RequestCheckUtils.checkMinValue(num, 0L, "num");
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.update.listing";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getNum() {
        return this.num;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    @Override
    public Class<ItemUpdateListingResponse> getResponseClass() {
        return ItemUpdateListingResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("num", this.num);
        txtParams.put("num_iid", this.numIid);
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

    public void setNum(Long num) {
        this.num = num;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
