package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountsGetResponse;

/**
 * TOP API: taobao.fenxiao.discounts.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDiscountsGetRequest implements TaobaoRequest<FenxiaoDiscountsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 折扣ID
     */
    private Long discountId;

    /**
     * 指定查询额外的信息，可选值：DETAIL（查询折扣详情），多个可选值用逗号分割。（只允许指定折扣ID情况下使用）
     */
    private String extFields;

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setExtFields(String extFields) {
        this.extFields = extFields;
    }

    public String getExtFields() {
        return this.extFields;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.discounts.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("discount_id", this.discountId);
        txtParams.put("ext_fields", this.extFields);
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

    public Class<FenxiaoDiscountsGetResponse> getResponseClass() {
        return FenxiaoDiscountsGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
