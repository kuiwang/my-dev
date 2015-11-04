package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.MjsPromotion;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscMjsActivityListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8399667358517668975L;

    /**
     * 只包含活动的主要信息，如activity_id，aame，description，start_time，end_time，type，
     * participate_range
     * 。优惠的其他详细信息，请通过taobao.promotionmisc.mjs.activity.get获取。
     */
    @ApiListField("mjs_promotion_list")
    @ApiField("mjs_promotion")
    private List<MjsPromotion> mjsPromotionList;

    /**
     * 记录总条数。
     */
    @ApiField("total_count")
    private Long totalCount;

    public void setMjsPromotionList(List<MjsPromotion> mjsPromotionList) {
        this.mjsPromotionList = mjsPromotionList;
    }

    public List<MjsPromotion> getMjsPromotionList() {
        return this.mjsPromotionList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
