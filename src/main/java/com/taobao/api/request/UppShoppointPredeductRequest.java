package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UppShoppointPredeductResponse;

/**
 * TOP API: taobao.upp.shoppoint.prededuct request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UppShoppointPredeductRequest implements TaobaoRequest<UppShoppointPredeductResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 业务扩展信息 ，用于ISV描述积分记录的具体业务信息。 禁止含有“:”或“;”或“~”禁用字符 或者淘宝违禁词库中的其他字符。<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String businessInfo;

    /**
     * 处理的店铺积分数量
     */
    private Long pointNum;

    /**
     * 卖家家nick
     */
    private String sellerNick;

    /**
     * 业务发生的时间
     */
    private Date transactionTime;

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public void setPointNum(Long pointNum) {
        this.pointNum = pointNum;
    }

    public Long getPointNum() {
        return this.pointNum;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime() {
        return this.transactionTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.upp.shoppoint.prededuct";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("business_info", this.businessInfo);
        txtParams.put("point_num", this.pointNum);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("transaction_time", this.transactionTime);
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

    public Class<UppShoppointPredeductResponse> getResponseClass() {
        return UppShoppointPredeductResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(businessInfo, "businessInfo");
        RequestCheckUtils.checkMaxLength(businessInfo, 30, "businessInfo");
        RequestCheckUtils.checkNotEmpty(pointNum, "pointNum");
        RequestCheckUtils.checkNotEmpty(sellerNick, "sellerNick");
        RequestCheckUtils.checkNotEmpty(transactionTime, "transactionTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
