package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Backup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeBackups.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeBackupsResponse extends AliyunResponse {

    private static final long serialVersionUID = 8672828374192518258L;

    /**
     * 数据列表
     */
    @ApiListField("Items")
    @ApiField("Backup")
    private List<Backup> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 当前页记录条数
     */
    @ApiField("PageRecordCount")
    private Long pageRecordCount;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 总记录数
     */
    @ApiField("TotalRecordCount")
    private Long totalRecordCount;

    public void setItems(List<Backup> items) {
        this.items = items;
    }

    public List<Backup> getItems() {
        return this.items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

}
