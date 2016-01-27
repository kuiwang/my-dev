package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LoginLog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.loginlogs.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceLoginlogsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8238313176988862992L;

    /**
     * 在指定时间段登录日志的条数
     */
    @ApiField("count")
    private Long count;

    /**
     * 登录日志具体信息
     */
    @ApiListField("loginlogs")
    @ApiField("login_log")
    private List<LoginLog> loginlogs;

    /**
     * 被查询的用户id
     */
    @ApiField("user_id")
    private String userId;

    public Long getCount() {
        return this.count;
    }

    public List<LoginLog> getLoginlogs() {
        return this.loginlogs;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setLoginlogs(List<LoginLog> loginlogs) {
        this.loginlogs = loginlogs;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
