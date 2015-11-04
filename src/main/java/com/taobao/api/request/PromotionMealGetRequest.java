package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMealGetResponse;

/**
 * TOP API: taobao.promotion.meal.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionMealGetRequest implements TaobaoRequest<PromotionMealGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 搭配套餐id
     */
    private Long mealId;

    /**
     * 套餐状态。有效：VALID;失效：INVALID(有效套餐为可使用的套餐,无效套餐为套餐中有商品下架或库存为0时)。
     * 默认时两种情况都会查询。
     */
    private String status;

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public Long getMealId() {
        return this.mealId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotion.meal.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("meal_id", this.mealId);
        txtParams.put("status", this.status);
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

    public Class<PromotionMealGetResponse> getResponseClass() {
        return PromotionMealGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
