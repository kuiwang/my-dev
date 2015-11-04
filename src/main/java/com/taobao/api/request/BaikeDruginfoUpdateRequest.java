package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BaikeDruginfoUpdateResponse;

/**
 * TOP API: taobao.baike.druginfo.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:52
 */
public class BaikeDruginfoUpdateRequest implements TaobaoRequest<BaikeDruginfoUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * map的json格式用户传入更新数据
     */
    private String jsondata;

    /**
     * 用户id
     */
    private Long userId;

    public void setJsondata(String jsondata) {
        this.jsondata = jsondata;
    }

    public String getJsondata() {
        return this.jsondata;
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
        return "taobao.baike.druginfo.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("jsondata", this.jsondata);
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

    public Class<BaikeDruginfoUpdateResponse> getResponseClass() {
        return BaikeDruginfoUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(jsondata, "jsondata");
        RequestCheckUtils.checkNotEmpty(userId, "userId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
