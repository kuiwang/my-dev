package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoShopInfoInputResponse;

/**
 * TOP API: taobao.caipiao.shop.info.input request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoShopInfoInputRequest implements TaobaoRequest<CaipiaoShopInfoInputResponse> {

    /**
     * 活动结束时间，格式需严格遵守yyyy-MM-dd HH:mm:ss，不可为空
     */
    private String actEndDate;

    /**
     * 活动开始时间，格式需严格遵守yyyy-MM-dd HH:mm:ss，不可为空
     */
    private String actStartDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 赠送类型：0-满就送；1-好评送；2-分享送；3-游戏送；4-收藏送，不可为空
     */
    private Long presentType;

    /**
     * 店铺参加的送彩票活动描述
     */
    private String shopDesc;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 店铺类目编号，不可为空
     */
    private Long shopType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actEndDate, "actEndDate");
        RequestCheckUtils.checkNotEmpty(actStartDate, "actStartDate");
        RequestCheckUtils.checkNotEmpty(presentType, "presentType");
        RequestCheckUtils.checkNotEmpty(shopType, "shopType");
    }

    public String getActEndDate() {
        return this.actEndDate;
    }

    public String getActStartDate() {
        return this.actStartDate;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.caipiao.shop.info.input";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPresentType() {
        return this.presentType;
    }

    @Override
    public Class<CaipiaoShopInfoInputResponse> getResponseClass() {
        return CaipiaoShopInfoInputResponse.class;
    }

    public String getShopDesc() {
        return this.shopDesc;
    }

    public String getShopName() {
        return this.shopName;
    }

    public Long getShopType() {
        return this.shopType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_end_date", this.actEndDate);
        txtParams.put("act_start_date", this.actStartDate);
        txtParams.put("present_type", this.presentType);
        txtParams.put("shop_desc", this.shopDesc);
        txtParams.put("shop_name", this.shopName);
        txtParams.put("shop_type", this.shopType);
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

    public void setActEndDate(String actEndDate) {
        this.actEndDate = actEndDate;
    }

    public void setActStartDate(String actStartDate) {
        this.actStartDate = actStartDate;
    }

    public void setPresentType(Long presentType) {
        this.presentType = presentType;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopType(Long shopType) {
        this.shopType = shopType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
