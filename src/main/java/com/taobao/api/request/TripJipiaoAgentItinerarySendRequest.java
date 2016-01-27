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

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
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

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.itinerary.send";
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public String getExpressCode() {
        return this.expressCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItineraryId() {
        return this.itineraryId;
    }

    public String getItineraryNo() {
        return this.itineraryNo;
    }

    @Override
    public Class<TripJipiaoAgentItinerarySendResponse> getResponseClass() {
        return TripJipiaoAgentItinerarySendResponse.class;
    }

    public String getSendDate() {
        return this.sendDate;
    }

    @Override
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

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public void setItineraryNo(String itineraryNo) {
        this.itineraryNo = itineraryNo;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
