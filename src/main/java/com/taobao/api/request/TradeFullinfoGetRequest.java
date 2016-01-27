package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeFullinfoGetResponse;

/**
 * TOP API: taobao.trade.fullinfo.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeFullinfoGetRequest implements TaobaoRequest<TradeFullinfoGetResponse> {

    /**
     * 1.Trade中可以指定返回的fields：seller_nick, buyer_nick, title, type, created,
     * tid, seller_rate,buyer_flag, buyer_rate, status, payment,
     * adjust_fee, post_fee, total_fee, pay_time, end_time, modified,
     * consign_time, buyer_obtain_point_fee, point_fee, real_point_fee,
     * received_payment, commission_fee, buyer_memo, seller_memo,
     * alipay_no,alipay_id,buyer_message, pic_path, num_iid, num, price,
     * buyer_alipay_no, receiver_name, receiver_state, receiver_city,
     * receiver_district, receiver_address, receiver_zip, receiver_mobile,
     * receiver_phone,seller_flag, seller_alipay_no, seller_mobile,
     * seller_phone, seller_name, seller_email, available_confirm_fee,
     * has_post_fee, timeout_action_time, snapshot_url, cod_fee,
     * cod_status, shipping_type, trade_memo, is_3D,buyer_email,buyer_area,
     * trade_from
     * ,is_lgtype,is_force_wlb,is_brand_sale,buyer_cod_fee,discount_fee
     * ,seller_cod_fee
     * ,express_agency_fee,invoice_name,service_orders,credit_cardfee
     * ,step_trade_status
     * ,step_paid_fee,mark_desc,has_yfx,yfx_fee,yfx_id,yfx_type
     * ,trade_source
     * (注：当该授权用户为卖家时不能查看买家buyer_memo,buyer_flag),eticket_ext,send_time,
     * is_daixiao,is_part_consign, arrive_interval, arrive_cut_time,
     * consign_interval
     * ,zero_purchase,alipay_point,pcc_af,2.Order中可以指定返回fields
     * ：orders.title, orders.pic_path, orders.price, orders.num,
     * orders.num_iid, orders.sku_id, orders.refund_status, orders.status,
     * orders.oid, orders.total_fee, orders.payment, orders.discount_fee,
     * orders.adjust_fee, orders.snapshot_url,
     * orders.timeout_action_time，orders.sku_properties_name,
     * orders.item_meal_name, orders.item_meal_id,orders.buyer_rate,
     * orders.seller_rate, orders.outer_iid, orders.outer_sku_id,
     * orders.refund_id, orders.seller_type,
     * orders.is_oversold,orders.end_time
     * ,orders.order_from,orders.consign_time
     * ,orders.shipping_type,orders.logistics_company,orders.invoice_no,
     * orders.is_daixiao 3.fields：orders（返回Order的所有内容）
     * 4.flelds：promotion_details
     * (返回promotion_details所有内容，优惠详情),invoice_name
     * (发票抬头),orders.is_www(子订单是否是www订单,orders.store_code(发货的仓库编码)<br>
     * 5. field:service_tags(返回物流标签)
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 交易编号<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：1
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
        RequestCheckUtils.checkMaxValue(tid, 9223372036854775807L, "tid");
        RequestCheckUtils.checkMinValue(tid, 1L, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.fullinfo.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TradeFullinfoGetResponse> getResponseClass() {
        return TradeFullinfoGetResponse.class;
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
