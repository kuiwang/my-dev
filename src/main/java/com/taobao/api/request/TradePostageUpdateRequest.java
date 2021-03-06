package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradePostageUpdateResponse;

/**
 * TOP API: taobao.trade.postage.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradePostageUpdateRequest implements TaobaoRequest<TradePostageUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 邮费价格(邮费单位是元）
     */
    private String postFee;

    /**
     * 主订单编号
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(postFee, "postFee");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.postage.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPostFee() {
        return this.postFee;
    }

    @Override
    public Class<TradePostageUpdateResponse> getResponseClass() {
        return TradePostageUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("post_fee", this.postFee);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
        return this.tid;
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

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
