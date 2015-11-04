package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 登陆日志
 *
 * @author auto create
 * @since 1.0, null
 */
public class UserLoginlog extends TaobaoObject {

    private static final long serialVersionUID = 5695722212395277345L;

    /**
     * 用户登录日志的条数
     */
    @ApiField("count")
    private Long count;

    /**
     * 用户登录日志信息
     */
    @ApiListField("loginlogs")
    @ApiField("login_log")
    private List<LoginLog> loginlogs;

    /**
     * 用户id
     */
    @ApiField("uid")
    private String uid;

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<LoginLog> getLoginlogs() {
        return this.loginlogs;
    }

    public void setLoginlogs(List<LoginLog> loginlogs) {
        this.loginlogs = loginlogs;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
