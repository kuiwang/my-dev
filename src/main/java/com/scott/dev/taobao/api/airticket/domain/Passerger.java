package com.scott.dev.taobao.api.airticket.domain;

/**
 * 国内机票乘机人信息数据结构【top订单优化】
 */
public class Passerger {

    /**
     * 乘机人生日：yyyy-mm-dd
     */
    private String birthday;

    /**
     * 乘机人证件号码
     */
    private String certNo;

    /**
     * 乘机人证件类型：0，身份证；1，护照；2，学生证；3，军人证；4，回乡证；5，台胞证；6，港澳台胞；7，国际海员；8，外国人永久居留证；
     * 9，其它证件
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
     * 强制保险金额，单位：分
     */
    private Long forceInsurePrice;

    /**
     * 当前乘机人的保险分润金额，单位：分
     */
    private Long insurePromotionPrice;

    /**
     * 乘机人姓名
     */
    private String name;

    /**
     * 乘机人类型：0，成人；1，儿童；2，婴儿
     */
    private Long passengerType;

    /**
     * pnr
     */
    private String pnr;

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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
