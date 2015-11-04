package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MediaFileAddResponse;

/**
 * TOP API: taobao.media.file.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class MediaFileAddRequest implements TaobaoUploadRequest<MediaFileAddResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 接入多媒体平台的业务code 每个应用有一个特有的业务code
     */
    private String bizCode;

    /**
     * 文件属于的那个目录的目录编号<br />
     * 支持最小值为：0
     */
    private Long dirId;

    /**
     * 额外信息
     */
    private Long ext;

    /**
     * 文件
     */
    private FileItem fileData;

    /**
     * 上传文件的名称<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String name;

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public Long getDirId() {
        return this.dirId;
    }

    public void setExt(Long ext) {
        this.ext = ext;
    }

    public Long getExt() {
        return this.ext;
    }

    public void setFileData(FileItem fileData) {
        this.fileData = fileData;
    }

    public FileItem getFileData() {
        return this.fileData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.media.file.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_code", this.bizCode);
        txtParams.put("dir_id", this.dirId);
        txtParams.put("ext", this.ext);
        txtParams.put("name", this.name);
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
        params.put("file_data", this.fileData);
        return params;
    }

    public Class<MediaFileAddResponse> getResponseClass() {
        return MediaFileAddResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
        RequestCheckUtils.checkNotEmpty(dirId, "dirId");
        RequestCheckUtils.checkMinValue(dirId, 0L, "dirId");
        RequestCheckUtils.checkNotEmpty(fileData, "fileData");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 50, "name");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
