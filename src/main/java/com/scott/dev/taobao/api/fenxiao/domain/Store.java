package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 仓库对象
 */
public class Store {

    /*
     * 仓库的物理地址
     */
    private String address;

    /*
     * 仓库对应的淘宝区域
     */
    private String addressAreaName;

    /*
     * 仓库简称
     */
    private String aliasName;

    /*
     * 联系人
     */
    private String contact;

    /*
     * 联系电话
     */
    private String phone;

    /*
     * 邮编
     */
    private String postCode;

    /*
     * 商家的仓库编码，不允许重复
     */
    private String storeCode;

    /*
     * 商家的仓库名称
     */
    private String storeName;

    /*
     * 仓库类型
     */
    private String storeType;

    public String getAddress() {
        return address;
    }

    public String getAddressAreaName() {
        return addressAreaName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getContact() {
        return contact;
    }

    public String getPhone() {
        return phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressAreaName(String addressAreaName) {
        this.addressAreaName = addressAreaName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

}
