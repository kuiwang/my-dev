package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MediaFileGetResponse;

/**
 * TOP API: taobao.media.file.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class MediaFileGetRequest implements TaobaoRequest<MediaFileGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 多媒体应用接入biz_code
     */
    private String bizCode;

    /**
     * 分类id<br />
     * 支持最大值为：9223372036854775807
     */
    private Long dirId;

    /**
     * 查询上传结束时间点,格式:yyyy-MM-dd HH:mm:ss
     */
    private Date endDate;

    /**
     * 文件id<br />
     * 支持最大值为：9223372036854775807
     */
    private Long fileId;

    /**
     * 文件名称查询，like查询
     */
    private String name;

    /**
     * 图片查询结果排序,time:desc按上传时间从晚到早(默认),
     * time:asc按上传时间从早到晚,sizes:desc按图片从大到小，sizes:asc按图片从小到大,默认time:desc
     */
    private String orderBy;

    /**
     * 页码.传入值为1代表第一页,传入值为2代表第二页,依此类推,默认值为1
     */
    private Long pageNo;

    /**
     * 每页条数.每页返回最多返回100条,默认值40
     */
    private Long pageSize;

    /**
     * 查询上传开始时间点,格式:yyyy-MM-dd HH:mm:ss
     */
    private Date startDate;

    /**
     * 图片url查询接口
     */
    private String urls;

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

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getFileId() {
        return this.fileId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getUrls() {
        return this.urls;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.media.file.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_code", this.bizCode);
        txtParams.put("dir_id", this.dirId);
        txtParams.put("end_date", this.endDate);
        txtParams.put("file_id", this.fileId);
        txtParams.put("name", this.name);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_date", this.startDate);
        txtParams.put("urls", this.urls);
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

    public Class<MediaFileGetResponse> getResponseClass() {
        return MediaFileGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
        RequestCheckUtils.checkMaxValue(dirId, 9223372036854775807L, "dirId");
        RequestCheckUtils.checkMaxValue(fileId, 9223372036854775807L, "fileId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
