package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeWaimaiGetResponse;

/**
 * TOP API: taobao.trade.waimai.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class TradeWaimaiGetRequest implements TaobaoRequest<TradeWaimaiGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * true-查询仅按商家维度 false-查询按商家下所属店铺维度
     */
    private Boolean isAll;

    /**
     * 返回记录数，超过20按20条返回数据<br />
     * 支持最大值为：20<br />
     * 支持最小值为：1
     */
    private Long maxSize;

    /**
     * 外卖分店ID
     */
    private Long storeId;

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public Boolean getIsAll() {
        return this.isAll;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.waimai.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_all", this.isAll);
        txtParams.put("max_size", this.maxSize);
        txtParams.put("store_id", this.storeId);
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

    public Class<TradeWaimaiGetResponse> getResponseClass() {
        return TradeWaimaiGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isAll, "isAll");
        RequestCheckUtils.checkNotEmpty(maxSize, "maxSize");
        RequestCheckUtils.checkMaxValue(maxSize, 20L, "maxSize");
        RequestCheckUtils.checkMinValue(maxSize, 1L, "maxSize");
        RequestCheckUtils.checkNotEmpty(storeId, "storeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
