package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.QianniuNumberPutResponse;

/**
 * TOP API: taobao.qianniu.number.put request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class QianniuNumberPutRequest implements TaobaoRequest<QianniuNumberPutResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 考虑到稳定性，建议一次卖家最多为200个。
     * 标准json格式的数组构成的字符串。每个元素为{user_id:****,field:"****"
     * ,value:"****"}分别是用户的userid，数据的名称，以及数据的值。
     */
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.qianniu.number.put";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("data", this.data);
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

    public Class<QianniuNumberPutResponse> getResponseClass() {
        return QianniuNumberPutResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(data, "data");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
