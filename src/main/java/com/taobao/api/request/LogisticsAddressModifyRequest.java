package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressModifyResponse;

/**
 * TOP API: taobao.logistics.address.modify request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsAddressModifyRequest implements TaobaoRequest<LogisticsAddressModifyResponse> {

    /**
     * 详细街道地址，不需要重复填写省/市/区
     */
    private String addr;

    /**
     * 默认退货地址。<br>
     * <font color='red'>选择此项(true)，将当前地址设为默认退货地址，撤消原默认退货地址</font>
     */
    private Boolean cancelDef;

    /**
     * 所在市
     */
    private String city;

    /**
     * 地址库ID
     */
    private Long contactId;

    /**
     * 联系人姓名 <font color='red'>长度不可超过20个字节</font>
     */
    private String contactName;

    /**
     * 区、县 <br>
     * <font color='red'>如果所在地区是海外的可以为空，否则为必参</font>
     */
    private String country;

    /**
     * 默认取货地址。<br>
     * <font color='red'>选择此项(true)，将当前地址设为默认取货地址，撤消原默认取货地址</font>
     */
    private Boolean getDef;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 备注,<br>
     * <font color='red'>备注不能超过256字节</font>
     */
    private String memo;

    /**
     * 手机号码，手机与电话必需有一个 <br>
     * <font color='red'>手机号码不能超过20位</font>
     */
    private String mobilePhone;

    /**
     * 电话号码,手机与电话必需有一个
     */
    private String phone;

    /**
     * 所在省
     */
    private String province;

    /**
     * 公司名称, <br>
     * <font color='red'>公司名称长能不能超过20字节</font>
     */
    private String sellerCompany;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 地区邮政编码 <br>
     * <font color='red'>如果所在地区是海外的可以为空，否则为必参</font>
     */
    private String zipCode;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(addr, "addr");
        RequestCheckUtils.checkNotEmpty(city, "city");
        RequestCheckUtils.checkNotEmpty(contactId, "contactId");
        RequestCheckUtils.checkNotEmpty(contactName, "contactName");
        RequestCheckUtils.checkNotEmpty(province, "province");
    }

    public String getAddr() {
        return this.addr;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.address.modify";
    }

    public Boolean getCancelDef() {
        return this.cancelDef;
    }

    public String getCity() {
        return this.city;
    }

    public Long getContactId() {
        return this.contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getCountry() {
        return this.country;
    }

    public Boolean getGetDef() {
        return this.getDef;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getProvince() {
        return this.province;
    }

    @Override
    public Class<LogisticsAddressModifyResponse> getResponseClass() {
        return LogisticsAddressModifyResponse.class;
    }

    public String getSellerCompany() {
        return this.sellerCompany;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("addr", this.addr);
        txtParams.put("cancel_def", this.cancelDef);
        txtParams.put("city", this.city);
        txtParams.put("contact_id", this.contactId);
        txtParams.put("contact_name", this.contactName);
        txtParams.put("country", this.country);
        txtParams.put("get_def", this.getDef);
        txtParams.put("memo", this.memo);
        txtParams.put("mobile_phone", this.mobilePhone);
        txtParams.put("phone", this.phone);
        txtParams.put("province", this.province);
        txtParams.put("seller_company", this.sellerCompany);
        txtParams.put("zip_code", this.zipCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setCancelDef(Boolean cancelDef) {
        this.cancelDef = cancelDef;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGetDef(Boolean getDef) {
        this.getDef = getDef;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
