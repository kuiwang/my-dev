package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MediaFileDeleteResponse;

/**
 * TOP API: taobao.media.file.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class MediaFileDeleteRequest implements TaobaoRequest<MediaFileDeleteResponse> {

    /**
     * 接入多媒体平台的业务code 每个应用有一个特有的业务code
     */
    private String bizCode;

    /**
     * 文件ID字符串,可以一个也可以一组,用英文逗号间隔,如450,120,155
     */
    private String fileIds;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
        RequestCheckUtils.checkNotEmpty(fileIds, "fileIds");
        RequestCheckUtils.checkMaxListSize(fileIds, 50, "fileIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.media.file.delete";
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getFileIds() {
        return this.fileIds;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<MediaFileDeleteResponse> getResponseClass() {
        return MediaFileDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_code", this.bizCode);
        txtParams.put("file_ids", this.fileIds);
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

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public void setFileIds(String fileIds) {
        this.fileIds = fileIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
