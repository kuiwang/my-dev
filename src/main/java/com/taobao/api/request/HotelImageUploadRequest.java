package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelImageUploadResponse;

/**
 * TOP API: taobao.hotel.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelImageUploadRequest implements TaobaoUploadRequest<HotelImageUploadResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店id<br />
     * 支持的最大列表长度为：20
     */
    private Long hid;

    /**
     * 上传的图片<br />
     * 支持的文件类型为：jpg,png,gif<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem pic;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(hid, "hid");
        RequestCheckUtils.checkNotEmpty(pic, "pic");
        RequestCheckUtils.checkMaxLength(pic, 512000, "pic");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.image.upload";
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

    public Long getHid() {
        return this.hid;
    }

    public FileItem getPic() {
        return this.pic;
    }

    @Override
    public Class<HotelImageUploadResponse> getResponseClass() {
        return HotelImageUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
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

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
