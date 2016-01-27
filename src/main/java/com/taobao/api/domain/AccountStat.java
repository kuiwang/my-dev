package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * E客服账号操作记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class AccountStat extends TaobaoObject {

    private static final long serialVersionUID = 4769453762778199683L;

    /**
     * 登录状态。0：离线；1：在线
     */
    @ApiField("login_status")
    private Long loginStatus;

    /**
     * 服务状态。0：挂起；1：服务
     */
    @ApiField("onservice_status")
    private Long onserviceStatus;

    /**
     * 操作时间。格式：YYYY-mm-dd HH:MM:SS
     */
    @ApiField("time")
    private String time;

    public Long getLoginStatus() {
        return this.loginStatus;
    }

    public Long getOnserviceStatus() {
        return this.onserviceStatus;
    }

    public String getTime() {
        return this.time;
    }

    public void setLoginStatus(Long loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setOnserviceStatus(Long onserviceStatus) {
        this.onserviceStatus = onserviceStatus;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
