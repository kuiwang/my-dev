package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiAgentOrderlistGetResponse;

/**
 * TOP API: taobao.waimai.agent.orderlist.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class WaimaiAgentOrderlistGetRequest implements
        TaobaoRequest<WaimaiAgentOrderlistGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 结束时间，格式: yyyy-mm-dd hh:mm:ss
     */
    private String endTime;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 页数，默认第一页
     */
    private Long pageNo;

    /**
     * 每页数，最大不超过30
     */
    private Long pageSize;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 开始时间，格式：yyyy-mm-dd hh:mm:ss
     */
    private String startTime;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
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
        return "taobao.waimai.agent.orderlist.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("order_status", this.orderStatus);
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

    public Class<WaimaiAgentOrderlistGetResponse> getResponseClass() {
        return WaimaiAgentOrderlistGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
