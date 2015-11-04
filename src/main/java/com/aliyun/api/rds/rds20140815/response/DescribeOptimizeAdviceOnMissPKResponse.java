package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.AdviceOnMissPK;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeOptimizeAdviceOnMissPK.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeOptimizeAdviceOnMissPKResponse extends AliyunResponse {

    private static final long serialVersionUID = 4377564985587784156L;

    /**
     * AdviceOnMissPK列表
     */
    @ApiListField("Items")
    @ApiField("AdviceOnMissPK")
    private List<AdviceOnMissPK> items;

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

    public void setItems(List<AdviceOnMissPK> items) {
        this.items = items;
    }

    public List<AdviceOnMissPK> getItems() {
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