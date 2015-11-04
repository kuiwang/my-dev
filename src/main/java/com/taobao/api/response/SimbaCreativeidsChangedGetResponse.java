package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.creativeids.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCreativeidsChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5579448469451341638L;

    /**
     * 创意ID列表
     */
    @ApiListField("changed_creative_ids")
    @ApiField("number")
    private List<Long> changedCreativeIds;

    public void setChangedCreativeIds(List<Long> changedCreativeIds) {
        this.changedCreativeIds = changedCreativeIds;
    }

    public List<Long> getChangedCreativeIds() {
        return this.changedCreativeIds;
    }

}
