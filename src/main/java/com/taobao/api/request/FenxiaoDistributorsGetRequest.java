package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorsGetResponse;

/**
 * TOP API: taobao.fenxiao.distributors.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDistributorsGetRequest
        implements TaobaoRequest<FenxiaoDistributorsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分销商用户名列表。多个之间以“,”分隔;最多支持50个分销商用户名。
     */
    private String nicks;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nicks, "nicks");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.distributors.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNicks() {
        return this.nicks;
    }

    @Override
    public Class<FenxiaoDistributorsGetResponse> getResponseClass() {
        return FenxiaoDistributorsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nicks", this.nicks);
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

    public void setNicks(String nicks) {
        this.nicks = nicks;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
