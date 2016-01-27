package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.XhotelListSearchResponse;

/**
 * TOP API: taobao.xhotel.list.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class XhotelListSearchRequest implements TaobaoRequest<XhotelListSearchResponse> {

    /**
     * 入住时间，默认值为当前时间加3天
     */
    private Date checkIn;

    /**
     * 离店日期，默认值为当前时间加4天
     */
    private Date checkOut;

    /**
     * 城市编码，需通过taobao.xhotel.city.get接口获取
     */
    private Long cityCode;

    /**
     * 城市名称，需通过taobao.xhotel.city.get接口获取
     */
    private String cityName;

    /**
     * 分页参数：当前页数，从1开始计数。 默认值：1
     */
    private Long currentPage;

    /**
     * 酒店星级/档次。 五星/豪华:5 四星/高档:4 三星/舒适:3 二星及以下：2 经济连锁：1 客栈公寓:0
     * 支持设置多个档次，多个档次用","隔开，如5,4,3
     */
    private String dangcis;

    /**
     * 排序方向。 从高往低: DESC 从低往高: ASC。 默认值为DESC
     * 注意：如果按距离排序，设置此参数无效。如果按距离排序，则按离搜索中心点从近到远的顺序返回酒店列表，不需要再设置dir参数。
     */
    private String dir;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定价格范围搜索时的最高价，单位：元。
     */
    private Long highPrice;

    /**
     * 搜索关键字
     */
    private String keywords;

    /**
     * 指定价格范围搜索时的最低价，单位：元。
     */
    private Long lowPrice;

    /**
     * 排序方式。 默认排序：DEFAULT 按销量排序：SALESCOUNT 按价格排序：PRICE 按照距离排序：DISTANCE。
     * 注意：如果按距离排序，则按离搜索中心点从近到远的顺序返回酒店列表，不需要再设置dir参数。
     */
    private String order;

    /**
     * 分页参数：每页酒店数量。最小值1，最大值为20。默认值：20
     */
    private Long pageSize;

    /**
     * pid
     */
    private String pid;

    /**
     * 地图搜的半径，单位:米。默认值为5000米，允许的最大值为50000米。<br />
     * 支持最大值为：50000<br />
     * 支持最小值为：1
     */
    private Long radius;

    /**
     * 地图搜时中心点的经度。注意：如果设置此参数，则参数radius_lng也必须设置。
     */
    private String radiusLat;

    /**
     * 地图搜索时中心点的经度。注意：如果设置此参数，则参数radius_lat也必须设置。
     */
    private String radiusLng;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(radius, 50000L, "radius");
        RequestCheckUtils.checkMinValue(radius, 1L, "radius");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.xhotel.list.search";
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    public Date getCheckOut() {
        return this.checkOut;
    }

    public Long getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public String getDangcis() {
        return this.dangcis;
    }

    public String getDir() {
        return this.dir;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHighPrice() {
        return this.highPrice;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Long getLowPrice() {
        return this.lowPrice;
    }

    public String getOrder() {
        return this.order;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getPid() {
        return this.pid;
    }

    public Long getRadius() {
        return this.radius;
    }

    public String getRadiusLat() {
        return this.radiusLat;
    }

    public String getRadiusLng() {
        return this.radiusLng;
    }

    @Override
    public Class<XhotelListSearchResponse> getResponseClass() {
        return XhotelListSearchResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("check_in", this.checkIn);
        txtParams.put("check_out", this.checkOut);
        txtParams.put("city_code", this.cityCode);
        txtParams.put("city_name", this.cityName);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("dangcis", this.dangcis);
        txtParams.put("dir", this.dir);
        txtParams.put("high_price", this.highPrice);
        txtParams.put("keywords", this.keywords);
        txtParams.put("low_price", this.lowPrice);
        txtParams.put("order", this.order);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("pid", this.pid);
        txtParams.put("radius", this.radius);
        txtParams.put("radius_lat", this.radiusLat);
        txtParams.put("radius_lng", this.radiusLng);
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

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setDangcis(String dangcis) {
        this.dangcis = dangcis;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setHighPrice(Long highPrice) {
        this.highPrice = highPrice;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setRadius(Long radius) {
        this.radius = radius;
    }

    public void setRadiusLat(String radiusLat) {
        this.radiusLat = radiusLat;
    }

    public void setRadiusLng(String radiusLng) {
        this.radiusLng = radiusLng;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
