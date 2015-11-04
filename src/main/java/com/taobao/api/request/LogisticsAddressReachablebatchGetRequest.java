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
public class LogisticsAddressReachablebatchGetRequest implements
        TaobaoRequest<LogisticsAddressReachablebatchGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 筛单用户输入地址结构
     */
    private String addressList;

    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

    public String getAddressList() {
        return this.addressList;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.reachablebatch.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address_list", this.addressList);
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

    public Class<LogisticsAddressReachablebatchGetResponse> getResponseClass() {
        return LogisticsAddressReachablebatchGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(addressList, 20, "addressList");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
