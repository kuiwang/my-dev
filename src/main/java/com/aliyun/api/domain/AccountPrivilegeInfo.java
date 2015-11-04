package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 数据库帐号权限
 *
 * @author auto create
 * @since 1.0, null
 */
public class AccountPrivilegeInfo extends TaobaoObject {

    private static final long serialVersionUID = 5845919253499645845L;

    /**
     * 帐号名称
     */
    @ApiField("Account")
    private String account;

    /**
     * 帐号对该DB具有的权限
     */
    @ApiField("AccountPrivilege")
    private String accountPrivilege;

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public void setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
    }

}
