package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RpRefundsAgreeResponse;

/**
 * TOP API: taobao.rp.refunds.agree request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RpRefundsAgreeRequest implements TaobaoRequest<RpRefundsAgreeResponse> {

    /**
     * 短信验证码，如果退款金额达到一定的数量，后端会返回调用失败，并同时往卖家的手机发送一条短信验证码。
     * 接下来用收到的短信验证码再次发起API调用即可完成退款操作。
     */
    private String code;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 退款信息，格式：refund_id|amount|version|phase，其中refund_id为退款编号，amount为退款金额（
     * 以分为单位），version为退款最后更新时间（时间戳格式），phase为退款阶段（可选值为：onsale,
     * aftersale，天猫退款必值，淘宝退款不需要传），多个退款以半角逗号分隔。
     */
    private String refundInfos;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(refundInfos, "refundInfos");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.rp.refunds.agree";
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getRefundInfos() {
        return this.refundInfos;
    }

    @Override
    public Class<RpRefundsAgreeResponse> getResponseClass() {
        return RpRefundsAgreeResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("code", this.code);
        txtParams.put("refund_infos", this.refundInfos);
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setRefundInfos(String refundInfos) {
        this.refundInfos = refundInfos;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
