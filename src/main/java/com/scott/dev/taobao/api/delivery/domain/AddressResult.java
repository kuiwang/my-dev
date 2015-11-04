package com.scott.dev.taobao.api.delivery.domain;

import java.util.Date;

/*
 * 地址库返回数据信息
 */
public class AddressResult {

    /*
     * 地址库ID
     */
    private Number contactId;

    /*
     * 联系人姓名
     */
    private String contactName;

    /*
     * 省
     */
    private String province;

    /*
     * 市
     */
    private String city;

    /*
     * 区、县
     */
    private String country;

    /*
     * 详细街道地址，不需要重复填写省/市/区
     */
    private String addr;

    /*
     * 地区邮政编码
     */
    private String zipCode;

    /*
     *  电话号码,手机与电话必需有一个
     */
    private String phone;

    /*
     * 手机号码，手机与电话必需有一个 手机号码不能超过20位
     */
    private String mobilePhone;

    /*
     * 公司名称
     */
    private String sellerCompany;

    /*
     * 备注
     */
    private String memo;

    /*
     * 区域ID
     */
    private Number areaId;

    /*
     * 是否默认发货地址
     */
    private Boolean sendDef;

    /*
     * 是否默认取货地址
     */
    private Boolean getDef;

    /*
     * 是否默认退货地址
     */
    private Boolean cancelDef;

    /*
     * 修改日期时间
     */
    private Date modifyDate;

    public Number getContactId() {
        return contactId;
    }

    public void setContactId(Number contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getSellerCompany() {
        return sellerCompany;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Number getAreaId() {
        return areaId;
    }

    public void setAreaId(Number areaId) {
        this.areaId = areaId;
    }

    public Boolean getSendDef() {
        return sendDef;
    }

    public void setSendDef(Boolean sendDef) {
        this.sendDef = sendDef;
    }

    public Boolean getGetDef() {
        return getDef;
    }

    public void setGetDef(Boolean getDef) {
        this.getDef = getDef;
    }

    public Boolean getCancelDef() {
        return cancelDef;
    }

    public void setCancelDef(Boolean cancelDef) {
        this.cancelDef = cancelDef;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
