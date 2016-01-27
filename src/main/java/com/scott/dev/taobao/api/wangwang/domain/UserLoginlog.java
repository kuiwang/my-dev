package com.scott.dev.taobao.api.wangwang.domain;

import java.util.List;

/**
 * 登陆日志
 */
public class UserLoginlog {

    /**
     * 用户登录日志的条数
     */
    private Long count;

    /**
     * 用户登录日志信息
     */
    private List<LoginLog> loginlogs;

    /**
     * 用户id
     */
    private String uid;

    public Long getCount() {
        return this.count;
    }

    public List<LoginLog> getLoginlogs() {
        return this.loginlogs;
    }

    public String getUid() {
        return this.uid;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setLoginlogs(List<LoginLog> loginlogs) {
        this.loginlogs = loginlogs;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
