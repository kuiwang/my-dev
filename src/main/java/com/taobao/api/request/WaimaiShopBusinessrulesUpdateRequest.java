package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiShopBusinessrulesUpdateResponse;

/**
 * TOP API: taobao.waimai.shop.businessrules.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiShopBusinessrulesUpdateRequest implements
        TaobaoRequest<WaimaiShopBusinessrulesUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 配送范围地图标注
     */
    private String areaRange;

    /**
     * 配送费
     */
    private String deliveryAmount;

    /**
     * 配送范围文字说明
     */
    private String deliveryArea;

    /**
     * 配送时间
     */
    private String deliveryTime;

    /**
     * 送货预留时间
     */
    private Long earlyMinutes;

    /**
     * 满多少就免配送费
     */
    private String fullAmount;

    /**
     * 起送金额
     */
    private String minimumAmount;

    /**
     * 外卖商家电话
     */
    private String mobile;

    /**
     * 店铺id
     */
    private Long shopid;

    /**
     * 支持预定, 当天：1，三天内：3，七天内：7
     */
    private Long supportDays;

    public void setAreaRange(String areaRange) {
        this.areaRange = areaRange;
    }

    public String getAreaRange() {
        return this.areaRange;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public String getDeliveryAmount() {
        return this.deliveryAmount;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    public String getDeliveryArea() {
        return this.deliveryArea;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setEarlyMinutes(Long earlyMinutes) {
        this.earlyMinutes = earlyMinutes;
    }

    public Long getEarlyMinutes() {
        return this.earlyMinutes;
    }

    public void setFullAmount(String fullAmount) {
        this.fullAmount = fullAmount;
    }

    public String getFullAmount() {
        return this.fullAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public String getMinimumAmount() {
        return this.minimumAmount;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public void setSupportDays(Long supportDays) {
        this.supportDays = supportDays;
    }

    public Long getSupportDays() {
        return this.supportDays;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.shop.businessrules.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("area_range", this.areaRange);
        txtParams.put("delivery_amount", this.deliveryAmount);
        txtParams.put("delivery_area", this.deliveryArea);
        txtParams.put("delivery_time", this.deliveryTime);
        txtParams.put("early_minutes", this.earlyMinutes);
        txtParams.put("full_amount", this.fullAmount);
        txtParams.put("minimum_amount", this.minimumAmount);
        txtParams.put("mobile", this.mobile);
        txtParams.put("shopid", this.shopid);
        txtParams.put("support_days", this.supportDays);
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

    public Class<WaimaiShopBusinessrulesUpdateResponse> getResponseClass() {
        return WaimaiShopBusinessrulesUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(areaRange, "areaRange");
        RequestCheckUtils.checkNotEmpty(deliveryAmount, "deliveryAmount");
        RequestCheckUtils.checkNotEmpty(deliveryArea, "deliveryArea");
        RequestCheckUtils.checkNotEmpty(deliveryTime, "deliveryTime");
        RequestCheckUtils.checkNotEmpty(earlyMinutes, "earlyMinutes");
        RequestCheckUtils.checkNotEmpty(fullAmount, "fullAmount");
        RequestCheckUtils.checkNotEmpty(minimumAmount, "minimumAmount");
        RequestCheckUtils.checkNotEmpty(mobile, "mobile");
        RequestCheckUtils.checkNotEmpty(shopid, "shopid");
        RequestCheckUtils.checkNotEmpty(supportDays, "supportDays");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
