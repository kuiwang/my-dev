package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Account;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.bill.accounts.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BillAccountsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5181162952486269541L;

    /**
     * 返回的科目信息
     */
    @ApiListField("accounts")
    @ApiField("account")
    private List<Account> accounts;

    /**
     * 返回记录行数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
