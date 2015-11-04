package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemMapBatchQueryResponse;

/**
 * TOP API: taobao.scitem.map.batch.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ScitemMapBatchQueryRequest implements TaobaoRequest<ScitemMapBatchQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 后端商品的商家编码
     */
    private String outerCode;

    /**
     * 当前页码数
     */
    private Long pageIndex;

    /**
     * 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
     */
    private Long pageSize;

    /**
     * 后端商品id
     */
    private Long scItemId;

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
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

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.scitem.map.batch.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("sc_item_id", this.scItemId);
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

    public Class<ScitemMapBatchQueryResponse> getResponseClass() {
        return ScitemMapBatchQueryResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
