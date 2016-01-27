package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.BinLogFile;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeBinlogFiles.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeBinlogFilesResponse extends AliyunResponse {

    private static final long serialVersionUID = 8869787994184718389L;

    /**
     * SQLSlowLog列表
     */
    @ApiListField("Items")
    @ApiField("BinLogFile")
    private List<BinLogFile> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 本页SQL语句个数
     */
    @ApiField("PageRecordCount")
    private Long pageRecordCount;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 总记录数
     */
    @ApiField("TotalRecordCount")
    private Long totalRecordCount;

    public List<BinLogFile> getItems() {
        return this.items;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setItems(List<BinLogFile> items) {
        this.items = items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

}
