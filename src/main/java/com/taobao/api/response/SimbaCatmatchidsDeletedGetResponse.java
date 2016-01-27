package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.catmatchids.deleted.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCatmatchidsDeletedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5447878754588827478L;

    /**
     * 类目出价ID列表
     */
    @ApiListField("deleted_catmatch_ids")
    @ApiField("number")
    private List<Long> deletedCatmatchIds;

    public List<Long> getDeletedCatmatchIds() {
        return this.deletedCatmatchIds;
    }

    public void setDeletedCatmatchIds(List<Long> deletedCatmatchIds) {
        this.deletedCatmatchIds = deletedCatmatchIds;
    }

}
