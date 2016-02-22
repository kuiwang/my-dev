package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupidsChangedGetResponse;

/**
 * TOP API: taobao.simba.adgroupids.changed.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupidsChangedGetRequest
        implements TaobaoRequest<SimbaAdgroupidsChangedGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 返回的第几页数据，默认为1<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 返回的每页数据量大小,默认200最大1000<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 得到此时间点之后的数据，不能大于一个月
     */
    private Date startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(pageSize, 1000L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroupids.changed.get";
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
    public Class<SimbaAdgroupidsChangedGetResponse> getResponseClass() {
        return SimbaAdgroupidsChangedGetResponse.class;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
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

    public void setNick(String nick) {
        this.nick = nick;
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
