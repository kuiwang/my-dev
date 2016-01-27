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

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片文件字节数组<br />
     * 支持的最大列表长度为：512000
     */
    private FileItem picbytes;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(picbytes, "picbytes");
        RequestCheckUtils.checkMaxLength(picbytes, 512000, "picbytes");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.item.pic.upload";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("picbytes", this.picbytes);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getPicbytes() {
        return this.picbytes;
    }

    @Override
    public Class<WaimaiItemPicUploadResponse> getResponseClass() {
        return WaimaiItemPicUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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

    public void setPicbytes(FileItem picbytes) {
        this.picbytes = picbytes;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
