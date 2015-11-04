package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AccountFreeze;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: alipay.user.account.freeze.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayUserAccountFreezeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6472595984826699179L;

    /**
     * 冻结金额列表
     */
    @ApiListField("freeze_items")
    @ApiField("account_freeze")
    private List<AccountFreeze> freezeItems;

    /**
     * 冻结总条数
     */
    @ApiField("total_results")
    private String totalResults;

    public void setFreezeItems(List<AccountFreeze> freezeItems) {
        this.freezeItems = freezeItems;
    }

    public List<AccountFreeze> getFreezeItems() {
        return this.freezeItems;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getTotalResults() {
        return this.totalResults;
    }

}
