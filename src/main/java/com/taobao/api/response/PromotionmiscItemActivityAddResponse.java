package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.item.activity.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscItemActivityAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4364523186792448695L;

    /**
     * 活动id。
     */
    @ApiField("activity_id")
    private Long activityId;

    /**
     * 是否保存成功。
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
