package com.scott.dev.taobao.api.wangwang.domain;

import java.util.List;

/**
 * E客服账号操作信息
 */
public class AccountInfo {

    /**
     * 账号
     */
    private String account;

    /**
     * 操作列表
     */
    private List<AccountStat> accountStats;

    /**
     * account_stats列表的长度
     */
    private Long count;

    public String getAccount() {
        return this.account;
    }

    public List<AccountStat> getAccountStats() {
        return this.accountStats;
    }

    public Long getCount() {
        return this.count;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setAccountStats(List<AccountStat> accountStats) {
        this.accountStats = accountStats;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
