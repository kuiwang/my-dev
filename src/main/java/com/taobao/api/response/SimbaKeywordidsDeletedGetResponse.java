package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keywordids.deleted.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordidsDeletedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5668165831183646678L;

    /**
     * 词ID列表
     */
    @ApiListField("deleted_keyword_ids")
    @ApiField("number")
    private List<Long> deletedKeywordIds;

    public void setDeletedKeywordIds(List<Long> deletedKeywordIds) {
        this.deletedKeywordIds = deletedKeywordIds;
    }

    public List<Long> getDeletedKeywordIds() {
        return this.deletedKeywordIds;
    }

}
