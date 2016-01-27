package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountAddResponse;

/**
 * TOP API: taobao.fenxiao.discount.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDiscountAddRequest implements TaobaoRequest<FenxiaoDiscountAddResponse> {

    /**
     * 折扣名称,长度不能超过25字节
     */
    private String discountName;

    /**
     * PERCENT（按折扣优惠）、PRICE（按减价优惠），例如"PERCENT,PRICE,PERCENT"
     */
    private String discountTypes;

    /**
     * 优惠比率或者优惠价格，例如：”8000,-2300,7000”,大小为-100000000到100000000之间（单位：分）
     */
    private String discountValues;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 会员等级的id或者分销商id，例如：”1001,2001,1002”
     */
    private String targetIds;

    /**
     * GRADE（按会员等级优惠）、DISTRIBUTOR（按分销商优惠），例如"GRADE,DISTRIBUTOR"
     */
    private String targetTypes;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(discountName, "discountName");
        RequestCheckUtils.checkNotEmpty(discountTypes, "discountTypes");
        RequestCheckUtils.checkNotEmpty(discountValues, "discountValues");
        RequestCheckUtils.checkNotEmpty(targetIds, "targetIds");
        RequestCheckUtils.checkNotEmpty(targetTypes, "targetTypes");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.discount.add";
    }

    public String getDiscountName() {
        return this.discountName;
    }

    public String getDiscountTypes() {
        return this.discountTypes;
    }

    public String getDiscountValues() {
        return this.discountValues;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<FenxiaoDiscountAddResponse> getResponseClass() {
        return FenxiaoDiscountAddResponse.class;
    }

    public String getTargetIds() {
        return this.targetIds;
    }

    public String getTargetTypes() {
        return this.targetTypes;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("discount_name", this.discountName);
        txtParams.put("discount_types", this.discountTypes);
        txtParams.put("discount_values", this.discountValues);
        txtParams.put("target_ids", this.targetIds);
        txtParams.put("target_types", this.targetTypes);
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

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public void setDiscountTypes(String discountTypes) {
        this.discountTypes = discountTypes;
    }

    public void setDiscountValues(String discountValues) {
        this.discountValues = discountValues;
    }

    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
    }

    public void setTargetTypes(String targetTypes) {
        this.targetTypes = targetTypes;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
