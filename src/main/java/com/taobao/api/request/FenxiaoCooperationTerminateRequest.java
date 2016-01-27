package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationTerminateResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.terminate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoCooperationTerminateRequest implements
        TaobaoRequest<FenxiaoCooperationTerminateResponse> {

    /**
     * 合作编号
     */
    private Long cooperateId;

    /**
     * 终止天数，可选1,2,3,5,7,15，在多少天数内终止
     */
    private Long endRemainDays;

    /**
     * 终止说明（5-2000字）<br />
     * 支持最大长度为：2000<br />
     * 支持的最大列表长度为：2000
     */
    private String endRemark;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cooperateId, "cooperateId");
        RequestCheckUtils.checkNotEmpty(endRemainDays, "endRemainDays");
        RequestCheckUtils.checkNotEmpty(endRemark, "endRemark");
        RequestCheckUtils.checkMaxLength(endRemark, 2000, "endRemark");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.terminate";
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public Long getEndRemainDays() {
        return this.endRemainDays;
    }

    public String getEndRemark() {
        return this.endRemark;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<FenxiaoCooperationTerminateResponse> getResponseClass() {
        return FenxiaoCooperationTerminateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cooperate_id", this.cooperateId);
        txtParams.put("end_remain_days", this.endRemainDays);
        txtParams.put("end_remark", this.endRemark);
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

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
    }

    public void setEndRemainDays(Long endRemainDays) {
        this.endRemainDays = endRemainDays;
    }

    public void setEndRemark(String endRemark) {
        this.endRemark = endRemark;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
