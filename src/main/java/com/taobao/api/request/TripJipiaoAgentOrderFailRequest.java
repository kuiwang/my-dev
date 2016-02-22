package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentOrderFailResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.fail request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentOrderFailRequest
        implements TaobaoRequest<TripJipiaoAgentOrderFailResponse> {

    /**
     * 失败类型为0，说明备注原因<br />
     * 支持最大长度为：200<br />
     * 支持的最大列表长度为：200
     */
    private String failMemo;

    /**
     * 失败原因：1．客户要求失败订单；2．此舱位已售完（经济舱或特舱）；3．剩余座位少于用户购买数量；4．特价管理里录入的特价票已经售完；5．
     * 假舱（请及时通过旺旺或者电话反馈给淘宝工作人员）；0．其它（请在备注中说明原因）
     */
    private Long failType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 国内机票订单id
     */
    private Long orderId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(failMemo, 200, "failMemo");
        RequestCheckUtils.checkNotEmpty(failType, "failType");
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.fail";
    }

    public String getFailMemo() {
        return this.failMemo;
    }

    public Long getFailType() {
        return this.failType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    @Override
    public Class<TripJipiaoAgentOrderFailResponse> getResponseClass() {
        return TripJipiaoAgentOrderFailResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fail_memo", this.failMemo);
        txtParams.put("fail_type", this.failType);
        txtParams.put("order_id", this.orderId);
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

    public void setFailMemo(String failMemo) {
        this.failMemo = failMemo;
    }

    public void setFailType(Long failType) {
        this.failType = failType;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
