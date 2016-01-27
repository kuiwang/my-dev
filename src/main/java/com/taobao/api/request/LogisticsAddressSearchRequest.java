package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressSearchResponse;

/**
 * TOP API: taobao.logistics.address.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsAddressSearchRequest implements TaobaoRequest<LogisticsAddressSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 可选，参数列表如下：<br>
     * <font color='red'> no_def:查询非默认地址<br>
     * get_def:查询默认取货地址<br>
     * cancel_def:查询默认退货地址<br>
     * 缺省此参数时，查询所有当前用户的地址库 </font>
     */
    private String rdef;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.address.search";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getRdef() {
        return this.rdef;
    }

    @Override
    public Class<LogisticsAddressSearchResponse> getResponseClass() {
        return LogisticsAddressSearchResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("rdef", this.rdef);
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

    public void setRdef(String rdef) {
        this.rdef = rdef;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
