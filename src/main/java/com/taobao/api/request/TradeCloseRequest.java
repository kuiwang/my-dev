package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeCloseResponse;

/**
 * TOP API: taobao.trade.close request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeCloseRequest implements TaobaoRequest<TradeCloseResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 交易关闭原因。可以选择的理由有： 1.未及时付款 2.买家联系不上 3.谢绝还价 4.商品瑕疵 5.协商不一致 6.买家不想买
     * 7.与买家协商一致
     */
    private String closeReason;

    /**
     * 主订单或子订单编号。
     */
    private Long tid;

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.close";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("close_reason", this.closeReason);
        txtParams.put("tid", this.tid);
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

    public Class<TradeCloseResponse> getResponseClass() {
        return TradeCloseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(closeReason, "closeReason");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
