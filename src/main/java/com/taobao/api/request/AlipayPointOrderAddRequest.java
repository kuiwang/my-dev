package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayPointOrderAddResponse;

/**
 * TOP API: alipay.point.order.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayPointOrderAddRequest implements TaobaoRequest<AlipayPointOrderAddResponse> {

    /**
     * 支付宝用户给应用发放集分宝的授权。
     */
    private String authToken;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 向用户展示集分宝发放备注
     */
    private String memo;

    /**
     * isv提供的发放号订单号，由数字和组成，最大长度为32为，需要保证每笔发放的唯一性，支付宝会对该参数做唯一性控制。如果使用同样的订单号，
     * 支付宝将返回订单号已经存在的错误
     */
    private String merchantOrderNo;

    /**
     * 发放集分宝时间
     */
    private Date orderTime;

    /**
     * 发放集分宝的数量
     */
    private Long pointCount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
     */
    private String userSymbol;

    /**
     * 用户标识符类型，现在支持ALIPAY_USER_ID:表示支付宝用户ID,ALIPAY_LOGON_ID:表示支付宝登陆号
     */
    private String userSymbolType;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(memo, "memo");
        RequestCheckUtils.checkNotEmpty(merchantOrderNo, "merchantOrderNo");
        RequestCheckUtils.checkNotEmpty(orderTime, "orderTime");
        RequestCheckUtils.checkNotEmpty(pointCount, "pointCount");
        RequestCheckUtils.checkNotEmpty(userSymbol, "userSymbol");
        RequestCheckUtils.checkNotEmpty(userSymbolType, "userSymbolType");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.point.order.add";
    }

    public String getAuthToken() {
        return this.authToken;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public Date getOrderTime() {
        return this.orderTime;
    }

    public Long getPointCount() {
        return this.pointCount;
    }

    @Override
    public Class<AlipayPointOrderAddResponse> getResponseClass() {
        return AlipayPointOrderAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_token", this.authToken);
        txtParams.put("memo", this.memo);
        txtParams.put("merchant_order_no", this.merchantOrderNo);
        txtParams.put("order_time", this.orderTime);
        txtParams.put("point_count", this.pointCount);
        txtParams.put("user_symbol", this.userSymbol);
        txtParams.put("user_symbol_type", this.userSymbolType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUserSymbol() {
        return this.userSymbol;
    }

    public String getUserSymbolType() {
        return this.userSymbolType;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void setPointCount(Long pointCount) {
        this.pointCount = pointCount;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserSymbol(String userSymbol) {
        this.userSymbol = userSymbol;
    }

    public void setUserSymbolType(String userSymbolType) {
        this.userSymbolType = userSymbolType;
    }
}
