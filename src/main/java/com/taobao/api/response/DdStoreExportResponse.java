package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DianDianShopPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.store.export response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdStoreExportResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7171732325562533486L;

    /**
     * 淘点点店铺分页信息
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
