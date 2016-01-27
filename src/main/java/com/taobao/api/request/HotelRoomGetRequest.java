package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomGetResponse;

/**
 * TOP API: taobao.hotel.room.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelRoomGetRequest implements TaobaoRequest<HotelRoomGetResponse> {

    /**
     * 酒店房间商品gid。必须为数字。gid和item_id至少要传一个。
     */
    private Long gid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店房间商品item_id。必须为数字。item_id和gid至少要传一个。
     */
    private Long itemId;

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.room.get";
    }

    public Long getGid() {
        return this.gid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Boolean getNeedHotel() {
        return this.needHotel;
    }

    public Boolean getNeedRoomDesc() {
        return this.needRoomDesc;
    }

    public Boolean getNeedRoomQuotas() {
        return this.needRoomQuotas;
    }

    public Boolean getNeedRoomType() {
        return this.needRoomType;
    }

    @Override
    public Class<HotelRoomGetResponse> getResponseClass() {
        return HotelRoomGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gid", this.gid);
        txtParams.put("item_id", this.itemId);
        txtParams.put("need_hotel", this.needHotel);
        txtParams.put("need_room_desc", this.needRoomDesc);
        txtParams.put("need_room_quotas", this.needRoomQuotas);
        txtParams.put("need_room_type", this.needRoomType);
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

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setNeedHotel(Boolean needHotel) {
        this.needHotel = needHotel;
    }

    public void setNeedRoomDesc(Boolean needRoomDesc) {
        this.needRoomDesc = needRoomDesc;
    }

    public void setNeedRoomQuotas(Boolean needRoomQuotas) {
        this.needRoomQuotas = needRoomQuotas;
    }

    public void setNeedRoomType(Boolean needRoomType) {
        this.needRoomType = needRoomType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
