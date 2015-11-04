package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 收货人详细信息
 */
public class Receiver {

    /*
     * 收货人全名
     */
    private String name;

    /*
     * 固定电话
     */
    private String phone;

    /*
     * 移动电话
     */
    private String mobilePhone;

    /*
     * 收货人的详细地址信息
     */
    private String address;

    /*
     * 区/县
     */
    private String district;

    /*
     * 收货人的城市
     */
    private String city;

    /*
     * 邮政编码
     */
    private String zip;

    /*
     * 收货人所在省份
     */
    private String state;

    /*
     * 证件号
     */
    private String cardId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

}
