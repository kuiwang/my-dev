package com.scott.dev.taobao.api.airticket.domain;

/**
 * 乘机人信息
 */
public class TripFlightPassenger {

    /**
     * 乘机人生日：yyyy-mm-dd
     */
    private String birthday;

    /**
     * 舱位等级：0，头等舱(F)；1，商务舱(C)；2，经济舱(Y)
     */
    private Long cabinClass;

    /**
     * 航班舱位代码
     */
    private String cabinCode;

    /**
     * 乘机人证件号码
     */
    private String certNo;

    /**
     * 乘机人证件类型：0，身份证；1，护照；3，军人证；4，回乡证；5，台胞证；6，港澳台胞；10，警官证；11，士兵证件
     */
    private Long certType;

    /**
     * ei项
     */
    private String ei;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * 航班机建费，单位：分
     */
    private Long fee;

    /**
     * 强制保险金额，单位：分
     */
    private Long forceInsurePrice;

    /**
     * 当前乘机人的保险分润金额，单位：分
     */
    private Long insurePromotionPrice;

    /**
     * 备注信息，政策中的备注信息
     */
    private String memo;

    /**
     * 乘机人姓名
     */
    private String name;

    /**
     * 乘机人类型：0，成人；1，儿童；
     */
    private Long passengerType;

    /**
     * PNR信息
     */
    private String pnr;

    /**
     * 政策id，淘宝系统政策唯一键
     */
    private Long policyId;

    /**
     * 机票政策类型：0，默认；1，自定义
     */
    private Long policyType;

    /**
     * 销售价格，单位：分
     */
    private Long price;

    /**
     * 航班燃油税，单位：分
     */
    private Long tax;

    /**
     * 票号
     */
    private String ticketNo;

    /**
     * 常旅客卡号
     */
    private String tripCardNo;

    /**
     * 退改签
     */
    private String tuigaiqian;

    public String getBirthday() {
        return this.birthday;
    }

    public Long getCabinClass() {
        return this.cabinClass;
    }

    public String getCabinCode() {
        return this.cabinCode;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public Long getCertType() {
        return this.certType;
    }

    public String getEi() {
        return this.ei;
    }

    public String getExtra() {
        return this.extra;
    }

    public Long getFee() {
        return this.fee;
    }

    public Long getForceInsurePrice() {
        return this.forceInsurePrice;
    }

    public Long getInsurePromotionPrice() {
        return this.insurePromotionPrice;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getName() {
        return this.name;
    }

    public Long getPassengerType() {
        return this.passengerType;
    }

    public String getPnr() {
        return this.pnr;
    }

    public Long getPolicyId() {
        return this.policyId;
    }

    public Long getPolicyType() {
        return this.policyType;
    }

    public Long getPrice() {
        return this.price;
    }

    public Long getTax() {
        return this.tax;
    }

    public String getTicketNo() {
        return this.ticketNo;
    }

    public String getTripCardNo() {
        return this.tripCardNo;
    }

    public String getTuigaiqian() {
        return this.tuigaiqian;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCabinClass(Long cabinClass) {
        this.cabinClass = cabinClass;
    }

    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public void setEi(String ei) {
        this.ei = ei;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public void setForceInsurePrice(Long forceInsurePrice) {
        this.forceInsurePrice = forceInsurePrice;
    }

    public void setInsurePromotionPrice(Long insurePromotionPrice) {
        this.insurePromotionPrice = insurePromotionPrice;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassengerType(Long passengerType) {
        this.passengerType = passengerType;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public void setPolicyType(Long policyType) {
        this.policyType = policyType;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public void setTripCardNo(String tripCardNo) {
        this.tripCardNo = tripCardNo;
    }

    public void setTuigaiqian(String tuigaiqian) {
        this.tuigaiqian = tuigaiqian;
    }

}
