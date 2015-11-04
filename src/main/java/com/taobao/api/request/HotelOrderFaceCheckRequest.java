package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrderFaceCheckResponse;

/**
 * TOP API: taobao.hotel.order.face.check request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelOrderFaceCheckRequest implements TaobaoRequest<HotelOrderFaceCheckResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 核实已入住或者未入住，true：已入住，false：未入住
     */
    private Boolean checked;

    /**
     * 实际入住时间
     */
    private Date checkinDate;

    /**
     * 实际离店时间
     */
    private Date checkoutDate;

    /**
     * 酒店订单id
     */
    private Long oid;

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getChecked() {
        return this.checked;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckinDate() {
        return this.checkinDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getCheckoutDate() {
        return this.checkoutDate;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.order.face.check";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("checked", this.checked);
        txtParams.put("checkin_date", this.checkinDate);
        txtParams.put("checkout_date", this.checkoutDate);
        txtParams.put("oid", this.oid);
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

    public Class<HotelOrderFaceCheckResponse> getResponseClass() {
        return HotelOrderFaceCheckResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(checked, "checked");
        RequestCheckUtils.checkNotEmpty(oid, "oid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
