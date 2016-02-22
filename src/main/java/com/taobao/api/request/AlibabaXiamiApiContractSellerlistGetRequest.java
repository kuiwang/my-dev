package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaXiamiApiContractSellerlistGetResponse;

/**
 * TOP API: alibaba.xiami.api.contract.sellerlist.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class AlibabaXiamiApiContractSellerlistGetRequest
        implements TaobaoRequest<AlibabaXiamiApiContractSellerlistGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 每页数量
     */
    private Long limit;

    /**
     * 当前页
     */
    private Long page;

    /**
     * 结束时间
     */
    private String timeEnd;

    private Long timestamp;

    /**
     * 开始时间
     */
    private String timeStart;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(limit, "limit");
        RequestCheckUtils.checkNotEmpty(page, "page");
        RequestCheckUtils.checkNotEmpty(timeEnd, "timeEnd");
        RequestCheckUtils.checkNotEmpty(timeStart, "timeStart");
    }

    @Override
    public String getApiMethodName() {
        return "alibaba.xiami.api.contract.sellerlist.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getPage() {
        return this.page;
    }

    @Override
    public Class<AlibabaXiamiApiContractSellerlistGetResponse> getResponseClass() {
        return AlibabaXiamiApiContractSellerlistGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("limit", this.limit);
        txtParams.put("page", this.page);
        txtParams.put("time_end", this.timeEnd);
        txtParams.put("time_start", this.timeStart);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTimeStart() {
        return this.timeStart;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }
}
