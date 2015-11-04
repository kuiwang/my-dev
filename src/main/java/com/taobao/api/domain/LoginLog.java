package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 登录日志
 *
 * @author auto create
 * @since 1.0, null
 */
public class LoginLog extends TaobaoObject {

    private static final long serialVersionUID = 2113123294358953592L;

    /**
     * 用户登录或退出客户端的时间
     */
    @ApiField("time")
    private String time;

    /**
     * 标志用户登录或退出。 0表示登陆，1表示退出。
     */
    @ApiField("type")
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
