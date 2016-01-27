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

    /**
     * 支付宝订单号，为空查询所有记录
     */
    private String alipayOrderNo;

    /**
     * 结束时间。与开始时间间隔在七天之内
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    @Override
    public String getApiMethodName() {
        return "alipay.user.trade.search";
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public String getPageNo() {
        return this.pageNo;
    }

    public String getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<AlipayUserTradeSearchResponse> getResponseClass() {
        return AlipayUserTradeSearchResponse.class;
    }

    public String getStartTime() {
        return this.startTime;
    }

    @Override
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

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
