package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuCitygroupGetResponse;

/**
 * TOP API: taobao.ju.citygroup.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class JuCitygroupGetRequest implements TaobaoRequest<JuCitygroupGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要获取生活服务商品的城市名称（中文）
     */
    private String city;

    /**
     * 代表需要返回的商品对象字段。可选值：ItemData商品结构体中所有字段均可返回；多个字段用“,”分隔。如果fields为空，
     * 或者不传该参数，就默认获得所有的字段
     */
    private String fields;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ju.citygroup.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("city", this.city);
        txtParams.put("fields", this.fields);
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

    public Class<JuCitygroupGetResponse> getResponseClass() {
        return JuCitygroupGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(city, "city");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
