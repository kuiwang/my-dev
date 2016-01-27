package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.catmatchids.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCatmatchidsChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7547682364944824496L;

    /**
     * 类目出价ID列表
     */
    @ApiListField("changed_catmatch_ids")
    @ApiField("number")
    private List<Long> changedCatmatchIds;

    public List<Long> getChangedCatmatchIds() {
        return this.changedCatmatchIds;
    }

    public void setChangedCatmatchIds(List<Long> changedCatmatchIds) {
        this.changedCatmatchIds = changedCatmatchIds;
    }

}
