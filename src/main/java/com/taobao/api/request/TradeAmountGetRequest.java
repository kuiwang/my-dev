package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeAmountGetResponse;

/**
 * TOP API: taobao.trade.amount.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeAmountGetRequest implements TaobaoRequest<TradeAmountGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 订单帐务详情需要返回的字段信息，可选值如下： 1. TradeAmount中可指定的fields：
     * tid,alipay_no,created
     * ,pay_time,end_time,total_fee,payment,post_fee,cod_fee
     * ,commission_fee,buyer_obtain_point_fee 2.
     * OrderAmount中可指定的fields：order_amounts
     * .oid,order_amounts.title,order_amounts.num_iid,
     * order_amounts.sku_properties_name
     * ,order_amounts.sku_id,order_amounts.
     * num,order_amounts.price,order_amounts
     * .discount_fee,order_amounts.adjust_fee
     * ,order_amounts.payment,order_amounts.promotion_name 3.
     * order_amounts(返回OrderAmount的所有内容) 4.
     * promotion_details(指定该值会返回主订单的promotion_details中除id之外的所有字段)
     */
    private String fields;

    /**
     * 订单交易编号<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：-9223372036854775808
     */
    private Long tid;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.amount.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("tid", this.tid);
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

    public Class<TradeAmountGetResponse> getResponseClass() {
        return TradeAmountGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
        RequestCheckUtils.checkMaxValue(tid, 9223372036854775807L, "tid");
        RequestCheckUtils.checkMinValue(tid, -9223372036854775808L, "tid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
