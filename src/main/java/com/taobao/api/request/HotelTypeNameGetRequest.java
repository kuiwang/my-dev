package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelTypeNameGetResponse;

/**
 * TOP API: taobao.hotel.type.name.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelTypeNameGetRequest implements TaobaoRequest<HotelTypeNameGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 要查询的酒店id。必须为数字
     */
    private Long hid;

    /**
     * 房型全部名称/别名。不能超过60字节<br />
     * 支持最大长度为：60<br />
     * 支持的最大列表长度为：60
     */
    private String name;

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.type.name.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
        txtParams.put("name", this.name);
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

    public Class<HotelTypeNameGetResponse> getResponseClass() {
        return HotelTypeNameGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(hid, "hid");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 60, "name");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
