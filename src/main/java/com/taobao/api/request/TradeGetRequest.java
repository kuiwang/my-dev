package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeGetResponse;

/**
 * TOP API: taobao.trade.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeGetRequest implements TaobaoRequest<TradeGetResponse> {

    /**
     * 需要返回的字段。目前支持有：<br>
     * 
     * 1. Trade中可以指定返回的fields:seller_nick, buyer_nick, title, type,
     * created, tid, seller_rate, buyer_rate, status, payment,
     * discount_fee, adjust_fee, post_fee, total_fee, pay_time, end_time,
     * modified, consign_time, buyer_obtain_point_fee, point_fee,
     * real_point_fee, received_payment, commission_fee, buyer_memo,
     * seller_memo, alipay_no, buyer_message, pic_path, num_iid, num,
     * price, cod_fee, cod_status, shipping_type，
     * is_daixiao，consign_interval，arrive_interval，arrive_cut_time <br>
     * 2. Order中可以指定返回fields:orders.title, orders.pic_path, orders.price,
     * orders.num, orders.num_iid, orders.sku_id, orders.refund_status,
     * orders.status, orders.oid, orders.total_fee, orders.payment,
     * orders.discount_fee, orders.adjust_fee, orders.sku_properties_name,
     * orders.item_meal_name, orders.outer_sku_id, orders.outer_iid,
     * orders.buyer_rate, orders.seller_rate， orders.is_daixiao <br>
     * 3.
     * fields：orders（返回Order中的所有允许返回的字段）,orders.is_wwww(是否是www订单),orders.
     * store_code(仓库代码）<br>
     * 4. field:service_tags(返回物流标签)
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 交易编号
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TradeGetResponse> getResponseClass() {
        return TradeGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
        return this.tid;
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
