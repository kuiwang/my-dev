package com.scott.dev.taobao.api.wangwang.domain;

/**
 * E客服账号操作记录
 */
public class AccountStat {

    /**
     * 登录状态。0：离线；1：在线
     */
    private Long loginStatus;

    /**
     * 服务状态。0：挂起；1：服务
     */
    private Long onserviceStatus;

    /**
     * 操作时间。格式：YYYY-mm-dd HH:MM:SS
     */
    private String time;

    public Long getLoginStatus() {
        return this.loginStatus;
    }

    public void setLoginStatus(Long loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Long getOnserviceStatus() {
        return this.onserviceStatus;
    }

    public void setOnserviceStatus(Long onserviceStatus) {
        this.onserviceStatus = onserviceStatus;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
