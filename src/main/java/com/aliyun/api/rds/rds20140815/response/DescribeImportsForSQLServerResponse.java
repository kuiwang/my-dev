package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.SQLServerImport;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeImportsForSQLServer.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeImportsForSQLServerResponse extends AliyunResponse {

    private static final long serialVersionUID = 2216325828928296874L;

    /**
     * 数据列表
     */
    @ApiListField("Items")
    @ApiField("SQLServerImport")
    private List<SQLServerImport> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 本页SQL语句个数
     */
    @ApiField("SQLItemsCounts")
    private Long sQLItemsCounts;

    /**
     * 总记录数
     */
    @ApiField("TotalRecordCounts")
    private Long totalRecordCounts;

    public List<SQLServerImport> getItems() {
        return this.items;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getsQLItemsCounts() {
        return this.sQLItemsCounts;
    }

    public Long getTotalRecordCounts() {
        return this.totalRecordCounts;
    }

    public void setItems(List<SQLServerImport> items) {
        this.items = items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setsQLItemsCounts(Long sQLItemsCounts) {
        this.sQLItemsCounts = sQLItemsCounts;
    }

    public void setTotalRecordCounts(Long totalRecordCounts) {
        this.totalRecordCounts = totalRecordCounts;
    }

}
