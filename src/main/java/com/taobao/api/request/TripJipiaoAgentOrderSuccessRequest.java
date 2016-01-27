package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentOrderSuccessResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.success request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentOrderSuccessRequest implements
        TaobaoRequest<TripJipiaoAgentOrderSuccessResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 淘宝系统订单id
     */
    private Long orderId;

    /**
     * 成功订单参数：列表元素结构为——旧乘机人姓名;新乘机人姓名;pnr;票号
     * (以分号进行分隔)。说明：有时用户输入的乘机人姓名输入错误或者有生僻字
     * ，代理商必须输入新的名字以保证验真通过；即旧乘机人姓名和新乘机人姓名不需要变化时可以相同
     */
    private String successInfo;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(successInfo, "successInfo");
        RequestCheckUtils.checkMaxListSize(successInfo, 9, "successInfo");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.success";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    @Override
    public Class<TripJipiaoAgentOrderSuccessResponse> getResponseClass() {
        return TripJipiaoAgentOrderSuccessResponse.class;
    }

    public String getSuccessInfo() {
        return this.successInfo;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        txtParams.put("success_info", this.successInfo);
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

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setSuccessInfo(String successInfo) {
        this.successInfo = successInfo;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
