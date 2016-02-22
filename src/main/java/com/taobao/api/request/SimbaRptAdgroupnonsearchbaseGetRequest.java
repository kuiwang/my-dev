package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaRptAdgroupnonsearchbaseGetResponse;

/**
 * TOP API: taobao.simba.rpt.adgroupnonsearchbase.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:21
 */
public class SimbaRptAdgroupnonsearchbaseGetRequest
        implements TaobaoRequest<SimbaRptAdgroupnonsearchbaseGetResponse> {

    /**
     * 推广组id
     */
    private Long adgroupId;

    /**
     * 推广计划id
     */
    private Long campaignId;

    /**
     * 结束时间,格式为：yyyy-mm-dd
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 昵称
     */
    private String nick;

    /**
     * 页码
     */
    private Long pageNo;

    /**
     * 每页大小
     */
    private Long pageSize;

    /**
     * 开始时间,格式为：yyyy-mm-dd
     */
    private String startTime;

    /**
     * 权限校验参数
     */
    private String subwayToken;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
        RequestCheckUtils.checkNotEmpty(subwayToken, "subwayToken");
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.rpt.adgroupnonsearchbase.get";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<SimbaRptAdgroupnonsearchbaseGetResponse> getResponseClass() {
        return SimbaRptAdgroupnonsearchbaseGetResponse.class;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getSubwayToken() {
        return this.subwayToken;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("end_time", this.endTime);
        txtParams.put("nick", this.nick);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
        txtParams.put("subway_token", this.subwayToken);
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

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setSubwayToken(String subwayToken) {
        this.subwayToken = subwayToken;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
