package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrderShengxianConfirmResponse;

/**
 * TOP API: taobao.logistics.order.shengxian.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsOrderShengxianConfirmRequest
        implements TaobaoRequest<LogisticsOrderShengxianConfirmResponse> {

    /**
     * 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。<br>
     * <font color='red'>如果为空，取的卖家的默认退货地址</font><br>
     */
    private Long cancelId;

    /**
     * 1：冷链。0：常温
     */
    private Long deliveryType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物流订单ID 。同淘宝交易订单互斥，淘宝交易号存在，，以淘宝交易号为准<br />
     * 支持最小值为：1000
     */
    private Long logisId;

    /**
     * 运单号.具体一个物流公司的真实运单号码。支持多个运单号，多个运单号之间用英文分号（;）隔开，不能重复。淘宝官方物流会校验，请谨慎传入；
     */
    private String outSid;

    /**
     * 商家的IP地址
     */
    private String sellerIp;

    /**
     * 卖家联系人地址库ID，可以通过taobao.logistics.address.search接口查询到地址库ID。
     * <font color='red'>如果为空，取的卖家的默认取货地址</font>
     * 
     * 如果service_code不为空，默认使用service_code
     * 如果service_code为空，sender_id不为空，使用sender_id对应的地址发货
     * 如果service_code与sender_id都为空，使用默认地址发货
     */
    private Long senderId;

    /**
     * 仓库的服务代码标示，代码一个仓库的实体。(可以通过taobao.wlb.stores.baseinfo.get接口查询)
     * 
     * 如果service_code为空，默认通过sender_id来发货
     */
    private String serviceCode;

    /**
     * 淘宝交易ID<br />
     * 支持最小值为：1000
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(logisId, 1000L, "logisId");
        RequestCheckUtils.checkNotEmpty(outSid, "outSid");
        RequestCheckUtils.checkMinValue(tid, 1000L, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.order.shengxian.confirm";
    }

    public Long getCancelId() {
        return this.cancelId;
    }

    public Long getDeliveryType() {
        return this.deliveryType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLogisId() {
        return this.logisId;
    }

    public String getOutSid() {
        return this.outSid;
    }

    @Override
    public Class<LogisticsOrderShengxianConfirmResponse> getResponseClass() {
        return LogisticsOrderShengxianConfirmResponse.class;
    }

    public String getSellerIp() {
        return this.sellerIp;
    }

    public Long getSenderId() {
        return this.senderId;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cancel_id", this.cancelId);
        txtParams.put("delivery_type", this.deliveryType);
        txtParams.put("logis_id", this.logisId);
        txtParams.put("out_sid", this.outSid);
        txtParams.put("seller_ip", this.sellerIp);
        txtParams.put("sender_id", this.senderId);
        txtParams.put("service_code", this.serviceCode);
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

    public void setCancelId(Long cancelId) {
        this.cancelId = cancelId;
    }

    public void setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void setLogisId(Long logisId) {
        this.logisId = logisId;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public void setSellerIp(String sellerIp) {
        this.sellerIp = sellerIp;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
