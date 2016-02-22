package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderCreateResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDealerRequisitionorderCreateRequest
        implements TaobaoRequest<FenxiaoDealerRequisitionorderCreateResponse> {

    /**
     * 收货人所在街道地址
     */
    private String address;

    /**
     * 买家姓名（自提方式填写提货人姓名）
     */
    private String buyerName;

    /**
     * 收货人所在市
     */
    private String city;

    /**
     * 收货人所在区
     */
    private String district;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 身份证号（自提方式必填，填写提货人身份证号码，提货时用于确认提货人身份）
     */
    private String idCardNumber;

    /**
     * 配送方式。SELF_PICKUP：自提；LOGISTICS：仓库发货
     */
    private String logisticsType;

    /**
     * 买家的手机号码（1、此字段与phone字段至少填写一个。2、自提方式下此字段必填，保存提货人联系电话）
     */
    private String mobile;

    /**
     * 采购清单，存放多个采购明细，每个采购明细内部以‘:’隔开，多个采购明细之间以‘,’隔开.
     * 例(分销产品id:skuid:购买数量:申请单价
     * ,分销产品id:skuid:购买数量:申请单价)，申请单价的单位为分。不存在sku请留空skuid
     * ，如（分销产品id::购买数量:申请单价）
     */
    private String orderDetail;

    /**
     * 买家联系电话（此字段和mobile字段至少填写一个）
     */
    private String phone;

    /**
     * 收货人所在地区邮政编码
     */
    private String postCode;

    /**
     * 收货人所在省份
     */
    private String province;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(address, "address");
        RequestCheckUtils.checkNotEmpty(buyerName, "buyerName");
        RequestCheckUtils.checkNotEmpty(logisticsType, "logisticsType");
        RequestCheckUtils.checkNotEmpty(orderDetail, "orderDetail");
        RequestCheckUtils.checkMaxListSize(orderDetail, 50, "orderDetail");
        RequestCheckUtils.checkNotEmpty(province, "province");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.create";
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public String getLogisticsType() {
        return this.logisticsType;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getOrderDetail() {
        return this.orderDetail;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getProvince() {
        return this.province;
    }

    @Override
    public Class<FenxiaoDealerRequisitionorderCreateResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderCreateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("buyer_name", this.buyerName);
        txtParams.put("city", this.city);
        txtParams.put("district", this.district);
        txtParams.put("id_card_number", this.idCardNumber);
        txtParams.put("logistics_type", this.logisticsType);
        txtParams.put("mobile", this.mobile);
        txtParams.put("order_detail", this.orderDetail);
        txtParams.put("phone", this.phone);
        txtParams.put("post_code", this.postCode);
        txtParams.put("province", this.province);
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

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
