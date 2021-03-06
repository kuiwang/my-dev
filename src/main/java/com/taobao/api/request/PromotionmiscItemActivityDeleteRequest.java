package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscItemActivityDeleteResponse;

/**
 * TOP API: taobao.promotionmisc.item.activity.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionmiscItemActivityDeleteRequest
        implements TaobaoRequest<PromotionmiscItemActivityDeleteResponse> {

    /**
     * 活动id。<br />
     * 支持最小值为：0
     */
    private Long activityId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityId, "activityId");
        RequestCheckUtils.checkMinValue(activityId, 0L, "activityId");
    }

    public Long getActivityId() {
        return this.activityId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotionmisc.item.activity.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<PromotionmiscItemActivityDeleteResponse> getResponseClass() {
        return PromotionmiscItemActivityDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_id", this.activityId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
