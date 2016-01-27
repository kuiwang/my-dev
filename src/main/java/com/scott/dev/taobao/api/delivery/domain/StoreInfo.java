package com.scott.dev.taobao.api.delivery.domain;

/*
 * 商家的仓库信息详情
 */
public class StoreInfo {

    /*
     * 详细地址
     */
    private String address;

    /*
     * XXX果园
     */
    private String name;

    /*
     * 仓库真实名字
     */
    private String realName;

    /*
     * 仓库服务代码
     */
    private String serviceCode;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getServiceCode() {
        return serviceCode;
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
