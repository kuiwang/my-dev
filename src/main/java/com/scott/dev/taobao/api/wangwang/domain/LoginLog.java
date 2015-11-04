package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 登录日志
 */
public class LoginLog {

    /**
     * 用户登录或退出客户端的时间
     */
    private String time;

    /**
     * 标志用户登录或退出。 0表示登陆，1表示退出。
     */
    private String type;

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
