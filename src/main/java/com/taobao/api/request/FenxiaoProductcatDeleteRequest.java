package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatDeleteResponse;

/**
 * TOP API: taobao.fenxiao.productcat.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductcatDeleteRequest
        implements TaobaoRequest<FenxiaoProductcatDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品线ID
     */
    private Long productLineId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productLineId, "productLineId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.productcat.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getProductLineId() {
        return this.productLineId;
    }

    @Override
    public Class<FenxiaoProductcatDeleteResponse> getResponseClass() {
        return FenxiaoProductcatDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_line_id", this.productLineId);
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

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
