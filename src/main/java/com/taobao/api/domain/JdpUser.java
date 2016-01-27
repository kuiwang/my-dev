package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 使用数据推送的用户信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class JdpUser extends TaobaoObject {

    private static final long serialVersionUID = 6313851736267661797L;

    /**
     * rds数据库的实例名
     */
    @ApiField("rds_name")
    private String rdsName;

    /**
     * 0:暂停 1：正常 2：sessoin失效，停止 3：已删除
     */
    @ApiField("status")
    private Long status;

    /**
     * 用户昵称
     */
    @ApiField("user_nick")
    private String userNick;

    public String getRdsName() {
        return this.rdsName;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setRdsName(String rdsName) {
        this.rdsName = rdsName;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
