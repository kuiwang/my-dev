package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeikeSubscinfoGetResponse;

/**
 * TOP API: taobao.weike.subscinfo.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class WeikeSubscinfoGetRequest implements TaobaoRequest<WeikeSubscinfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 时间范围结束时间
     */
    private Date endTime;

    /**
     * 页码
     */
    private Long pageNum;

    /**
     * 商家旺旺名称
     */
    private String sellerName;

    /**
     * 时间范围开始时间
     */
    private Date startTime;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weike.subscinfo.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("page_num", this.pageNum);
        txtParams.put("seller_name", this.sellerName);
        txtParams.put("start_time", this.startTime);
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

    public Class<WeikeSubscinfoGetResponse> getResponseClass() {
        return WeikeSubscinfoGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
