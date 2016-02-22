package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscActivityRangeRemoveResponse;

/**
 * TOP API: taobao.promotionmisc.activity.range.remove request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionmiscActivityRangeRemoveRequest
        implements TaobaoRequest<PromotionmiscActivityRangeRemoveResponse> {

    /**
     * 活动id。<br />
     * 支持最小值为：0
     */
    private Long activityId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品id,多个id用逗号隔开。
     */
    private String ids;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityId, "activityId");
        RequestCheckUtils.checkMinValue(activityId, 0L, "activityId");
        RequestCheckUtils.checkNotEmpty(ids, "ids");
    }

    public Long getActivityId() {
        return this.activityId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotionmisc.activity.range.remove";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIds() {
        return this.ids;
    }

    @Override
    public Class<PromotionmiscActivityRangeRemoveResponse> getResponseClass() {
        return PromotionmiscActivityRangeRemoveResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_id", this.activityId);
        txtParams.put("ids", this.ids);
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

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
