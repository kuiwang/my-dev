package com.scott.dev.taobao.api.airticket.domain;

import java.util.List;

/**
 * 国内机票航段信息数据结构，【订单优化】
 */
public class SegmentInfo {

    /**
     * 航班航空公司二字码
     */
    private String airlineCode;

    /**
     * 航班到达机场三字码
     */
    private String arrAirportCode;

    /**
     * 航班到达城市三字码
     */
    private String arrCityCode;

    /**
     * 航班到达时间，格式yyyy-mm-dd hh:mm:ss
     */
    private String arrTime;

    /**
     * 出票状态: 0，初始状态；1，hk成功；2，hk失败；3，出票（RR）成功；4，出票（RR）失败；5，取消hk成功 6:取消hk失败
     */
    private Long bookStatus;

    /**
     * 舱位等级：0，头等舱(F)；1，商务舱(C)；2，经济舱(Y)
     */
    private Long cabinClass;

    /**
     * 航班舱位代码
     */
    private String cabinCode;

    /**
     * 航班舱位id，淘宝系统唯一键
     */
    private Long cabinId;

    /**
     * 航班实际承运航班号
     */
    private String carrier;

    /**
     * 航班儿童机建费用，单位：分
     */
    private Long childFee;

    /**
     * 儿童保险分润金额，单位元
     */
    private Long childInsurePromotionPrice;

    /**
     * 儿童销售价格，单位：分
     */
    private Long childPrice;

    /**
     * 航班儿童燃油税，单位：分
     */
    private Long childTax;

    /**
     * 航班出发机场三字码
     */
    private String depAirportCode;

    /**
     * 航班出发城市三字码
     */
    private String depCityCode;

    /**
     * 航班起飞时间，格式yyyy-mm-dd hh:mm:ss
     */
    private String depTime;

    /**
     * 扩展信息
     */
    private String extra;

    /**
     * 航班成人机建费，单位：分
     */
    private Long fee;

    /**
     * 淘宝系统航班id唯一键
     */
    private Long flightId;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班机型
     */
    private String flightType;

    /**
     * 成人保险分润金额，单位元
     */
    private Long insurePromotionPrice;

    /**
     * 备注信息，政策中的备注信息
     */
    private String memo;

    /**
     * 乘机人信息列表
     */
    private List<Passerger> passengers;

    /**
     * 政策id，淘宝系统政策唯一键
     */
    private Long policyId;

    /**
     * 机票政策类型：6，特价；8，让利；10，特殊
     */
    private Long policyType;

    /**
     * 销售价格，单位：分
     */
    private Long price;

    /**
     * 航段类型：1，去程；2，回程
     */
    private Long segmentType;

    /**
     * 特殊说明
     */
    private String specialRule;

    /**
     * 航班成人燃油税，单位：分
     */
    private Long tax;

    /**
     * 当前航段票面价格，单位：分
     */
    private Long ticketPrice;

    public String getAirlineCode() {
        return this.airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getArrAirportCode() {
        return this.arrAirportCode;
    }

    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public void setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
    }

    public String getArrTime() {
        return this.arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public Long getBookStatus() {
        return this.bookStatus;
    }

    public void setBookStatus(Long bookStatus) {
        this.bookStatus = bookStatus;
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

    public Long getCabinId() {
        return this.cabinId;
    }

    public void setCabinId(Long cabinId) {
        this.cabinId = cabinId;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Long getChildFee() {
        return this.childFee;
    }

    public void setChildFee(Long childFee) {
        this.childFee = childFee;
    }

    public Long getChildInsurePromotionPrice() {
        return this.childInsurePromotionPrice;
    }

    public void setChildInsurePromotionPrice(Long childInsurePromotionPrice) {
        this.childInsurePromotionPrice = childInsurePromotionPrice;
    }

    public Long getChildPrice() {
        return this.childPrice;
    }

    public void setChildPrice(Long childPrice) {
        this.childPrice = childPrice;
    }

    public Long getChildTax() {
        return this.childTax;
    }

    public void setChildTax(Long childTax) {
        this.childTax = childTax;
    }

    public String getDepAirportCode() {
        return this.depAirportCode;
    }

    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    public String getDepCityCode() {
        return this.depCityCode;
    }

    public void setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
    }

    public String getDepTime() {
        return this.depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
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

    public Long getFlightId() {
        return this.flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightType() {
        return this.flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
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

    public List<Passerger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(List<Passerger> passengers) {
        this.passengers = passengers;
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

    public Long getSegmentType() {
        return this.segmentType;
    }

    public void setSegmentType(Long segmentType) {
        this.segmentType = segmentType;
    }

    public String getSpecialRule() {
        return this.specialRule;
    }

    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    public Long getTax() {
        return this.tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Long getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
