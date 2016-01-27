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

    /**
     * 分销商淘宝店主nick
     */
    private String distributorUserNick;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 供应商商品id，一次可以传多个，每次最多40个。 以,(英文)作为分隔符。
     */
    private String productIdArray;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(distributorUserNick, "distributorUserNick");
        RequestCheckUtils.checkNotEmpty(productIdArray, "productIdArray");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.distributor.procuct.static.get";
    }

    public String getDistributorUserNick() {
        return this.distributorUserNick;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getProductIdArray() {
        return this.productIdArray;
    }

    @Override
    public Class<FenxiaoDistributorProcuctStaticGetResponse> getResponseClass() {
        return FenxiaoDistributorProcuctStaticGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_user_nick", this.distributorUserNick);
        txtParams.put("product_id_array", this.productIdArray);
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

    public void setDistributorUserNick(String distributorUserNick) {
        this.distributorUserNick = distributorUserNick;
    }

    public void setProductIdArray(String productIdArray) {
        this.productIdArray = productIdArray;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
