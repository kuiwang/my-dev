package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 用户地址
 *
 * @author auto create
 * @since 1.0, null
 */
public class Location extends TaobaoObject {

    private static final long serialVersionUID = 2847225721693126725L;

    /**
     * 详细地址，最大256个字节（128个中文）
     */
    @ApiField("address")
    private String address;

    /**
     * 所在城市（中文名称）
     */
    @ApiField("city")
    private String city;

    /**
     * 国家名称
     */
    @ApiField("country")
    private String country;

    /**
     * 区/县（只适用于物流API）
     */
    @ApiField("district")
    private String district;

    /**
     * 所在省份（中文名称）
     */
    @ApiField("state")
    private String state;

    /**
     * 邮政编码
     */
    @ApiField("zip")
    private String zip;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
