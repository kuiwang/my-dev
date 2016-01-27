package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.DBInstanceAccount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeAccounts.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeAccountsResponse extends AliyunResponse {

    private static final long serialVersionUID = 5623374534589524589L;

    /**
     * 由Account组成的数组
     */
    @ApiListField("Accounts")
    @ApiField("DBInstanceAccount")
    private List<DBInstanceAccount> accounts;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    public List<DBInstanceAccount> getAccounts() {
        return this.accounts;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setAccounts(List<DBInstanceAccount> accounts) {
        this.accounts = accounts;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
