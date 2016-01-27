package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.EvalDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.newevals.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceNewevalsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8877269191867497899L;

    /**
     * 0表示成功
     */
    @ApiField("result_code")
    private Long resultCode;

    /**
     * 总条数
     */
    @ApiField("result_count")
    private Long resultCount;

    /**
     * 评价具体数据
     */
    @ApiListField("staff_eval_details")
    @ApiField("eval_detail")
    private List<EvalDetail> staffEvalDetails;

    public Long getResultCode() {
        return this.resultCode;
    }

    public Long getResultCount() {
        return this.resultCount;
    }

    public List<EvalDetail> getStaffEvalDetails() {
        return this.staffEvalDetails;
    }

    public void setResultCode(Long resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public void setStaffEvalDetails(List<EvalDetail> staffEvalDetails) {
        this.staffEvalDetails = staffEvalDetails;
    }

}
