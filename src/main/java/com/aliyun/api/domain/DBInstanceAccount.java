package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * RDSD BInstanceAccount
 *
 * @author auto create
 * @since 1.0, null
 */
public class DBInstanceAccount extends TaobaoObject {

    private static final long serialVersionUID = 4249433453427592751L;

    /**
     * 帐号备注信息
     */
    @ApiField("AccountDescription")
    private String accountDescription;

    /**
     * DB操作帐号名称
     */
    @ApiField("AccountName")
    private String accountName;

    /**
     * 帐号状态， Unavailable:不可用； Available:可用
     */
    @ApiField("AccountStatus")
    private String accountStatus;

    /**
     * 帐号所属实例名称
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 由DatabasePrivilege组成的数组
     */
    @ApiListField("DatabasePrivileges")
    @ApiField("DatabasePrivilege")
    private List<DatabasePrivilege> databasePrivileges;

    public String getAccountDescription() {
        return this.accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public List<DatabasePrivilege> getDatabasePrivileges() {
        return this.databasePrivileges;
    }

    public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
        this.databasePrivileges = databasePrivileges;
    }

}
