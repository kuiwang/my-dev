package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorProcuctStaticGetResponse;

/**
 * TOP API: taobao.fenxiao.distributor.procuct.static.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDistributorProcuctStaticGetRequest implements
        TaobaoRequest<FenxiaoDistributorProcuctStaticGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分销商淘宝店主nick
     */
    private String distributorUserNick;

    /**
     * 供应商商品id，一次可以传多个，每次最多40个。 以,(英文)作为分隔符。
     */
    private String productIdArray;

    public void setDistributorUserNick(String distributorUserNick) {
        this.distributorUserNick = distributorUserNick;
    }

    public String getDistributorUserNick() {
        return this.distributorUserNick;
    }

    public void setProductIdArray(String productIdArray) {
        this.productIdArray = productIdArray;
    }

    public String getProductIdArray() {
        return this.productIdArray;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.distributor.procuct.static.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_user_nick", this.distributorUserNick);
        txtParams.put("product_id_array", this.productIdArray);
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

    public Class<FenxiaoDistributorProcuctStaticGetResponse> getResponseClass() {
        return FenxiaoDistributorProcuctStaticGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(distributorUserNick, "distributorUserNick");
        RequestCheckUtils.checkNotEmpty(productIdArray, "productIdArray");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
