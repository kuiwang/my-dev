package com.scott.dev.taobao.api.user.domain;

/*
 *用户地址
 */
public class Location {

    /*
     * 邮政编码
     * 隐私:y
     */
    private String zip;

    /*
     * 详细地址，最大256个字节（128个中文）
     * 隐私:y
     */
    private String address;

    /*
     * 所在城市（中文名称）
     */
    private String city;

    /*
     * 所在省份（中文名称）
     */
    private String state;

    /*
     * 国家名称
     */
    private String country;

    /*
     * 区/县（只适用于物流API）
     */
    private String district;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
