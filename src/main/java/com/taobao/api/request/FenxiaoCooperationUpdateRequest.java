package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationUpdateResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoCooperationUpdateRequest implements
        TaobaoRequest<FenxiaoCooperationUpdateResponse> {

    /**
     * 分销商ID
     */
    private Long distributorId;

    /**
     * 等级ID(0代表取消)
     */
    private Long gradeId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 分销方式(新增)： AGENT(代销)、DEALER(经销)(默认为代销)
     */
    private String tradeType;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(distributorId, "distributorId");
        RequestCheckUtils.checkNotEmpty(gradeId, "gradeId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.update";
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<FenxiaoCooperationUpdateResponse> getResponseClass() {
        return FenxiaoCooperationUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_id", this.distributorId);
        txtParams.put("grade_id", this.gradeId);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
