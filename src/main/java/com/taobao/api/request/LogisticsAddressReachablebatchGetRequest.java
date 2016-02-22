package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressReachablebatchGetResponse;

/**
 * TOP API: taobao.logistics.address.reachablebatch.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class LogisticsAddressReachablebatchGetRequest
        implements TaobaoRequest<LogisticsAddressReachablebatchGetResponse> {

    /**
     * 筛单用户输入地址结构
     */
    private String addressList;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(addressList, 20, "addressList");
    }

    public String getAddressList() {
        return this.addressList;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.address.reachablebatch.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<LogisticsAddressReachablebatchGetResponse> getResponseClass() {
        return LogisticsAddressReachablebatchGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address_list", this.addressList);
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

    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
