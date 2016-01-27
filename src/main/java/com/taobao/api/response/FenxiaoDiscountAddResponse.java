package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.discount.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDiscountAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8442248236545873169L;

    /**
     * 折扣ID
     */
    @ApiField("discount_id")
    private Long discountId;

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

}
