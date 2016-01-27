package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.XhotelInfoListGetResponse;

/**
 * TOP API: taobao.xhotel.info.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class XhotelInfoListGetRequest implements TaobaoRequest<XhotelInfoListGetResponse> {

    /**
     * 城市code
     */
    private Long cityCode;

    /**
     * 分页参数：当前页数，从1开始计数。 默认值：1
     */
    private Long currentPage;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分页参数：每页酒店数量。最小值1，最大值为50。默认值：20
     */
    private Long pageSize;

    /**
     * pid
     */
    private String pid;

    /**
     * 标准酒店id，如果需要查询单条酒店的信息，需要传入此参数
     */
    private Long shid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cityCode, "cityCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.xhotel.info.list.get";
    }

    public Long getCityCode() {
        return this.cityCode;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getPid() {
        return this.pid;
    }

    @Override
    public Class<XhotelInfoListGetResponse> getResponseClass() {
        return XhotelInfoListGetResponse.class;
    }

    public Long getShid() {
        return this.shid;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("city_code", this.cityCode);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("pid", this.pid);
        txtParams.put("shid", this.shid);
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

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
