package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ju.catitemids.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuCatitemidsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2423256523657698945L;

    /**
     * 返回的商品ID列表
     */
    @ApiListField("item_ids")
    @ApiField("number")
    private List<Long> itemIds;

    public List<Long> getItemIds() {
        return this.itemIds;
    }

    public void setItemIds(List<Long> itemIds) {
        this.itemIds = itemIds;
    }

}
