package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.DBInstance;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeDBInstances.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeDBInstancesResponse extends AliyunResponse {

    private static final long serialVersionUID = 5191178198312452144L;

    /**
     * 由DBInstance组成的数组
     */
    @ApiListField("Items")
    @ApiField("DBInstance")
    private List<DBInstance> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

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

    public void setItems(List<DBInstance> items) {
        this.items = items;
    }

    public List<DBInstance> getItems() {
        return this.items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
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
