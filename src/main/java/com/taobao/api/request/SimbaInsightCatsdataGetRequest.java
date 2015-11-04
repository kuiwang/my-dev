package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsdataGetResponse;

/**
 * TOP API: taobao.simba.insight.catsdata.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsdataGetRequest implements
        TaobaoRequest<SimbaInsightCatsdataGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 表示要查询的类目id
     */
    private String categoryIdList;

    /**
     * 查询截止时间，格式：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 开始时间，格式：yyyy-MM-dd
     */
    private String startDate;

    public void setCategoryIdList(String categoryIdList) {
        this.categoryIdList = categoryIdList;
    }

    public String getCategoryIdList() {
        return this.categoryIdList;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
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
        return "taobao.simba.insight.catsdata.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id_list", this.categoryIdList);
        txtParams.put("end_date", this.endDate);
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

    public Class<SimbaInsightCatsdataGetResponse> getResponseClass() {
        return SimbaInsightCatsdataGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryIdList, "categoryIdList");
        RequestCheckUtils.checkMaxListSize(categoryIdList, 5, "categoryIdList");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
