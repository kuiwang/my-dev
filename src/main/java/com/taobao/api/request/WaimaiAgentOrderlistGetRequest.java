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
public class WaimaiAgentOrderlistGetRequest
        implements TaobaoRequest<WaimaiAgentOrderlistGetResponse> {

    /**
     * 结束时间，格式: yyyy-mm-dd hh:mm:ss
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.agent.orderlist.get";
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WaimaiAgentOrderlistGetResponse> getResponseClass() {
        return WaimaiAgentOrderlistGetResponse.class;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    @Override
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

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
