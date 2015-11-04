package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 登录分销用户信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class LoginUser extends TaobaoObject {

    private static final long serialVersionUID = 2841124973441916725L;

    /**
     * 入驻时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 会员NICK
     */
    @ApiField("nick")
    private String nick;

    /**
     * 分销用户ID
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * 分销用户类型(1:分销商，2:供应商，3:品牌商；2、3都表示有供货能力，只是身份不同)
     */
    @ApiField("user_type")
    private String userType;

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
