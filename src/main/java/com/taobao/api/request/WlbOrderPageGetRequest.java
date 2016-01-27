package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderPageGetResponse;

/**
 * TOP API: taobao.wlb.order.page.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbOrderPageGetRequest implements TaobaoRequest<WlbOrderPageGetResponse> {

    /**
     * 查询截止时间
     */
    private Date endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物流订单编号
     */
    private String orderCode;

    /**
     * 订单状态
     */
    private Long orderStatus;

    /**
     * 订单子类型： （1）OTHER： 其他 （2）TAOBAO_TRADE： 淘宝交易 （3）OTHER_TRADE：其他交易
     * （4）ALLCOATE： 调拨 （5）CHECK: 盘点单 （6）PURCHASE: 采购单
     */
    private String orderSubType;

    /**
     * 订单类型: （1）NORMAL_OUT ：正常出库 （2）NORMAL_IN：正常入库 （3）RETURN_IN：退货入库
     * （4）EXCHANGE_OUT：换货出库
     */
    private String orderType;

    /**
     * 分页的第几页
     */
    private Long pageNo;

    /**
     * 每页多少条
     */
    private Long pageSize;

    /**
     * 查询开始时间
     */
    private Date startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.order.page.get";
    }

    public Date getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderSubType() {
        return this.orderSubType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbOrderPageGetResponse> getResponseClass() {
        return WlbOrderPageGetResponse.class;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_status", this.orderStatus);
        txtParams.put("order_sub_type", this.orderSubType);
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

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
