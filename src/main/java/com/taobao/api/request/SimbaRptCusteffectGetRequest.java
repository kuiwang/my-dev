package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaRptCusteffectGetResponse;

/**
 * TOP API: taobao.simba.rpt.custeffect.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class SimbaRptCusteffectGetRequest implements TaobaoRequest<SimbaRptCusteffectGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 结束时间，格式yyyy-mm-dd
     */
    private String endTime;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 页码<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每页大小<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 数据来源（站内：1，站外：2 ，汇总：SUMMARY）SUMMARY必须单选，其他值可多选例如1,2
     */
    private String source;

    /**
     * 开始时间，格式yyyy-mm-dd
     */
    private String startTime;

    /**
     * 权限校验参数
     */
    private String subwayToken;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setSubwayToken(String subwayToken) {
        this.subwayToken = subwayToken;
    }

    public String getSubwayToken() {
        return this.subwayToken;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.rpt.custeffect.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("nick", this.nick);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("source", this.source);
        txtParams.put("start_time", this.startTime);
        txtParams.put("subway_token", this.subwayToken);
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

    public Class<SimbaRptCusteffectGetResponse> getResponseClass() {
        return SimbaRptCusteffectGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(source, "source");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
        RequestCheckUtils.checkNotEmpty(subwayToken, "subwayToken");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
