package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BaikeDruginfoQueryResponse;

/**
 * TOP API: taobao.baike.druginfo.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:52
 */
public class BaikeDruginfoQueryRequest implements TaobaoRequest<BaikeDruginfoQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 批准文号字段
     */
    private String item;

    /**
     * 用户id，为百科授权的userId
     */
    private Long userId;

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.baike.druginfo.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item", this.item);
        txtParams.put("user_id", this.userId);
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

    public Class<BaikeDruginfoQueryResponse> getResponseClass() {
        return BaikeDruginfoQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(item, "item");
        RequestCheckUtils.checkNotEmpty(userId, "userId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
