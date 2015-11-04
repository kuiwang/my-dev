package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateExplainAddResponse;

/**
 * TOP API: taobao.traderate.explain.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TraderateExplainAddRequest implements TaobaoRequest<TraderateExplainAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 子订单ID
     */
    private Long oid;

    /**
     * 评价解释内容,最大长度: 500个汉字
     */
    private String reply;

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return this.reply;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.traderate.explain.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("reply", this.reply);
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

    public Class<TraderateExplainAddResponse> getResponseClass() {
        return TraderateExplainAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(oid, "oid");
        RequestCheckUtils.checkNotEmpty(reply, "reply");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
