package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiItemPicUploadResponse;

/**
 * TOP API: taobao.waimai.item.pic.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiItemPicUploadRequest implements TaobaoUploadRequest<WaimaiItemPicUploadResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 图片文件字节数组<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem picbytes;

    public void setPicbytes(FileItem picbytes) {
        this.picbytes = picbytes;
    }

    public FileItem getPicbytes() {
        return this.picbytes;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.item.pic.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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
        params.put("picbytes", this.picbytes);
        return params;
    }

    public Class<WaimaiItemPicUploadResponse> getResponseClass() {
        return WaimaiItemPicUploadResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(picbytes, "picbytes");
        RequestCheckUtils.checkMaxLength(picbytes, 512000, "picbytes");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
