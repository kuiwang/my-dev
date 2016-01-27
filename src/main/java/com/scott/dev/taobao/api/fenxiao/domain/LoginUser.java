package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 登录分销用户信息
 */
public class LoginUser {

    /*
     * 入驻时间
     */
    private Date createTime;

    /*
     * 会员NICK
     */
    private String nick;

    /*
     * 分销用户ID
     */
    private Number userId;

    /*
     * 分销用户类型(1:分销商，2:供应商，3:品牌商；2、3都表示有供货能力，只是身份不同)
     */
    private String userType;

    public Date getCreateTime() {
        return createTime;
    }

    public String getNick() {
        return nick;
    }

    public Number getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
