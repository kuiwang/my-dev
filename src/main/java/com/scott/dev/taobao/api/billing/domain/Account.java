package com.scott.dev.taobao.api.billing.domain;

/**
 * 费用科目
 */
public class Account {

    /**
     * 费用科目编码
     */
    private String accountCode;

    /**
     * 费用科目编号
     */
    private Long accountId;

    /**
     * 费用科目名称
     */
    private String accountName;

    /**
     * 费用科目类型:1-虚拟账户 2-交易 3-交易佣金 4-服务费 5-天猫积分 6-其他
     */
    private Long accountType;

    public String getAccountCode() {
        return this.accountCode;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public Long getAccountType() {
        return this.accountType;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

}
