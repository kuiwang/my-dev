package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayDataBillDownloadurlGetResponse;

/**
 * TOP API: alipay.data.bill.downloadurl.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayDataBillDownloadurlGetRequest implements
        TaobaoRequest<AlipayDataBillDownloadurlGetResponse> {

    /**
     * 支付宝给用户的授权。如果没有top的授权，这个字段是必填项
     */
    private String authToken;

    /**
     * 账单时间：日账单格式为yyyy-MM-dd,月账单格式为yyyy-MM
     */
    private String billDate;

    /**
     * 账单类型，目前支持的类型有：air
     */
    private String billType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(billDate, "billDate");
        RequestCheckUtils.checkNotEmpty(billType, "billType");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.data.bill.downloadurl.get";
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public String getBillDate() {
        return this.billDate;
    }

    public String getBillType() {
        return this.billType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<AlipayDataBillDownloadurlGetResponse> getResponseClass() {
        return AlipayDataBillDownloadurlGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_token", this.authToken);
        txtParams.put("bill_date", this.billDate);
        txtParams.put("bill_type", this.billType);
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

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
