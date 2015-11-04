package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundMappingResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.rp.refunds.agree response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RpRefundsAgreeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3763522759544513593L;

    /**
     * 信息
     */
    @ApiField("message")
    private String message;

    /**
     * 批量退款操作情况，可选值：OP_SUCC（全部成功），SOME_OP_SUCC（部分成功），OP_FAILURE_UE（全部失败）
     */
    @ApiField("msg_code")
    private String msgCode;

    /**
     * 退款操作结果列表
     */
    @ApiListField("results")
    @ApiField("refund_mapping_result")
    private List<RefundMappingResult> results;

    /**
     * 操作成功
     */
    @ApiField("succ")
    private Boolean succ;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public void setResults(List<RefundMappingResult> results) {
        this.results = results;
    }

    public List<RefundMappingResult> getResults() {
        return this.results;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }

    public Boolean getSucc() {
        return this.succ;
    }

}
