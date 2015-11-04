package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 代送商模型
 *
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryAgentVO extends TaobaoObject {

    private static final long serialVersionUID = 3732798441677397395L;

    /**
     * 代送商ID
     */
    @ApiField("agent_id")
    private Long agentId;

    /**
     * 代送商名称
     */
    @ApiField("agent_name")
    private String agentName;

    /**
     * 代送商userId
     */
    @ApiField("agent_user_id")
    private Long agentUserId;

    public Long getAgentId() {
        return this.agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Long getAgentUserId() {
        return this.agentUserId;
    }

    public void setAgentUserId(Long agentUserId) {
        this.agentUserId = agentUserId;
    }

}
