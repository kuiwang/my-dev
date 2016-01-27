package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayEbppBillKeySearchResponse;

/**
 * TOP API: alipay.ebpp.bill.key.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayEbppBillKeySearchRequest implements
        TaobaoRequest<AlipayEbppBillKeySearchResponse> {

    /**
     * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。<br />
     * 支持最大长度为：80<br />
     * 支持的最大列表长度为：80
     */
    private String chargeInst;

    /**
     * 结束时间。与开始时间间隔在七天之内
     */
    private String endTime;

    /**
     * 需要返回的字段列表。bill_key:户号
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否仅包含订阅数据
     */
    private Boolean onlySubscribed;

    /**
     * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String orderType;

    /**
     * 开始时间，时间必须是今天范围之内。格式为yyyy-MM-dd HH:mm:ss，精确到天
     */
    private String startTime;

    /**
     * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String subOrderType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(chargeInst, "chargeInst");
        RequestCheckUtils.checkMaxLength(chargeInst, 80, "chargeInst");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(orderType, "orderType");
        RequestCheckUtils.checkMaxLength(orderType, 10, "orderType");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
        RequestCheckUtils.checkNotEmpty(subOrderType, "subOrderType");
        RequestCheckUtils.checkMaxLength(subOrderType, 10, "subOrderType");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.ebpp.bill.key.search";
    }

    public String getChargeInst() {
        return this.chargeInst;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getOnlySubscribed() {
        return this.onlySubscribed;
    }

    public String getOrderType() {
        return this.orderType;
    }

    @Override
    public Class<AlipayEbppBillKeySearchResponse> getResponseClass() {
        return AlipayEbppBillKeySearchResponse.class;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getSubOrderType() {
        return this.subOrderType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charge_inst", this.chargeInst);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("only_subscribed", this.onlySubscribed);
        txtParams.put("order_type", this.orderType);
        txtParams.put("start_time", this.startTime);
        txtParams.put("sub_order_type", this.subOrderType);
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

    public void setChargeInst(String chargeInst) {
        this.chargeInst = chargeInst;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setOnlySubscribed(Boolean onlySubscribed) {
        this.onlySubscribed = onlySubscribed;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setSubOrderType(String subOrderType) {
        this.subOrderType = subOrderType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
