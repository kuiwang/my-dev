package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.refund.messages.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RefundMessagesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1417179677161198471L;

    /**
     * 查询到的退款留言/凭证列表
     */
    @ApiListField("refund_messages")
    @ApiField("refund_message")
    private List<RefundMessage> refundMessages;

    /**
     * 查询到的退款留言/凭证总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<RefundMessage> getRefundMessages() {
        return this.refundMessages;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setRefundMessages(List<RefundMessage> refundMessages) {
        this.refundMessages = refundMessages;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
