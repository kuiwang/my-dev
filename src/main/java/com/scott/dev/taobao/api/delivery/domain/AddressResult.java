package com.scott.dev.taobao.api.delivery.domain;

import java.util.Date;

/*
 * 地址库返回数据信息
 */
public class AddressResult {

    /*
     * 详细街道地址，不需要重复填写省/市/区
     */
    private String addr;

    /*
     * 区域ID
     */
    private Number areaId;

    /*
     * 是否默认退货地址
     */
    private Boolean cancelDef;

    /*
     * 市
     */
    private String city;

    /*
     * 地址库ID
     */
    private Number contactId;

    /*
     * 联系人姓名
     */
    private String contactName;

    /*
     * 区、县
     */
    private String country;

    /*
     * 是否默认取货地址
     */
    private Boolean getDef;

    /*
     * 备注
     */
    private String memo;

    /*
     * 手机号码，手机与电话必需有一个 手机号码不能超过20位
     */
    private String mobilePhone;

    /*
     * 修改日期时间
     */
    private Date modifyDate;

    /*
     *  电话号码,手机与电话必需有一个
     */
    private String phone;

    /*
     * 省
     */
    private String province;

    /*
     * 公司名称
     */
    private String sellerCompany;

    /*
     * 是否默认发货地址
     */
    private Boolean sendDef;

    /*
     * 地区邮政编码
     */
    private String zipCode;

    public String getAddr() {
        return addr;
    }

    public Number getAreaId() {
        return areaId;
    }

    public Boolean getCancelDef() {
        return cancelDef;
    }

    public String getCity() {
        return city;
    }

    public Number getContactId() {
        return contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getCountry() {
        return country;
    }

    public Boolean getGetDef() {
        return getDef;
    }

    public String getMemo() {
        return memo;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getProvince() {
        return province;
    }

    public String getSellerCompany() {
        return sellerCompany;
    }

    public Boolean getSendDef() {
        return sendDef;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setAreaId(Number areaId) {
        this.areaId = areaId;
    }

    public void setCancelDef(Boolean cancelDef) {
        this.cancelDef = cancelDef;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContactId(Number contactId) {
        this.contactId = contactId;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGetDef(Boolean getDef) {
        this.getDef = getDef;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    public void setSendDef(Boolean sendDef) {
        this.sendDef = sendDef;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
