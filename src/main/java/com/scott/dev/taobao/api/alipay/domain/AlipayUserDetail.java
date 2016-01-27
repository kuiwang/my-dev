package com.scott.dev.taobao.api.alipay.domain;

/**
 * 支付宝会员信息详情
 */
public class AlipayUserDetail {

    /**
     * 支付宝用户userId
     */
    private String alipayUserId;

    /**
     * 是否通过实名认证
     */
    private Boolean certified;

    /**
     * 支付宝登录号
     */
    private String logonId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别。可选值:m(男),f(女)
     */
    private String sex;

    /**
     * 用户状态。可选:normal(正常), supervise (监管),delete(注销)
     */
    private String userStatus;

    /**
     * 用户类型。可选：personal（个人），company（公司）
     */
    private String userType;

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public Boolean getCertified() {
        return this.certified;
    }

    public String getLogonId() {
        return this.logonId;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getSex() {
        return this.sex;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public void setLogonId(String logonId) {
        this.logonId = logonId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
