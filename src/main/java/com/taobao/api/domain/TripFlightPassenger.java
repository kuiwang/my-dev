package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 乘机人信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TripFlightPassenger extends TaobaoObject {

    private static final long serialVersionUID = 4267369632722821446L;

    /**
     * 乘机人生日：yyyy-mm-dd
     */
    @ApiField("birthday")
    private String birthday;

    /**
     * 舱位等级：0，头等舱(F)；1，商务舱(C)；2，经济舱(Y)
     */
    @ApiField("cabin_class")
    private Long cabinClass;

    /**
     * 航班舱位代码
     */
    @ApiField("cabin_code")
    private String cabinCode;

    /**
     * 乘机人证件号码
     */
    @ApiField("cert_no")
    private String certNo;

    /**
     * 乘机人证件类型：0，身份证；1，护照；3，军人证；4，回乡证；5，台胞证；6，港澳台胞；10，警官证；11，士兵证件
     */
    @ApiField("cert_type")
    private Long certType;

    /**
     * ei项
     */
    @ApiField("ei")
    private String ei;

    /**
     * 扩展字段
     */
    @ApiField("extra")
    private String extra;

    /**
     * 航班机建费，单位：分
     */
    @ApiField("fee")
    private Long fee;

    /**
     * 强制保险金额，单位：分
     */
    @ApiField("force_insure_price")
    private Long forceInsurePrice;

    /**
     * 当前乘机人的保险分润金额，单位：分
     */
    @ApiField("insure_promotion_price")
    private Long insurePromotionPrice;

    /**
     * 备注信息，政策中的备注信息
     */
    @ApiField("memo")
    private String memo;

    /**
     * 乘机人姓名
     */
    @ApiField("name")
    private String name;

    /**
     * 乘机人类型：0，成人；1，儿童；
     */
    @ApiField("passenger_type")
    private Long passengerType;

    /**
     * PNR信息
     */
    @ApiField("pnr")
    private String pnr;

    /**
     * 政策id，淘宝系统政策唯一键
     */
    @ApiField("policy_id")
    private Long policyId;

    /**
     * 机票政策类型：0，默认；1，自定义
     */
    @ApiField("policy_type")
    private Long policyType;

    /**
     * 销售价格，单位：分
     */
    @ApiField("price")
    private Long price;

    /**
     * 航班燃油税，单位：分
     */
    @ApiField("tax")
    private Long tax;

    /**
     * 票号
     */
    @ApiField("ticket_no")
    private String ticketNo;

    /**
     * 常旅客卡号
     */
    @ApiField("trip_card_no")
    private String tripCardNo;

    /**
     * 退改签
     */
    @ApiField("tuigaiqian")
    private String tuigaiqian;

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(Long cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getCabinCode() {
        return this.cabinCode;
    }

    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public Long getCertType() {
        return this.certType;
    }

    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public String getEi() {
        return this.ei;
    }

    public void setEi(String ei) {
        this.ei = ei;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Long getFee() {
        return this.fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getForceInsurePrice() {
        return this.forceInsurePrice;
    }

    public void setForceInsurePrice(Long forceInsurePrice) {
        this.forceInsurePrice = forceInsurePrice;
    }

    public Long getInsurePromotionPrice() {
        return this.insurePromotionPrice;
    }

    public void setInsurePromotionPrice(Long insurePromotionPrice) {
        this.insurePromotionPrice = insurePromotionPrice;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPassengerType() {
        return this.passengerType;
    }

    public void setPassengerType(Long passengerType) {
        this.passengerType = passengerType;
    }

    public String getPnr() {
        return this.pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Long getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getPolicyType() {
        return this.policyType;
    }

    public void setPolicyType(Long policyType) {
        this.policyType = policyType;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTax() {
        return this.tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public String getTicketNo() {
        return this.ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getTripCardNo() {
        return this.tripCardNo;
    }

    public void setTripCardNo(String tripCardNo) {
        this.tripCardNo = tripCardNo;
    }

    public String getTuigaiqian() {
        return this.tuigaiqian;
    }

    public void setTuigaiqian(String tuigaiqian) {
        this.tuigaiqian = tuigaiqian;
    }

}
