package com.scott.dev.taobao.api.airticket.domain;

import java.util.List;

/**
 * 订单航班信息（包含航班乘机人）
 */
public class TripFlightInfo {

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
     * 航班实际承运航班号
     */
    private String carrier;

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
     * 淘宝机票平台航班id
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
     * 乘机人信息列表
     */
    private List<TripFlightPassenger> passengers;

    /**
     * 去程或回程第几段航班，0，第1段；1，第2段航班
     */
    private Long segmentNumber;

    /**
     * 航段类型：0，去程；1，回程
     */
    private Long segmentType;

    /**
     * 特殊说明
     */
    private String specialRule;

    /**
     * 当前航段票面价格，单位：分
     */
    private Long ticketPrice;

    public String getAirlineCode() {
        return this.airlineCode;
    }

    public String getArrAirportCode() {
        return this.arrAirportCode;
    }

    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public String getArrTime() {
        return this.arrTime;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getDepAirportCode() {
        return this.depAirportCode;
    }

    public String getDepCityCode() {
        return this.depCityCode;
    }

    public String getDepTime() {
        return this.depTime;
    }

    public String getExtra() {
        return this.extra;
    }

    public Long getFlightId() {
        return this.flightId;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getFlightType() {
        return this.flightType;
    }

    public List<TripFlightPassenger> getPassengers() {
        return this.passengers;
    }

    public Long getSegmentNumber() {
        return this.segmentNumber;
    }

    public Long getSegmentType() {
        return this.segmentType;
    }

    public String getSpecialRule() {
        return this.specialRule;
    }

    public Long getTicketPrice() {
        return this.ticketPrice;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    public void setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    public void setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public void setPassengers(List<TripFlightPassenger> passengers) {
        this.passengers = passengers;
    }

    public void setSegmentNumber(Long segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public void setSegmentType(Long segmentType) {
        this.segmentType = segmentType;
    }

    public void setSpecialRule(String specialRule) {
        this.specialRule = specialRule;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
