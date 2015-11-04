package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentItinerarySendResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.itinerary.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentItinerarySendRequest implements
        TaobaoRequest<TripJipiaoAgentItinerarySendResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 物流公司代码CODE，如不清楚，请找运营提供<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String companyCode;

    /**
     * 邮寄单号，长度不能超过32字节<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String expressCode;

    /**
     * 淘宝系统行程单唯一键
     */
    private Long itineraryId;

    /**
     * 行程单号<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String itineraryNo;

    /**
     * 邮寄日期，格式yyyy-mm-dd
     */
    private String sendDate;

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCode() {
        return this.expressCode;
    }

    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public Long getItineraryId() {
        return this.itineraryId;
    }

    public void setItineraryNo(String itineraryNo) {
        this.itineraryNo = itineraryNo;
    }

    public String getItineraryNo() {
        return this.itineraryNo;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return this.sendDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.itinerary.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("company_code", this.companyCode);
        txtParams.put("express_code", this.expressCode);
        txtParams.put("itinerary_id", this.itineraryId);
        txtParams.put("itinerary_no", this.itineraryNo);
        txtParams.put("send_date", this.sendDate);
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

    public Class<TripJipiaoAgentItinerarySendResponse> getResponseClass() {
        return TripJipiaoAgentItinerarySendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(companyCode, "companyCode");
        RequestCheckUtils.checkMaxLength(companyCode, 20, "companyCode");
        RequestCheckUtils.checkNotEmpty(expressCode, "expressCode");
        RequestCheckUtils.checkMaxLength(expressCode, 32, "expressCode");
        RequestCheckUtils.checkNotEmpty(itineraryId, "itineraryId");
        RequestCheckUtils.checkNotEmpty(itineraryNo, "itineraryNo");
        RequestCheckUtils.checkMaxLength(itineraryNo, 32, "itineraryNo");
        RequestCheckUtils.checkNotEmpty(sendDate, "sendDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
