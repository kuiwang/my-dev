package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoNsearchOwSearchResponse;

/**
 * TOP API: taobao.trip.jipiao.nsearch.ow.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class TripJipiaoNsearchOwSearchRequest implements
        TaobaoRequest<TripJipiaoNsearchOwSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 到达城市三字码<br />
     * 支持最大长度为：3<br />
     * 支持的最大列表长度为：3
     */
    private String arrCityCode;

    /**
     * 舱位等级，0，默认-全部；1，经济舱；2，商务舱；3，头等舱；4，头等和商务舱；5，经济和商务舱；6，经济和头等舱<br />
     * 支持最大值为：6<br />
     * 支持最小值为：0
     */
    private Long cabinClass;

    /**
     * 出发城市三字码<br />
     * 支持最大长度为：3<br />
     * 支持的最大列表长度为：3
     */
    private String depCityCode;

    /**
     * 航班日期：格式要求 "yyyy-MM-dd"<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String depDate;

    /**
     * 指定航班号：获取指定航班低价舱位列表或者获取指定航班高大上舱位折扣使用<br />
     * 支持最大长度为：7<br />
     * 支持的最大列表长度为：7
     */
    private String flightNo;

    /**
     * 1-9分别表示乘机人数为1-9；乘机人数小于0即相当无限制，默认值-1<br />
     * 支持最大值为：9<br />
     * 支持最小值为：-1
     */
    private Long passengerNum;

    /**
     * 淘宝推广者pid
     */
    private String pid;

    /**
     * 搜索类型：支持三个类型，1. outbound，表示搜索航段最低价，每个航班一个最低价；2.
     * lowprice，表示搜索指定航班topN最低价；3. gaoduan，表示搜索指定航班下高端大气上档次价格列表<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String searchType;

    /**
     * 是否提供报销凭证(行程单),0.不提供和提供报销凭证的都查询出来,1.只查询提供报销凭证的<br />
     * 支持最小值为：0
     */
    private Long supplyItinerary;

    public void setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
    }

    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public void setCabinClass(Long cabinClass) {
        this.cabinClass = cabinClass;
    }

    public Long getCabinClass() {
        return this.cabinClass;
    }

    public void setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
    }

    public String getDepCityCode() {
        return this.depCityCode;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getDepDate() {
        return this.depDate;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public void setPassengerNum(Long passengerNum) {
        this.passengerNum = passengerNum;
    }

    public Long getPassengerNum() {
        return this.passengerNum;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return this.pid;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public void setSupplyItinerary(Long supplyItinerary) {
        this.supplyItinerary = supplyItinerary;
    }

    public Long getSupplyItinerary() {
        return this.supplyItinerary;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trip.jipiao.nsearch.ow.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("arr_city_code", this.arrCityCode);
        txtParams.put("cabin_class", this.cabinClass);
        txtParams.put("dep_city_code", this.depCityCode);
        txtParams.put("dep_date", this.depDate);
        txtParams.put("flight_no", this.flightNo);
        txtParams.put("passenger_num", this.passengerNum);
        txtParams.put("pid", this.pid);
        txtParams.put("search_type", this.searchType);
        txtParams.put("supply_itinerary", this.supplyItinerary);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<TripJipiaoNsearchOwSearchResponse> getResponseClass() {
        return TripJipiaoNsearchOwSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(arrCityCode, "arrCityCode");
        RequestCheckUtils.checkMaxLength(arrCityCode, 3, "arrCityCode");
        RequestCheckUtils.checkMaxValue(cabinClass, 6L, "cabinClass");
        RequestCheckUtils.checkMinValue(cabinClass, 0L, "cabinClass");
        RequestCheckUtils.checkNotEmpty(depCityCode, "depCityCode");
        RequestCheckUtils.checkMaxLength(depCityCode, 3, "depCityCode");
        RequestCheckUtils.checkNotEmpty(depDate, "depDate");
        RequestCheckUtils.checkMaxLength(depDate, 10, "depDate");
        RequestCheckUtils.checkMaxLength(flightNo, 7, "flightNo");
        RequestCheckUtils.checkMaxValue(passengerNum, 9L, "passengerNum");
        RequestCheckUtils.checkMinValue(passengerNum, -1L, "passengerNum");
        RequestCheckUtils.checkMaxLength(searchType, 10, "searchType");
        RequestCheckUtils.checkMinValue(supplyItinerary, 0L, "supplyItinerary");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
