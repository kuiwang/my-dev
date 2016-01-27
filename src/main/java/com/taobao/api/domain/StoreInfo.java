package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商家的仓库信息详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class StoreInfo extends TaobaoObject {

    private static final long serialVersionUID = 2661248935933764462L;

    /**
     * 详细地址
     */
    @ApiField("address")
    private String address;

    /**
     * XXX果园
     */
    @ApiField("name")
    private String name;

    /**
     * 仓库真实名字
     */
    @ApiField("real_name")
    private String realName;

    /**
     * 仓库服务代码
     */
    @ApiField("service_code")
    private String serviceCode;

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

}
