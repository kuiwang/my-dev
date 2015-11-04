package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DdTopPagination;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.reserved.list response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdReservedListResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3522892499266344879L;

    /**
     * 订单列表翻页对象
     */
    @ApiField("result")
    private DdTopPagination result;

    public void setResult(DdTopPagination result) {
        this.result = result;
    }

    public DdTopPagination getResult() {
        return this.result;
    }

}
