package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.AdviceOnExcessIndex;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeOptimizeAdviceOnExcessIndex.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeOptimizeAdviceOnExcessIndexResponse extends AliyunResponse {

    private static final long serialVersionUID = 5826494291262614885L;

    /**
     * AdviceOnExcessIndex列表
     */
    @ApiListField("Items")
    @ApiField("AdviceOnExcessIndex")
    private List<AdviceOnExcessIndex> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 本页SQL日志明细个数
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

    public List<AdviceOnExcessIndex> getItems() {
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

    public void setItems(List<AdviceOnExcessIndex> items) {
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
