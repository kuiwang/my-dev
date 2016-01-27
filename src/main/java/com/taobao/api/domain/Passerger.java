package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 国内机票乘机人信息数据结构【top订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class Passerger extends TaobaoObject {

    private static final long serialVersionUID = 5532946615445276834L;

    /**
     * 乘机人生日：yyyy-mm-dd
     */
    @ApiField("birthday")
    private String birthday;

    /**
     * 乘机人证件号码
     */
    @ApiField("cert_no")
    private String certNo;

    /**
     * 乘机人证件类型：0，身份证；1，护照；2，学生证；3，军人证；4，回乡证；5，台胞证；6，港澳台胞；7，国际海员；8，外国人永久居留证；
     * 9，其它证件
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
     * 乘机人姓名
     */
    @ApiField("name")
    private String name;

    /**
     * 乘机人类型：0，成人；1，儿童；2，婴儿
     */
    @ApiField("passenger_type")
    private Long passengerType;

    /**
     * pnr
     */
    @ApiField("pnr")
    private String pnr;

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

    public Long getForceInsurePrice() {
        return this.forceInsurePrice;
    }

    public Long getInsurePromotionPrice() {
        return this.insurePromotionPrice;
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

    public void setForceInsurePrice(Long forceInsurePrice) {
        this.forceInsurePrice = forceInsurePrice;
    }

    public void setInsurePromotionPrice(Long insurePromotionPrice) {
        this.insurePromotionPrice = insurePromotionPrice;
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
