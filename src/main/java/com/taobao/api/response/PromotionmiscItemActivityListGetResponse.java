package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemPromotion;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.promotionmisc.item.activity.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscItemActivityListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2573267234244475644L;

    /**
     * 只包含活动的主要信息，如activity_id，name，description，start_time，end_time，
     * participate_range
     * 。优惠的其他详细信息，请通过taobao.promotionmisc.item.activity.get获取。
     */
    @ApiListField("item_promotion_list")
    @ApiField("item_promotion")
    private List<ItemPromotion> itemPromotionList;

    /**
     * 记录总条数。
     */
    @ApiField("total_count")
    private Long totalCount;

    public void setItemPromotionList(List<ItemPromotion> itemPromotionList) {
        this.itemPromotionList = itemPromotionList;
    }

    public List<ItemPromotion> getItemPromotionList() {
        return this.itemPromotionList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
