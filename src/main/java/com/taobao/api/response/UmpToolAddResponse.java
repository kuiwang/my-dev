package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.tool.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpToolAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2859862882483221333L;

    /**
     * 工具id
     */
    @ApiField("tool_id")
    private Long toolId;

    public Long getToolId() {
        return this.toolId;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }

}
