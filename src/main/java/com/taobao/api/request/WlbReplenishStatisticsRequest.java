package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbReplenishStatisticsResponse;

/**
 * TOP API: taobao.wlb.replenish.statistics request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbReplenishStatisticsRequest implements TaobaoRequest<WlbReplenishStatisticsResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品编码
     */
    private String itemCode;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 分页参数，默认第一页
     */
    private Long pageNo;

    /**
     * 分页每页页数，默认20，最大50<br />
     * 支持最大值为：50
     */
    private Long pageSize;

    /**
     * 仓库编码
     */
    private String storeCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.replenish.statistics";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public String getName() {
        return this.name;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbReplenishStatisticsResponse> getResponseClass() {
        return WlbReplenishStatisticsResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_code", this.itemCode);
        txtParams.put("name", this.name);
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

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setName(String name) {
        this.name = name;
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
