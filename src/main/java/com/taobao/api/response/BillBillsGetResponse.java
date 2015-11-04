package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Bill;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.bill.bills.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BillBillsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4649947799723768347L;

    /**
     * 账单列表
     */
    @ApiListField("bills")
    @ApiField("bill")
    private List<Bill> bills;

    /**
     * 是否存在下一页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 当前页查询返回的结果数(0-100)。相同的查询时间段条件下，最大只能获取总共5000条记录。所以当大于等于5000时
     * ISV可以通过start_time及end_time来进行拆分，以保证可以查询到全部数据
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<Bill> getBills() {
        return this.bills;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
