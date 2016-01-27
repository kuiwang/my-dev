package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomImgUploadResponse;

/**
 * TOP API: taobao.hotel.room.img.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelRoomImgUploadRequest implements TaobaoUploadRequest<HotelRoomImgUploadResponse> {

    /**
     * 酒店房间商品gid。必须为数字。
     */
    private Long gid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店商品图片。类型:JPG,GIF;最大长度:500K。支持的文件类型：gif,jpg,jpeg,png。
     * 如果原图片少于5张，若没传序号或序号大于原图片个数，则在原图片最后添加，否则按序号插入到原图片中去，自动后移。
     * 如果原图片大于5张，若没传序号，则替换最后一张图片，否则在序号位置插入，图片向后移，最后一张被删除。<br />
     * 支持的文件类型为：jpg,png,gif<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem pic;

    /**
     * 图片序号，可选值：1，2，3，4，5<br />
     * 支持的最大列表长度为：1
     */
    private Long position;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(gid, "gid");
        RequestCheckUtils.checkNotEmpty(pic, "pic");
        RequestCheckUtils.checkMaxLength(pic, 512000, "pic");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.room.img.upload";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("pic", this.pic);
        return params;
    }

    public Long getGid() {
        return this.gid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getPic() {
        return this.pic;
    }

    public Long getPosition() {
        return this.position;
    }

    @Override
    public Class<HotelRoomImgUploadResponse> getResponseClass() {
        return HotelRoomImgUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gid", this.gid);
        txtParams.put("position", this.position);
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

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
