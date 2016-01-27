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

    /**
     * 卖家提供的退货地址，淘宝退款为必填项。
     */
    private String address;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.rp.returngoods.agree";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getPost() {
        return this.post;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public String getRemark() {
        return this.remark;
    }

    @Override
    public Class<RpReturngoodsAgreeResponse> getResponseClass() {
        return RpReturngoodsAgreeResponse.class;
    }

    public Long getSellerAddressId() {
        return this.sellerAddressId;
    }

    public String getTel() {
        return this.tel;
    }

    @Override
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSellerAddressId(Long sellerAddressId) {
        this.sellerAddressId = sellerAddressId;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
