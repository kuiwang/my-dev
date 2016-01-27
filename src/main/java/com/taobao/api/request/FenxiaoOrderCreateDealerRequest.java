package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderCreateDealerResponse;

/**
 * TOP API: taobao.fenxiao.order.create.dealer request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoOrderCreateDealerRequest implements
        TaobaoRequest<FenxiaoOrderCreateDealerResponse> {

    /**
     * 街道
     */
    private String addr;

    /**
     * 买家姓名<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String buyerName;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String country;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 运费，单位为分
     */
    private Long logisticFee;

    /**
     * 运输方式，快递,平邮等
     */
    private String logisticType;

    /**
     * 留言<br />
     * 支持最大长度为：200<br />
     * 支持的最大列表长度为：200
     */
    private String message;

    /**
     * 买家手机号码和电话号码两者中必须有一个
     */
    private String mobilePhone;

    /**
     * erp主订单号，用于去重。当传入号已存在将返回原来的采购单
     */
    private Long outerId;

    /**
     * 支付类型,需要供应支持该支付类型
     */
    private String payType;

    /**
     * 买家电话号码
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 子单信息,子单内部以‘,’隔开，多个子单以‘;’隔开.
     * 例(分销产品id,skuid,购买数量,单价;分销产品id:,skuid,购买数量,单价) 单价的单位位分
     */
    private String subOrderDetail;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 邮编
     */
    private String zipCode;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(addr, "addr");
        RequestCheckUtils.checkNotEmpty(buyerName, "buyerName");
        RequestCheckUtils.checkMaxLength(buyerName, 20, "buyerName");
        RequestCheckUtils.checkNotEmpty(logisticFee, "logisticFee");
        RequestCheckUtils.checkNotEmpty(logisticType, "logisticType");
        RequestCheckUtils.checkMaxLength(message, 200, "message");
        RequestCheckUtils.checkNotEmpty(outerId, "outerId");
        RequestCheckUtils.checkNotEmpty(payType, "payType");
        RequestCheckUtils.checkNotEmpty(province, "province");
        RequestCheckUtils.checkNotEmpty(subOrderDetail, "subOrderDetail");
    }

    public String getAddr() {
        return this.addr;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.order.create.dealer";
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLogisticFee() {
        return this.logisticFee;
    }

    public String getLogisticType() {
        return this.logisticType;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public Long getOuterId() {
        return this.outerId;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getProvince() {
        return this.province;
    }

    @Override
    public Class<FenxiaoOrderCreateDealerResponse> getResponseClass() {
        return FenxiaoOrderCreateDealerResponse.class;
    }

    public String getSubOrderDetail() {
        return this.subOrderDetail;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("addr", this.addr);
        txtParams.put("buyer_name", this.buyerName);
        txtParams.put("city", this.city);
        txtParams.put("country", this.country);
        txtParams.put("logistic_fee", this.logisticFee);
        txtParams.put("logistic_type", this.logisticType);
        txtParams.put("message", this.message);
        txtParams.put("mobile_phone", this.mobilePhone);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("pay_type", this.payType);
        txtParams.put("phone", this.phone);
        txtParams.put("province", this.province);
        txtParams.put("sub_order_detail", this.subOrderDetail);
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

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLogisticFee(Long logisticFee) {
        this.logisticFee = logisticFee;
    }

    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSubOrderDetail(String subOrderDetail) {
        this.subOrderDetail = subOrderDetail;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
