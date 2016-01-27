package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tmc.messages.consume response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcMessagesConsumeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5369613727836142572L;

    /**
     * 消息列表
     */
    @ApiListField("messages")
    @ApiField("tmc_message")
    private List<TmcMessage> messages;

    public List<TmcMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(List<TmcMessage> messages) {
        this.messages = messages;
    }

}
