package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomsUpdateResponse;

/**
 * TOP API: taobao.hotel.rooms.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelRoomsUpdateRequest implements TaobaoRequest<HotelRoomsUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 多商品房态信息。json encode。每个商品房态参考单商品更新中的room_quota字段。反序列化后入：array((
     * 'gid'=>1, 'roomQuota'=>array(('date'=>'2011-01-29', 'price'=>100,
     * 'num'=>1),('date'=>'2011-01-30', 'price'=>100, 'num'=>1)),(
     * 'gid'=>2, 'roomQuota'=>array(('date'=>'2011-01-29', 'price'=>100,
     * 'num'=>1),('date'=>'2011-01-30', 'price'=>100, 'num'=>1)))
     */
    private String gidRoomQuotaMap;

    /**
     * 为到店支付卖家特殊使用，可传入多种支付类型的房态信息。 该参数有值时，忽略gid_room_quota_map参数；
     * 该参数无值时，使用gid_room_quota_map参数
     */
    private String multiRoomQuotas;

    public void setGidRoomQuotaMap(String gidRoomQuotaMap) {
        this.gidRoomQuotaMap = gidRoomQuotaMap;
    }

    public String getGidRoomQuotaMap() {
        return this.gidRoomQuotaMap;
    }

    public void setMultiRoomQuotas(String multiRoomQuotas) {
        this.multiRoomQuotas = multiRoomQuotas;
    }

    public String getMultiRoomQuotas() {
        return this.multiRoomQuotas;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.rooms.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gid_room_quota_map", this.gidRoomQuotaMap);
        txtParams.put("multi_room_quotas", this.multiRoomQuotas);
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

    public Class<HotelRoomsUpdateResponse> getResponseClass() {
        return HotelRoomsUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
