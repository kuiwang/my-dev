package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemPromotion;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.item.activity.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscItemActivityGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1417497638283512196L;

    /**
     * 单品优惠活动信息。
     */
    @ApiField("item_promotion")
    private ItemPromotion itemPromotion;

    public ItemPromotion getItemPromotion() {
        return this.itemPromotion;
    }

    public void setItemPromotion(ItemPromotion itemPromotion) {
        this.itemPromotion = itemPromotion;
    }

}
