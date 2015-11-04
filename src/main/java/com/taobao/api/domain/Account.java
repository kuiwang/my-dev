package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 费用科目
 *
 * @author auto create
 * @since 1.0, null
 */
public class Account extends TaobaoObject {

    private static final long serialVersionUID = 4568659646666361863L;

    /**
     * 费用科目编码
     */
    @ApiField("account_code")
    private String accountCode;

    /**
     * 费用科目编号
     */
    @ApiField("account_id")
    private Long accountId;

    /**
     * 费用科目名称
     */
    @ApiField("account_name")
    private String accountName;

    /**
     * 费用科目类型:1-虚拟账户 2-交易 3-交易佣金 4-服务费 5-天猫积分 6-其他
     */
    @ApiField("account_type")
    private Long accountType;

    public String getAccountCode() {
        return this.accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountType() {
        return this.accountType;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

}
