package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomImgDeleteResponse;

/**
 * TOP API: taobao.hotel.room.img.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelRoomImgDeleteRequest implements TaobaoRequest<HotelRoomImgDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 酒店房间商品gid。必须为数字。
     */
    private Long gid;

    /**
     * 图片序号，可选值：1，2，3，4，5。 如果原图片个数小于等于1，则报错，不能删除图片。
     * 如果原图片个数小于待删除的图片序号，则报错，图片序号错误。<br />
     * 支持的最大列表长度为：1
     */
    private Long position;

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Long getGid() {
        return this.gid;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.room.img.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gid", this.gid);
        txtParams.put("position", this.position);
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

    public Class<HotelRoomImgDeleteResponse> getResponseClass() {
        return HotelRoomImgDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(gid, "gid");
        RequestCheckUtils.checkNotEmpty(position, "position");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
