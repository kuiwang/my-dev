package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiOrderIndexGetResponse;

/**
 * TOP API: taobao.waimai.order.index.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiOrderIndexGetRequest implements TaobaoRequest<WaimaiOrderIndexGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 订单创建时间的结束时间,格式为 yyyy-MM-dd HH:mm:ss
     */
    private String endTime;

    /**
     * 获取最近一定秒数的订单
     */
    private Long interval;

    /**
     * 订单状态 待确认订单2 , 退款中订单4 , 已发货12 关闭20 交易成功21
     */
    private Long orderStatus;

    /**
     * 订单类型
     */
    private Long orderType;

    /**
     * 页码<br />
     * 支持的最大列表长度为：100
     */
    private Long pageNo;

    /**
     * 返回记录数，超过200按200条返回数据<br />
     * 支持最大值为：200<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 外卖分店ID
     */
    private Long shopId;

    /**
     * 订单创建时间的起点时间,格式为 yyyy-MM-dd HH:mm:ss
     */
    private String startTime;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getInterval() {
        return this.interval;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getShopId() {
        return this.shopId;
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
        return "taobao.waimai.order.index.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("interval", this.interval);
        txtParams.put("order_status", this.orderStatus);
        txtParams.put("order_type", this.orderType);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("shop_id", this.shopId);
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

    public Class<WaimaiOrderIndexGetResponse> getResponseClass() {
        return WaimaiOrderIndexGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
