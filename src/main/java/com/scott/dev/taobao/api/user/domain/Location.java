package com.scott.dev.taobao.api.user.domain;

/*
 *用户地址
 */
public class Location {

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
     * 国家名称
     */
    private String country;

    /*
     * 区/县（只适用于物流API）
     */
    private String district;

    /*
     * 所在省份（中文名称）
     */
    private String state;

    /*
     * 邮政编码
     * 隐私:y
     */
    private String zip;

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
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
