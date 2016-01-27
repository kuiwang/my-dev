package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流公司基础数据结构
 */
public class LogisticsCompany {

    /*
     * 物流公司代码
     */
    private String code;

    /*
     * 物流公司标识
     */
    private Number id;

    /*
     * 物流公司简称
     */
    private String name;

    /*
     * 运单号验证正则表达式
     */
    private String regMailNo;

    public String getCode() {
        return code;
    }

    public Number getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegMailNo() {
        return regMailNo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegMailNo(String regMailNo) {
        this.regMailNo = regMailNo;
    }
}
