package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscActivityRangeListGetResponse;

/**
 * TOP API: taobao.promotionmisc.activity.range.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionmiscActivityRangeListGetRequest implements
        TaobaoRequest<PromotionmiscActivityRangeListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动id<br />
     * 支持最小值为：0
     */
    private Long activityId;

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotionmisc.activity.range.list.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_id", this.activityId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<PromotionmiscActivityRangeListGetResponse> getResponseClass() {
        return PromotionmiscActivityRangeListGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityId, "activityId");
        RequestCheckUtils.checkMinValue(activityId, 0L, "activityId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
