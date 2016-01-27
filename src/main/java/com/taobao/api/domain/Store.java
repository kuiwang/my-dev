package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 仓库对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class Store extends TaobaoObject {

    private static final long serialVersionUID = 3629243344848181313L;

    /**
     * 仓库的物理地址
     */
    @ApiField("address")
    private String address;

    /**
     * 仓库对应的淘宝区域
     */
    @ApiField("address_area_name")
    private String addressAreaName;

    /**
     * 仓库简称
     */
    @ApiField("alias_name")
    private String aliasName;

    /**
     * 联系人
     */
    @ApiField("contact")
    private String contact;

    /**
     * 联系电话
     */
    @ApiField("phone")
    private String phone;

    /**
     * 邮编
     */
    @ApiField("post_code")
    private String postCode;

    /**
     * 商家的仓库编码，不允许重复
     */
    @ApiField("store_code")
    private String storeCode;

    /**
     * 商家的仓库名称
     */
    @ApiField("store_name")
    private String storeName;

    /**
     * 仓库类型
     */
    @ApiField("store_type")
    private String storeType;

    public String getAddress() {
        return this.address;
    }

    public String getAddressAreaName() {
        return this.addressAreaName;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public String getContact() {
        return this.contact;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreType() {
        return this.storeType;
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
