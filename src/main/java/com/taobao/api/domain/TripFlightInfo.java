package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 订单航班信息（包含航班乘机人）
 *
 * @author auto create
 * @since 1.0, null
 */
public class TripFlightInfo extends TaobaoObject {

    private static final long serialVersionUID = 2149654892132582318L;

    /**
     * 航班航空公司二字码
     */
    @ApiField("airline_code")
    private String airlineCode;

    /**
     * 航班到达机场三字码
     */
    @ApiField("arr_airport_code")
    private String arrAirportCode;

    /**
     * 航班到达城市三字码
     */
    @ApiField("arr_city_code")
    private String arrCityCode;

    /**
     * 航班到达时间，格式yyyy-mm-dd hh:mm:ss
     */
    @ApiField("arr_time")
    private String arrTime;

    /**
     * 航班实际承运航班号
     */
    @ApiField("carrier")
    private String carrier;

    /**
     * 航班出发机场三字码
     */
    @ApiField("dep_airport_code")
    private String depAirportCode;

    /**
     * 航班出发城市三字码
     */
    @ApiField("dep_city_code")
    private String depCityCode;

    /**
     * 航班起飞时间，格式yyyy-mm-dd hh:mm:ss
     */
    @ApiField("dep_time")
    private String depTime;

    /**
     * 扩展信息
     */
    @ApiField("extra")
    private String extra;

    /**
     * 淘宝机票平台航班id
     */
    @ApiField("flight_id")
    private Long flightId;

    /**
     * 航班号
     */
    @ApiField("flight_no")
    private String flightNo;

    /**
     * 航班机型
     */
    @ApiField("flight_type")
    private String flightType;

    /**
     * 乘机人信息列表
     */
    @ApiListField("passengers")
    @ApiField("trip_flight_passenger")
    private List<TripFlightPassenger> passengers;

    /**
     * 去程或回程第几段航班，0，第1段；1，第2段航班
     */
    @ApiField("segment_number")
    private Long segmentNumber;

    /**
     * 航段类型：0，去程；1，回程
     */
    @ApiField("segment_type")
    private Long segmentType;

    /**
     * 特殊说明
     */
    @ApiField("special_rule")
    private String specialRule;

    /**
     * 当前航段票面价格，单位：分
     */
    @ApiField("ticket_price")
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

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
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

    public List<TripFlightPassenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(List<TripFlightPassenger> passengers) {
        this.passengers = passengers;
    }

    public Long getSegmentNumber() {
        return this.segmentNumber;
    }

    public void setSegmentNumber(Long segmentNumber) {
        this.segmentNumber = segmentNumber;
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

    public Long getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
