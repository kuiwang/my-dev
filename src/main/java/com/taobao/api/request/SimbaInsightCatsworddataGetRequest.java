package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsworddataGetResponse;

/**
 * TOP API: taobao.simba.insight.catsworddata.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsworddataGetRequest implements
        TaobaoRequest<SimbaInsightCatsworddataGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要查询的关键词列表
     */
    private String bidwordList;

    /**
     * 类目id
     */
    private String catId;

    /**
     * 结束时间，格式只能为：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 开始时间，格式只能为：yyyy-MM-dd
     */
    private String startDate;

    public void setBidwordList(String bidwordList) {
        this.bidwordList = bidwordList;
    }

    public String getBidwordList() {
        return this.bidwordList;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatId() {
        return this.catId;
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
        return "taobao.simba.insight.catsworddata.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword_list", this.bidwordList);
        txtParams.put("cat_id", this.catId);
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

    public Class<SimbaInsightCatsworddataGetResponse> getResponseClass() {
        return SimbaInsightCatsworddataGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordList, "bidwordList");
        RequestCheckUtils.checkMaxListSize(bidwordList, 5, "bidwordList");
        RequestCheckUtils.checkNotEmpty(catId, "catId");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
