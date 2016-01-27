package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流公司详细信息
 */
public class PartnerDetail {

    /*
     * 物流公司支付宝账号
     */
    private String accountNo;

    /*
     * 物流公司代码
     */
    private String companyCode;

    /*
     * 物流公司id
     */
    private Number companyId;

    /*
     * 物流公司简称
     */
    private String companyName;

    /*
     * 物流公司全名
     */
    private String fullName;

    /*
     * 运单号验证正则表达式
     */
    private String regMailNo;

    /*
     * 旺旺id
     */
    private String wangwangId;

    public String getAccountNo() {
        return accountNo;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public Number getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRegMailNo() {
        return regMailNo;
    }

    public String getWangwangId() {
        return wangwangId;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public void setCompanyId(Number companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRegMailNo(String regMailNo) {
        this.regMailNo = regMailNo;
    }

    public void setWangwangId(String wangwangId) {
        this.wangwangId = wangwangId;
    }

}
