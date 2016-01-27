package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 收货人详细信息
 */
public class Receiver {

    /*
     * 收货人的详细地址信息
     */
    private String address;

    /*
     * 证件号
     */
    private String cardId;

    /*
     * 收货人的城市
     */
    private String city;

    /*
     * 区/县
     */
    private String district;

    /*
     * 移动电话
     */
    private String mobilePhone;

    /*
     * 收货人全名
     */
    private String name;

    /*
     * 固定电话
     */
    private String phone;

    /*
     * 收货人所在省份
     */
    private String state;

    /*
     * 邮政编码
     */
    private String zip;

    public String getAddress() {
        return address;
    }

    public String getCardId() {
        return cardId;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
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

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
