package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayUserTradeSearchResponse;

/**
 * TOP API: alipay.user.trade.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class AlipayUserTradeSearchRequest implements TaobaoRequest<AlipayUserTradeSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 支付宝订单号，为空查询所有记录
     */
    private String alipayOrderNo;

    /**
     * 结束时间。与开始时间间隔在七天之内
     */
    private String endTime;

    /**
     * 商户订单号，为空查询所有记录
     */
    private String merchantOrderNo;

    /**
     * 订单来源，为空查询所有来源。淘宝(TAOBAO)，支付宝(ALIPAY)，其它(OTHER)
     */
    private String orderFrom;

    /**
     * 订单状态，为空查询所有状态订单
     */
    private String orderStatus;

    /**
     * 订单类型，为空查询所有类型订单。
     */
    private String orderType;

    /**
     * 页码。取值范围:大于零的整数; 默认值1
     */
    private String pageNo;

    /**
     * 每页获取条数。最大值500。
     */
    private String pageSize;

    /**
     * 开始时间，时间必须是今天范围之内。格式为yyyy-MM-dd HH:mm:ss，精确到秒
     */
    private String startTime;

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.user.trade.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alipay_order_no", this.alipayOrderNo);
        txtParams.put("end_time", this.endTime);
        txtParams.put("merchant_order_no", this.merchantOrderNo);
        txtParams.put("order_from", this.orderFrom);
        txtParams.put("order_status", this.orderStatus);
        txtParams.put("order_type", this.orderType);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
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

    public Class<AlipayUserTradeSearchResponse> getResponseClass() {
        return AlipayUserTradeSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
