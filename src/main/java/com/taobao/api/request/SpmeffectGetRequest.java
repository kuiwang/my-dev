package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpmeffectGetResponse;

/**
 * TOP API: taobao.spmeffect.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class SpmeffectGetRequest implements TaobaoRequest<SpmeffectGetResponse> {

    /**
     * 日期
     */
    private String date;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 查询指定的SPM第四位的效果报表。默认值为false，不传视为不需要
     */
    private Boolean moduleDetail;

    /**
     * 查询指定的SPM第三位的效果报表。默认值为false，不传视为不需要
     */
    private Boolean pageDetail;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(date, "date");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.spmeffect.get";
    }

    public String getDate() {
        return this.date;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getModuleDetail() {
        return this.moduleDetail;
    }

    public Boolean getPageDetail() {
        return this.pageDetail;
    }

    @Override
    public Class<SpmeffectGetResponse> getResponseClass() {
        return SpmeffectGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("date", this.date);
        txtParams.put("module_detail", this.moduleDetail);
        txtParams.put("page_detail", this.pageDetail);
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setModuleDetail(Boolean moduleDetail) {
        this.moduleDetail = moduleDetail;
    }

    public void setPageDetail(Boolean pageDetail) {
        this.pageDetail = pageDetail;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
