package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RpReturngoodsAgreeResponse;

/**
 * TOP API: taobao.rp.returngoods.agree request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RpReturngoodsAgreeRequest implements TaobaoRequest<RpReturngoodsAgreeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 卖家提供的退货地址，淘宝退款为必填项。
     */
    private String address;

    /**
     * 卖家手机，淘宝退款为必填项。
     */
    private String mobile;

    /**
     * 卖家姓名，淘宝退款为必填项。
     */
    private String name;

    /**
     * 卖家提供的退货地址的邮编，淘宝退款为必填项。
     */
    private String post;

    /**
     * 退款编号
     */
    private Long refundId;

    /**
     * 售中：onsale，售后：aftersale，天猫退款为必填项。
     */
    private String refundPhase;

    /**
     * 退款版本号，天猫退款为必填项。
     */
    private Long refundVersion;

    /**
     * 卖家退货留言，天猫退款为必填项。
     */
    private String remark;

    /**
     * 卖家收货地址编号，天猫退款为必填项。
     */
    private Long sellerAddressId;

    /**
     * 卖家座机，淘宝退款为必填项。
     */
    private String tel;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return this.post;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSellerAddressId(Long sellerAddressId) {
        this.sellerAddressId = sellerAddressId;
    }

    public Long getSellerAddressId() {
        return this.sellerAddressId;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.rp.returngoods.agree";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("mobile", this.mobile);
        txtParams.put("name", this.name);
        txtParams.put("post", this.post);
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
        txtParams.put("refund_version", this.refundVersion);
        txtParams.put("remark", this.remark);
        txtParams.put("seller_address_id", this.sellerAddressId);
        txtParams.put("tel", this.tel);
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

    public Class<RpReturngoodsAgreeResponse> getResponseClass() {
        return RpReturngoodsAgreeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
