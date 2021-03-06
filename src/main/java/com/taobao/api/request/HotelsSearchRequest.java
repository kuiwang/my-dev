package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelsSearchResponse;

/**
 * TOP API: taobao.hotels.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelsSearchRequest implements TaobaoRequest<HotelsSearchResponse> {

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

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店名称。不能超过60字节<br />
     * 支持最大长度为：60<br />
     * 支持的最大列表长度为：60
     */
    private String name;

    /**
     * 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。页面大小为20
     */
    private Long pageNo;

    /**
     * 省份编码。参见：http://kezhan.trip.taobao.com/area.html。
     * domestic为true时，province,city,district不能同时为空或为0<br />
     * 支持的最大列表长度为：6
     */
    private Long province;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(domestic, "domestic");
        RequestCheckUtils.checkMaxLength(name, 60, "name");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotels.search";
    }

    public Long getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public Long getDistrict() {
        return this.district;
    }

    public Boolean getDomestic() {
        return this.domestic;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getProvince() {
        return this.province;
    }

    @Override
    public Class<HotelsSearchResponse> getResponseClass() {
        return HotelsSearchResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("city", this.city);
        txtParams.put("country", this.country);
        txtParams.put("district", this.district);
        txtParams.put("domestic", this.domestic);
        txtParams.put("name", this.name);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("province", this.province);
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

    public void setCity(Long city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
