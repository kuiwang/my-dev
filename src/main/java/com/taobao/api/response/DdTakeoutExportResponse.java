package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DianDianShopPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.takeout.export response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdTakeoutExportResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3431845864835554192L;

    /**
     * 外卖店铺信息
     */
    @ApiField("result")
    private DianDianShopPage result;

    public DianDianShopPage getResult() {
        return this.result;
    }

    public void setResult(DianDianShopPage result) {
        this.result = result;
    }

}
