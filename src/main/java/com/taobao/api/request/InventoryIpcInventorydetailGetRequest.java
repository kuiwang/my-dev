package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryIpcInventorydetailGetResponse;

/**
 * TOP API: taobao.inventory.ipc.inventorydetail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class InventoryIpcInventorydetailGetRequest implements
        TaobaoRequest<InventoryIpcInventorydetailGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 主订单号，可选<br />
     * 支持最小值为：0
     */
    private Long bizOrderId;

    /**
     * 子订单号，可选<br />
     * 支持最小值为：0
     */
    private Long bizSubOrderId;

    /**
     * 当前页数<br />
     * 支持最小值为：0
     */
    private Long pageIndex;

    /**
     * 一页显示多少条
     */
    private Long pageSize;

    /**
     * 仓储商品id
     */
    private Long scItemId;

    /**
     * 1:查询预扣 4：查询占用<br />
     * 支持最小值为：1
     */
    private Long statusQuery;

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizSubOrderId(Long bizSubOrderId) {
        this.bizSubOrderId = bizSubOrderId;
    }

    public Long getBizSubOrderId() {
        return this.bizSubOrderId;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setStatusQuery(Long statusQuery) {
        this.statusQuery = statusQuery;
    }

    public Long getStatusQuery() {
        return this.statusQuery;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.inventory.ipc.inventorydetail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_order_id", this.bizOrderId);
        txtParams.put("biz_sub_order_id", this.bizSubOrderId);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("status_query", this.statusQuery);
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

    public Class<InventoryIpcInventorydetailGetResponse> getResponseClass() {
        return InventoryIpcInventorydetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(bizOrderId, 0L, "bizOrderId");
        RequestCheckUtils.checkMinValue(bizSubOrderId, 0L, "bizSubOrderId");
        RequestCheckUtils.checkNotEmpty(pageIndex, "pageIndex");
        RequestCheckUtils.checkMinValue(pageIndex, 0L, "pageIndex");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(scItemId, "scItemId");
        RequestCheckUtils.checkNotEmpty(statusQuery, "statusQuery");
        RequestCheckUtils.checkMinValue(statusQuery, 1L, "statusQuery");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
