package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatstopwordnewGetResponse;

/**
 * TOP API: taobao.simba.insight.catstopwordnew.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatstopwordnewGetRequest implements
        TaobaoRequest<SimbaInsightCatstopwordnewGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 类目id
     */
    private String catId;

    /**
     * 表示查询的维度，比如选择click，则查询该类目下点击量最大的词，可供选择的值有：impression, click, cost,
     * ctr, cpc, coverage, transactiontotal, transactionshippingtotal,
     * favtotal, roi
     */
    private String dimension;

    /**
     * 查询截止时间，格式只能是：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 返回前多少条数据<br />
     * 支持最大值为：20<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 查询开始时间，格式必须为：yyyy-MM-dd
     */
    private String startDate;

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatId() {
        return this.catId;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.catstopwordnew.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("dimension", this.dimension);
        txtParams.put("end_date", this.endDate);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_date", this.startDate);
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

    public Class<SimbaInsightCatstopwordnewGetResponse> getResponseClass() {
        return SimbaInsightCatstopwordnewGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(catId, "catId");
        RequestCheckUtils.checkNotEmpty(dimension, "dimension");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
