package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 登录分销用户信息
 */
public class LoginUser {

    /*
     * 分销用户ID
     */
    private Number userId;

    /*
     * 会员NICK
     */
    private String nick;

    /*
     * 分销用户类型(1:分销商，2:供应商，3:品牌商；2、3都表示有供货能力，只是身份不同)
     */
    private String userType;

    /*
     * 入驻时间
     */
    private Date createTime;

    public Number getUserId() {
        return userId;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
