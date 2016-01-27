package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.MjsPromotion;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscMjsActivityGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4178873816832297234L;

    /**
     * 满就送活动信息。
     */
    @ApiField("mjs_promotion")
    private MjsPromotion mjsPromotion;

    public MjsPromotion getMjsPromotion() {
        return this.mjsPromotion;
    }

    public void setMjsPromotion(MjsPromotion mjsPromotion) {
        this.mjsPromotion = mjsPromotion;
    }

}
