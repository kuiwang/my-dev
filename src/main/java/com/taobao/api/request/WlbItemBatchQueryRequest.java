package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemBatchQueryResponse;

/**
 * TOP API: taobao.wlb.item.batch.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemBatchQueryRequest implements TaobaoRequest<WlbItemBatchQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 需要查询的商品ID列表，以字符串表示，ID间以;隔开
     */
    private String itemIds;

    /**
     * 分页查询参数，指定查询页数，默认为1
     */
    private Long pageNo;

    /**
     * 分页查询参数，每页查询数量，默认20，最大值50,大于50时按照50条查询
     */
    private Long pageSize;

    /**
     * 仓库编号
     */
    private String storeCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.batch.query";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbItemBatchQueryResponse> getResponseClass() {
        return WlbItemBatchQueryResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_ids", this.itemIds);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("store_code", this.storeCode);
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

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
