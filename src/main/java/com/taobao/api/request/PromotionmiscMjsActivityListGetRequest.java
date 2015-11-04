package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscMjsActivityListGetResponse;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class PromotionmiscMjsActivityListGetRequest implements
        TaobaoRequest<PromotionmiscMjsActivityListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动类型： 1表示商品级别的活动；2表示店铺级别的活动。<br />
     * 支持最大值为：2<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：1
     */
    private Long activityType;

    /**
     * 页码。<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每页记录数，最大支持50 。<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    public void setActivityType(Long activityType) {
        this.activityType = activityType;
    }

    public Long getActivityType() {
        return this.activityType;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotionmisc.mjs.activity.list.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_type", this.activityType);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
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

    public Class<PromotionmiscMjsActivityListGetResponse> getResponseClass() {
        return PromotionmiscMjsActivityListGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityType, "activityType");
        RequestCheckUtils.checkMaxValue(activityType, 2L, "activityType");
        RequestCheckUtils.checkMinValue(activityType, 1L, "activityType");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
