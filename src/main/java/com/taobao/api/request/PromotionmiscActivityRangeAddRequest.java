package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscActivityRangeAddResponse;

/**
 * TOP API: taobao.promotionmisc.activity.range.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionmiscActivityRangeAddRequest implements
        TaobaoRequest<PromotionmiscActivityRangeAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动id。<br />
     * 支持最小值为：0
     */
    private Long activityId;

    /**
     * 商品id,多个id用逗号隔开，一次不超过50个。
     */
    private String ids;

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotionmisc.activity.range.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_id", this.activityId);
        txtParams.put("ids", this.ids);
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

    public Class<PromotionmiscActivityRangeAddResponse> getResponseClass() {
        return PromotionmiscActivityRangeAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityId, "activityId");
        RequestCheckUtils.checkMinValue(activityId, 0L, "activityId");
        RequestCheckUtils.checkNotEmpty(ids, "ids");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
