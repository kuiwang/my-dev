package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomsSearchResponse;

/**
 * TOP API: taobao.hotel.rooms.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelRoomsSearchRequest implements TaobaoRequest<HotelRoomsSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 酒店房间商品gid列表，多个gid用英文逗号隔开，一次不超过20个。gids，item_ids ,
     * hids，rids四项必须传一项，同时传递的情况下，作为查询条件的优先级由高到低依次为gids，item_ids ,
     * hids，rids。
     */
    private String gids;

    /**
     * 酒店hid列表，多个hid用英文逗号隔开，一次不超过5个。gids，item_ids ,
     * hids，rids四项必须传一项，同时传递的情况下，作为查询条件的优先级由高到低依次为gids，item_ids ,
     * hids，rids。
     */
    private String hids;

    /**
     * 酒店房间商品item_id列表，多个item_id用英文逗号隔开，一次不超过20个。gids，item_ids ,
     * hids，rids四项必须传一项，同时传递的情况下，作为查询条件的优先级由高到低依次为gids，item_ids ,
     * hids，rids。当item_ids参数值为-1，gids项不传值时，会返回卖家所有商品列表
     */
    private String itemIds;

    /**
     * 是否需要返回该商品的酒店信息。可选值：true，false。
     */
    private Boolean needHotel;

    /**
     * 是否需要返回该商品的宝贝描述。可选值：true，false。
     */
    private Boolean needRoomDesc;

    /**
     * 是否需要返回该商品的房态列表。可选值：true，false。
     */
    private Boolean needRoomQuotas;

    /**
     * 是否需要返回该商品的房型信息。可选值：true，false。
     */
    private Boolean needRoomType;

    /**
     * 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。页面大小为20
     */
    private Long pageNo;

    /**
     * 房型rid列表，多个rid用英文逗号隔开，一次不超过20个。gids，item_ids ,
     * hids，rids四项必须传一项，同时传递的情况下，作为查询条件的优先级由高到低依次为gids，item_ids ,
     * hids，rids。
     */
    private String rids;

    public void setGids(String gids) {
        this.gids = gids;
    }

    public String getGids() {
        return this.gids;
    }

    public void setHids(String hids) {
        this.hids = hids;
    }

    public String getHids() {
        return this.hids;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setNeedHotel(Boolean needHotel) {
        this.needHotel = needHotel;
    }

    public Boolean getNeedHotel() {
        return this.needHotel;
    }

    public void setNeedRoomDesc(Boolean needRoomDesc) {
        this.needRoomDesc = needRoomDesc;
    }

    public Boolean getNeedRoomDesc() {
        return this.needRoomDesc;
    }

    public void setNeedRoomQuotas(Boolean needRoomQuotas) {
        this.needRoomQuotas = needRoomQuotas;
    }

    public Boolean getNeedRoomQuotas() {
        return this.needRoomQuotas;
    }

    public void setNeedRoomType(Boolean needRoomType) {
        this.needRoomType = needRoomType;
    }

    public Boolean getNeedRoomType() {
        return this.needRoomType;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setRids(String rids) {
        this.rids = rids;
    }

    public String getRids() {
        return this.rids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.rooms.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gids", this.gids);
        txtParams.put("hids", this.hids);
        txtParams.put("item_ids", this.itemIds);
        txtParams.put("need_hotel", this.needHotel);
        txtParams.put("need_room_desc", this.needRoomDesc);
        txtParams.put("need_room_quotas", this.needRoomQuotas);
        txtParams.put("need_room_type", this.needRoomType);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("rids", this.rids);
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

    public Class<HotelRoomsSearchResponse> getResponseClass() {
        return HotelRoomsSearchResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
