package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelNameGetResponse;

/**
 * TOP API: taobao.hotel.name.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelNameGetRequest implements TaobaoRequest<HotelNameGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 城市编码。参见：http://kezhan.trip.taobao.com/area.html。
     * domestic为true时，province,city,district不能同时为空或为0<br />
     * 支持的最大列表长度为：6
     */
    private Long city;

    /**
     * domestic为true时，固定China；
     * domestic为false时，必须传定义的海外国家编码值，是必填项。参见：http://
     * kezhan.trip.taobao.com/countrys.html
     */
    private String country;

    /**
     * 区域（县级市）编码。参见：http://kezhan.trip.taobao.com/area.html。
     * domestic为true时，province,city,district不能同时为空或为0<br />
     * 支持的最大列表长度为：6
     */
    private Long district;

    /**
     * 是否国内酒店。可选值：true，false
     */
    private Boolean domestic;

    /**
     * 酒店全部名称/别名。不能超过60字节<br />
     * 支持最大长度为：60<br />
     * 支持的最大列表长度为：60
     */
    private String name;

    /**
     * 省份编码。参见：http://kezhan.trip.taobao.com/area.html。
     * domestic为true时，province,city,district不能同时为空或为0<br />
     * 支持的最大列表长度为：6
     */
    private Long province;

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getCity() {
        return this.city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public Long getDistrict() {
        return this.district;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public Boolean getDomestic() {
        return this.domestic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getProvince() {
        return this.province;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.name.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("city", this.city);
        txtParams.put("country", this.country);
        txtParams.put("district", this.district);
        txtParams.put("domestic", this.domestic);
        txtParams.put("name", this.name);
        txtParams.put("province", this.province);
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

    public Class<HotelNameGetResponse> getResponseClass() {
        return HotelNameGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(domestic, "domestic");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 60, "name");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
