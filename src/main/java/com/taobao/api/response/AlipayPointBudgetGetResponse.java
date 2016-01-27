package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.point.budget.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayPointBudgetGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2852419621343668824L;

    /**
     * 还可以发放的集分宝个数
     */
    @ApiField("budget_amount")
    private Long budgetAmount;

    public Long getBudgetAmount() {
        return this.budgetAmount;
    }

    public void setBudgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

}
