package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Requisition;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.requisitions.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRequisitionsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5646377539222561794L;

    /**
     * 操作是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 合作申请
     */
    @ApiListField("requisitions")
    @ApiField("requisition")
    private List<Requisition> requisitions;

    /**
     * 结果记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setRequisitions(List<Requisition> requisitions) {
        this.requisitions = requisitions;
    }

    public List<Requisition> getRequisitions() {
        return this.requisitions;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
