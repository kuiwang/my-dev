package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.XhotelPriceInfoGetResponse;

/**
 * TOP API: taobao.xhotel.price.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class XhotelPriceInfoGetRequest implements TaobaoRequest<XhotelPriceInfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 结束日期，默认值为当前时间加4天,结束日期最多是当前时间加28天
     */
    private Date endDate;

    /**
     * pid
     */
    private String pid;

    /**
     * 标准酒店id和城市编码拼接字符串，最多50个
     */
    private String shidCityCode;

    /**
     * 开始时间，默认值为当前时间加3天,开始时间最多是当前时间加28天
     */
    private Date startDate;

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return this.pid;
    }

    public void setShidCityCode(String shidCityCode) {
        this.shidCityCode = shidCityCode;
    }

    public String getShidCityCode() {
        return this.shidCityCode;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.xhotel.price.info.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("pid", this.pid);
        txtParams.put("shid_city_code", this.shidCityCode);
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

    public Class<XhotelPriceInfoGetResponse> getResponseClass() {
        return XhotelPriceInfoGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(shidCityCode, "shidCityCode");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
