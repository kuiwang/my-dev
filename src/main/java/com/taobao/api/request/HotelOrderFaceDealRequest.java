package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrderFaceDealResponse;

/**
 * TOP API: taobao.hotel.order.face.deal request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelOrderFaceDealRequest implements TaobaoRequest<HotelOrderFaceDealResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店订单oid
     */
    private Long oid;

    /**
     * 操作类型，1：确认预订，2：取消订单<br />
     * 支持最大长度为：1<br />
     * 支持的最大列表长度为：1
     */
    private String operType;

    /**
     * 取消订单时的取消原因备注信息<br />
     * 支持最大长度为：500<br />
     * 支持的最大列表长度为：500
     */
    private String reasonText;

    /**
     * 取消订单时的取消原因，可选值：1,2,3,4； 1：无房，2：价格变动，3：买家原因，4：其它原因<br />
     * 支持最大长度为：1<br />
     * 支持的最大列表长度为：1
     */
    private String reasonType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(oid, "oid");
        RequestCheckUtils.checkNotEmpty(operType, "operType");
        RequestCheckUtils.checkMaxLength(operType, 1, "operType");
        RequestCheckUtils.checkMaxLength(reasonText, 500, "reasonText");
        RequestCheckUtils.checkMaxLength(reasonType, 1, "reasonType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.order.face.deal";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOid() {
        return this.oid;
    }

    public String getOperType() {
        return this.operType;
    }

    public String getReasonText() {
        return this.reasonText;
    }

    public String getReasonType() {
        return this.reasonType;
    }

    @Override
    public Class<HotelOrderFaceDealResponse> getResponseClass() {
        return HotelOrderFaceDealResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("oper_type", this.operType);
        txtParams.put("reason_text", this.reasonText);
        txtParams.put("reason_type", this.reasonType);
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

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public void setReasonText(String reasonText) {
        this.reasonText = reasonText;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
