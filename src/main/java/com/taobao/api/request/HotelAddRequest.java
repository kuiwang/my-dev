package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelAddResponse;

/**
 * TOP API: taobao.hotel.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelAddRequest implements TaobaoUploadRequest<HotelAddResponse> {

    /**
     * 酒店地址。长度不能超过120<br />
     * 支持最大长度为：120<br />
     * 支持的最大列表长度为：120
     */
    private String address;

    /**
     * 城市编码。参见：http://kezhan.trip.taobao.com/area.html，domestic为false时，
     * 输入对应国家的海外城市编码，可调用海外城市查询接口获取<br />
     * 支持最大值为：999999<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：6
     */
    private Long city;

    /**
     * domestic为true时，固定China；
     * domestic为false时，必须传定义的海外国家编码值。参见：http://kezhan
     * .trip.taobao.com/countrys.html
     */
    private String country;

    /**
     * 装修年份。长度不能超过4。<br />
     * 支持最大长度为：4<br />
     * 支持的最大列表长度为：4
     */
    private String decorateTime;

    /**
     * 酒店介绍。不超过25000个汉字<br />
     * 支持最大长度为：50000<br />
     * 支持的最大列表长度为：50000
     */
    private String desc;

    /**
     * 区域（县级市）编码。参见：http://kezhan.trip.taobao.com/area.html<br />
     * 支持最大值为：999999<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：6
     */
    private Long district;

    /**
     * 是否国内酒店。可选值：true，false
     */
    private Boolean domestic;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店级别。可选值：A,B,C,D,E,F。代表客栈公寓、经济连锁、二星级/以下、三星级/舒适、四星级/高档、五星级/豪华<br />
     * 支持最大长度为：1<br />
     * 支持的最大列表长度为：1
     */
    private String level;

    /**
     * 酒店名称。不能超过60<br />
     * 支持最大长度为：60<br />
     * 支持的最大列表长度为：60
     */
    private String name;

    /**
     * 开业年份。长度不能超过4。<br />
     * 支持最大长度为：4<br />
     * 支持的最大列表长度为：4
     */
    private String openingTime;

    /**
     * 酒店定位。可选值：T,B。代表旅游度假、商务出行<br />
     * 支持最大长度为：1<br />
     * 支持的最大列表长度为：1
     */
    private String orientation;

    /**
     * 酒店图片。最大长度:500K。支持的文件类型：gif,jpg,png<br />
     * 支持的文件类型为：jpg,png,gif<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem pic;

    /**
     * 省份编码。参见：http://kezhan.trip.taobao.com/area.html，domestic为false时默认为0
     * <br />
     * 支持最大值为：999999<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：6
     */
    private Long province;

    /**
     * 房间数。长度不能超过4。<br />
     * 支持最大值为：9999<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：4
     */
    private Long rooms;

    /**
     * 交通距离与设施服务。JSON格式。cityCenterDistance、railwayDistance、
     * airportDistance分别代表距离市中心、距离火车站、距离机场公里数，为不超过3位正整数，默认-1代表无数据。
     * 其他key值true代表有此服务，false代表没有。
     * parking：停车场，airportShuttle：机场接送，rentCar：租车
     * ，meetingRoom：会议室，businessCenter
     * ：商务中心，swimmingPool：游泳池，fitnessClub：健身中心
     * ，laundry：洗衣服务，morningCall：叫早服务
     * ，bankCard：接受银行卡，creditCard：接受信用卡，chineseRestaurant
     * ：中餐厅，westernRestaurant：西餐厅，cafe：咖啡厅，bar：酒吧，ktv：KTV。
     */
    private String service;

    /**
     * 接入卖家数据主键<br />
     * 支持最大长度为：100<br />
     * 支持的最大列表长度为：100
     */
    private String siteParam;

    /**
     * 楼层数。长度不能超过4。<br />
     * 支持最大值为：9999<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：4
     */
    private Long storeys;

    /**
     * 酒店电话。格式：国家代码（最长6位）#区号（最长4位）#电话（最长20位）。国家代码提示：中国大陆0086、香港00852、
     * 澳门00853、台湾00886<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String tel;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(address, "address");
        RequestCheckUtils.checkMaxLength(address, 120, "address");
        RequestCheckUtils.checkNotEmpty(city, "city");
        RequestCheckUtils.checkMaxValue(city, 999999L, "city");
        RequestCheckUtils.checkMinValue(city, 0L, "city");
        RequestCheckUtils.checkNotEmpty(country, "country");
        RequestCheckUtils.checkMaxLength(decorateTime, 4, "decorateTime");
        RequestCheckUtils.checkNotEmpty(desc, "desc");
        RequestCheckUtils.checkMaxLength(desc, 50000, "desc");
        RequestCheckUtils.checkMaxValue(district, 999999L, "district");
        RequestCheckUtils.checkMinValue(district, 0L, "district");
        RequestCheckUtils.checkNotEmpty(domestic, "domestic");
        RequestCheckUtils.checkNotEmpty(level, "level");
        RequestCheckUtils.checkMaxLength(level, 1, "level");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 60, "name");
        RequestCheckUtils.checkMaxLength(openingTime, 4, "openingTime");
        RequestCheckUtils.checkNotEmpty(orientation, "orientation");
        RequestCheckUtils.checkMaxLength(orientation, 1, "orientation");
        RequestCheckUtils.checkNotEmpty(pic, "pic");
        RequestCheckUtils.checkMaxLength(pic, 512000, "pic");
        RequestCheckUtils.checkNotEmpty(province, "province");
        RequestCheckUtils.checkMaxValue(province, 999999L, "province");
        RequestCheckUtils.checkMinValue(province, 0L, "province");
        RequestCheckUtils.checkMaxValue(rooms, 9999L, "rooms");
        RequestCheckUtils.checkMinValue(rooms, 0L, "rooms");
        RequestCheckUtils.checkMaxLength(siteParam, 100, "siteParam");
        RequestCheckUtils.checkMaxValue(storeys, 9999L, "storeys");
        RequestCheckUtils.checkMinValue(storeys, 0L, "storeys");
        RequestCheckUtils.checkMaxLength(tel, 32, "tel");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.add";
    }

    public Long getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getDistrict() {
        return this.district;
    }

    public Boolean getDomestic() {
        return this.domestic;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("pic", this.pic);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public FileItem getPic() {
        return this.pic;
    }

    public Long getProvince() {
        return this.province;
    }

    @Override
    public Class<HotelAddResponse> getResponseClass() {
        return HotelAddResponse.class;
    }

    public Long getRooms() {
        return this.rooms;
    }

    public String getService() {
        return this.service;
    }

    public String getSiteParam() {
        return this.siteParam;
    }

    public Long getStoreys() {
        return this.storeys;
    }

    public String getTel() {
        return this.tel;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("city", this.city);
        txtParams.put("country", this.country);
        txtParams.put("decorate_time", this.decorateTime);
        txtParams.put("desc", this.desc);
        txtParams.put("district", this.district);
        txtParams.put("domestic", this.domestic);
        txtParams.put("level", this.level);
        txtParams.put("name", this.name);
        txtParams.put("opening_time", this.openingTime);
        txtParams.put("orientation", this.orientation);
        txtParams.put("province", this.province);
        txtParams.put("rooms", this.rooms);
        txtParams.put("service", this.service);
        txtParams.put("site_param", this.siteParam);
        txtParams.put("storeys", this.storeys);
        txtParams.put("tel", this.tel);
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setRooms(Long rooms) {
        this.rooms = rooms;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSiteParam(String siteParam) {
        this.siteParam = siteParam;
    }

    public void setStoreys(Long storeys) {
        this.storeys = storeys;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
