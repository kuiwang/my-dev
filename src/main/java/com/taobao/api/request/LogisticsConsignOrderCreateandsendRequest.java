package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsConsignOrderCreateandsendResponse;

/**
 * TOP API: taobao.logistics.consign.order.createandsend request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsConsignOrderCreateandsendRequest
        implements TaobaoRequest<LogisticsConsignOrderCreateandsendResponse> {

    /**
     * 物流公司ID
     */
    private Long companyId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物品的json数据。
     */
    private String itemJsonString;

    /**
     * 物流订单物流类型，值固定选择：2
     */
    private Long logisType;

    /**
     * 运单号
     */
    private String mailNo;

    /**
     * 订单来源，值选择：30
     */
    private Long orderSource;

    /**
     * 订单类型，值固定选择：30
     */
    private Long orderType;

    /**
     * 收件人街道地址
     */
    private String rAddress;

    /**
     * 收件人区域ID
     */
    private Long rAreaId;

    /**
     * 市
     */
    private String rCityName;

    /**
     * 区
     */
    private String rDistName;

    /**
     * 手机号码
     */
    private String rMobilePhone;

    /**
     * 收件人名称
     */
    private String rName;

    /**
     * 省
     */
    private String rProvName;

    /**
     * 电话号码
     */
    private String rTelephone;

    /**
     * 收件人邮编
     */
    private String rZipCode;

    /**
     * 发件人街道地址
     */
    private String sAddress;

    /**
     * 发件人区域ID
     */
    private Long sAreaId;

    /**
     * 市
     */
    private String sCityName;

    /**
     * 区
     */
    private String sDistName;

    /**
     * 费用承担方式 1买家承担运费 2卖家承担运费
     */
    private String shipping;

    /**
     * 手机号码
     */
    private String sMobilePhone;

    /**
     * 发件人名称
     */
    private String sName;

    /**
     * 省
     */
    private String sProvName;

    /**
     * 电话号码
     */
    private String sTelephone;

    /**
     * 发件人出编
     */
    private String sZipCode;

    private Long timestamp;

    /**
     * 交易流水号，淘外订单号或者商家内部交易流水号
     */
    private Long tradeId;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 用户ID
     */
    private Long userId;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(companyId, "companyId");
        RequestCheckUtils.checkNotEmpty(itemJsonString, "itemJsonString");
        RequestCheckUtils.checkNotEmpty(logisType, "logisType");
        RequestCheckUtils.checkNotEmpty(orderSource, "orderSource");
        RequestCheckUtils.checkNotEmpty(orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(rAddress, "rAddress");
        RequestCheckUtils.checkNotEmpty(rAreaId, "rAreaId");
        RequestCheckUtils.checkNotEmpty(rCityName, "rCityName");
        RequestCheckUtils.checkNotEmpty(rName, "rName");
        RequestCheckUtils.checkNotEmpty(rProvName, "rProvName");
        RequestCheckUtils.checkNotEmpty(rZipCode, "rZipCode");
        RequestCheckUtils.checkNotEmpty(sAddress, "sAddress");
        RequestCheckUtils.checkNotEmpty(sAreaId, "sAreaId");
        RequestCheckUtils.checkNotEmpty(sCityName, "sCityName");
        RequestCheckUtils.checkNotEmpty(sName, "sName");
        RequestCheckUtils.checkNotEmpty(sProvName, "sProvName");
        RequestCheckUtils.checkNotEmpty(sZipCode, "sZipCode");
        RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
        RequestCheckUtils.checkNotEmpty(userId, "userId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.consign.order.createandsend";
    }

    public Long getCompanyId() {
        return this.companyId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemJsonString() {
        return this.itemJsonString;
    }

    public Long getLogisType() {
        return this.logisType;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public Long getOrderSource() {
        return this.orderSource;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public String getrAddress() {
        return this.rAddress;
    }

    public Long getrAreaId() {
        return this.rAreaId;
    }

    public String getrCityName() {
        return this.rCityName;
    }

    public String getrDistName() {
        return this.rDistName;
    }

    @Override
    public Class<LogisticsConsignOrderCreateandsendResponse> getResponseClass() {
        return LogisticsConsignOrderCreateandsendResponse.class;
    }

    public String getrMobilePhone() {
        return this.rMobilePhone;
    }

    public String getrName() {
        return this.rName;
    }

    public String getrProvName() {
        return this.rProvName;
    }

    public String getrTelephone() {
        return this.rTelephone;
    }

    public String getrZipCode() {
        return this.rZipCode;
    }

    public String getsAddress() {
        return this.sAddress;
    }

    public Long getsAreaId() {
        return this.sAreaId;
    }

    public String getsCityName() {
        return this.sCityName;
    }

    public String getsDistName() {
        return this.sDistName;
    }

    public String getShipping() {
        return this.shipping;
    }

    public String getsMobilePhone() {
        return this.sMobilePhone;
    }

    public String getsName() {
        return this.sName;
    }

    public String getsProvName() {
        return this.sProvName;
    }

    public String getsTelephone() {
        return this.sTelephone;
    }

    public String getsZipCode() {
        return this.sZipCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("company_id", this.companyId);
        txtParams.put("item_json_string", this.itemJsonString);
        txtParams.put("logis_type", this.logisType);
        txtParams.put("mail_no", this.mailNo);
        txtParams.put("order_source", this.orderSource);
        txtParams.put("order_type", this.orderType);
        txtParams.put("r_address", this.rAddress);
        txtParams.put("r_area_id", this.rAreaId);
        txtParams.put("r_city_name", this.rCityName);
        txtParams.put("r_dist_name", this.rDistName);
        txtParams.put("r_mobile_phone", this.rMobilePhone);
        txtParams.put("r_name", this.rName);
        txtParams.put("r_prov_name", this.rProvName);
        txtParams.put("r_telephone", this.rTelephone);
        txtParams.put("r_zip_code", this.rZipCode);
        txtParams.put("s_address", this.sAddress);
        txtParams.put("s_area_id", this.sAreaId);
        txtParams.put("s_city_name", this.sCityName);
        txtParams.put("s_dist_name", this.sDistName);
        txtParams.put("s_mobile_phone", this.sMobilePhone);
        txtParams.put("s_name", this.sName);
        txtParams.put("s_prov_name", this.sProvName);
        txtParams.put("s_telephone", this.sTelephone);
        txtParams.put("s_zip_code", this.sZipCode);
        txtParams.put("shipping", this.shipping);
        txtParams.put("trade_id", this.tradeId);
        txtParams.put("user_id", this.userId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    public Long getUserId() {
        return this.userId;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setItemJsonString(String itemJsonString) {
        this.itemJsonString = itemJsonString;
    }

    public void setLogisType(Long logisType) {
        this.logisType = logisType;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public void setOrderSource(Long orderSource) {
        this.orderSource = orderSource;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public void setrAreaId(Long rAreaId) {
        this.rAreaId = rAreaId;
    }

    public void setrCityName(String rCityName) {
        this.rCityName = rCityName;
    }

    public void setrDistName(String rDistName) {
        this.rDistName = rDistName;
    }

    public void setrMobilePhone(String rMobilePhone) {
        this.rMobilePhone = rMobilePhone;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setrProvName(String rProvName) {
        this.rProvName = rProvName;
    }

    public void setrTelephone(String rTelephone) {
        this.rTelephone = rTelephone;
    }

    public void setrZipCode(String rZipCode) {
        this.rZipCode = rZipCode;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public void setsAreaId(Long sAreaId) {
        this.sAreaId = sAreaId;
    }

    public void setsCityName(String sCityName) {
        this.sCityName = sCityName;
    }

    public void setsDistName(String sDistName) {
        this.sDistName = sDistName;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public void setsMobilePhone(String sMobilePhone) {
        this.sMobilePhone = sMobilePhone;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsProvName(String sProvName) {
        this.sProvName = sProvName;
    }

    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone;
    }

    public void setsZipCode(String sZipCode) {
        this.sZipCode = sZipCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
