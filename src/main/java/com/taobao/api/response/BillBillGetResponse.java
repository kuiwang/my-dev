package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Bill;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.bill.bill.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BillBillGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2498895813475988325L;

    /**
     * 账单明细
     */
    @ApiField("bill")
    private Bill bill;

    public Bill getBill() {
        return this.bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

}
