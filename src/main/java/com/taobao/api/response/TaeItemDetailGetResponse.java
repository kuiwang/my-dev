package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemDetailData;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tae.item.detail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaeItemDetailGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5444921489433222521L;

    /**
     * 详情业务模块数据
     */
    @ApiField("data")
    private ItemDetailData data;

    public void setData(ItemDetailData data) {
        this.data = data;
    }

    public ItemDetailData getData() {
        return this.data;
    }

}
