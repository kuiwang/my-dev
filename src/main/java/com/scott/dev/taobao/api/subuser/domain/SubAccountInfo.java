package com.scott.dev.taobao.api.subuser.domain;

/**
 * 子账号基本信息
 */
public class SubAccountInfo {

    /**
     * 子账号是否参与分流 true:参与分流 false:未参与分流
     */
    private Boolean subDispatchStatus;

    /**
     * 子账号Id
     */
    private Long subId;

    /**
     * 子账号用户名
     */
    private String subNick;

    /**
     * 子账号是否已欠费 true:已欠费 false:未欠费
     */
    private Boolean subOwedStatus;

    /**
     * 子账号当前状态：1正常，2卖家停用，3处罚冻结
     */
    private Long subStatus;

    /**
     * 主账号Id
     */
    private Long userId;

    /**
     * 主账号用户名
     */
    private String userNick;

    public Boolean getSubDispatchStatus() {
        return this.subDispatchStatus;
    }

    public void setSubDispatchStatus(Boolean subDispatchStatus) {
        this.subDispatchStatus = subDispatchStatus;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public Boolean getSubOwedStatus() {
        return this.subOwedStatus;
    }

    public void setSubOwedStatus(Boolean subOwedStatus) {
        this.subOwedStatus = subOwedStatus;
    }

    public Long getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(Long subStatus) {
        this.subStatus = subStatus;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
