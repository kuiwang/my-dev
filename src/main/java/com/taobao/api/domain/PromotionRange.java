package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 满就送参与范围
 *
 * @author auto create
 * @since 1.0, null
 */
public class PromotionRange extends TaobaoObject {

    private static final long serialVersionUID = 8449498769187177382L;

    /**
     * 活动id。
     */
    @ApiField("activity_id")
    private Long activityId;

    /**
     * 活动名称。
     */
    @ApiField("activity_name")
    private String activityName;

    /**
     * 参与活动的商品id。
     */
    @ApiField("item_id")
    private Long itemId;

    public Long getActivityId() {
        return this.activityId;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

}
