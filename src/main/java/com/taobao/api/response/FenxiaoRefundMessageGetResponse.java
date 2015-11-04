package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OrderMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.refund.message.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundMessageGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1796235862476334179L;

    /**
     * 退款留言
     */
    @ApiListField("order_messages")
    @ApiField("order_message")
    private List<OrderMessage> orderMessages;

    /**
     * 总留言条数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setOrderMessages(List<OrderMessage> orderMessages) {
        this.orderMessages = orderMessages;
    }

    public List<OrderMessage> getOrderMessages() {
        return this.orderMessages;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
