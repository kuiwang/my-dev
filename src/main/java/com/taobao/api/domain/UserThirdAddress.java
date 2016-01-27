package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 送货地址对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class UserThirdAddress extends TaobaoObject {

    private static final long serialVersionUID = 7228521411519885671L;

    /**
     * 送货地址
     */
    @ApiField("address")
    private String address;

    /**
     * 手机号
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 买家姓名
     */
    @ApiField("name")
    private String name;

    /**
     * 联系电话
     */
    @ApiField("phone")
    private String phone;

    public String getAddress() {
        return this.address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
