package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.recommend.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemRecommendDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6497995986385359885L;

    /**
     * 被取消橱窗推荐的商品信息
     */
    @ApiField("item")
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

}
