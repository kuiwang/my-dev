package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 国内机票搜索航段信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class AtNSearchSegmentVO extends TaobaoObject {

    private static final long serialVersionUID = 8274452167684456728L;

    /**
     * 活动优惠金额,单位分。
     */
    @ApiField("activity_bonus")
    private String activityBonus;

    /**
     * 活动编号
     */
    @ApiField("activity_id")
    private Long activityId;

    /**
     * 到达城市三字码
     */
    @ApiField("arr_city")
    private String arrCity;

    /**
     * 是否自动出票。
     */
    @ApiField("auto_book")
    private Boolean autoBook;

    /**
     * 基准舱位（FCY）价格，单位分
     */
    @ApiField("basic_cabin_price")
    private String basicCabinPrice;

    /**
     * 舱位代码
     */
    @ApiField("cabin")
    private String cabin;

    /**
     * 舱位等级。0-头等舱；1-商务舱；2-经济舱
     */
    @ApiField("cabin_class")
    private Long cabinClass;

    /**
     * 舱位座位数，123456789AQSCL等。
     */
    @ApiField("cabin_num")
    private String cabinNum;

    /**
     * 出发城市三字码
     */
    @ApiField("dep_city")
    private String depCity;

    /**
     * 运价类型。0-公布运价；1-折扣运价；2-B2B/卖家接口政策；3-航司外部产品
     */
    @ApiField("fare_type")
    private Long fareType;

    /**
     * 产品打标，2的N次方标记。
     */
    @ApiField("flag")
    private Long flag;

    /**
     * 航班号
     */
    @ApiField("flight_no")
    private String flightNo;

    /**
     * 发票提供类型。1-提供（等额行程单）；2-不提供；5-提供（等额行程单+发票）；6-提供（等额发票）
     */
    @ApiField("invoice_type")
    private Long invoiceType;

    /**
     * 销售价格，单位分。
     */
    @ApiField("price")
    private String price;

    /**
     * 航段标识。00-去程第一段；01-去程第二段；10-回程第一段；11-回程第二段。
     */
    @ApiField("segment_number")
    private String segmentNumber;

    /**
     * 库存类型，0-共有库存；1-私有库存；2-可申请库存
     */
    @ApiField("stock_type")
    private Long stockType;

    /**
     * 产品票面价，单位分
     */
    @ApiField("ticket_price")
    private String ticketPrice;

    public String getActivityBonus() {
        return this.activityBonus;
    }

    public void setActivityBonus(String activityBonus) {
        this.activityBonus = activityBonus;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getArrCity() {
        return this.arrCity;
    }

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }

    public Boolean getAutoBook() {
        return this.autoBook;
    }

    public void setAutoBook(Boolean autoBook) {
        this.autoBook = autoBook;
    }

    public String getBasicCabinPrice() {
        return this.basicCabinPrice;
    }

    public void setBasicCabinPrice(String basicCabinPrice) {
        this.basicCabinPrice = basicCabinPrice;
    }

    public String getCabin() {
        return this.cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public Long getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(Long cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getCabinNum() {
        return this.cabinNum;
    }

    public void setCabinNum(String cabinNum) {
        this.cabinNum = cabinNum;
    }

    public String getDepCity() {
        return this.depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public Long getFareType() {
        return this.fareType;
    }

    public void setFareType(Long fareType) {
        this.fareType = fareType;
    }

    public Long getFlag() {
        return this.flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Long getInvoiceType() {
        return this.invoiceType;
    }

    public void setInvoiceType(Long invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSegmentNumber() {
        return this.segmentNumber;
    }

    public void setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public Long getStockType() {
        return this.stockType;
    }

    public void setStockType(Long stockType) {
        this.stockType = stockType;
    }

    public String getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
