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

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

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

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public FileItem getPic() {
        return this.pic;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.hotel.image.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
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

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("pic", this.pic);
        return params;
    }

    public Class<HotelImageUploadResponse> getResponseClass() {
        return HotelImageUploadResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(hid, "hid");
        RequestCheckUtils.checkNotEmpty(pic, "pic");
        RequestCheckUtils.checkMaxLength(pic, 512000, "pic");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
