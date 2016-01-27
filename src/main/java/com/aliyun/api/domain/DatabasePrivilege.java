package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RDS DatabasePrivilege
 *
 * @author auto create
 * @since 1.0, null
 */
public class DatabasePrivilege extends TaobaoObject {

    private static final long serialVersionUID = 6278237399366286662L;

    /**
     * DB操作帐号名称
     */
    @ApiField("AccountPrivilege")
    private String accountPrivilege;

    /**
     * 数据库名称
     */
    @ApiField("DBName")
    private String dBName;

    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public String getdBName() {
        return this.dBName;
    }

    public void setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

}
