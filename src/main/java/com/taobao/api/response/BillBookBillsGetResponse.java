package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BookBill;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.bill.book.bills.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BillBookBillsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7611614212761244614L;

    /**
     * 虚拟账户账单列表
     */
    @ApiListField("bills")
    @ApiField("book_bill")
    private List<BookBill> bills;

    /**
     * 是否有下一页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 当前查询的结果数,非总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<BookBill> getBills() {
        return this.bills;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setBills(List<BookBill> bills) {
        this.bills = bills;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
