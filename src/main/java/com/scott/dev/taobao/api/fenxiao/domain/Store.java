package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 仓库对象
 */
public class Store {

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

    /*
     * 仓库简称
     */
    private String aliasName;

    /*
     * 仓库的物理地址
     */
    private String address;

    /*
     * 仓库对应的淘宝区域
     */
    private String addressAreaName;

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

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressAreaName() {
        return addressAreaName;
    }

    public void setAddressAreaName(String addressAreaName) {
        this.addressAreaName = addressAreaName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
