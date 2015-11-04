package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keywordids.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordidsChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8259711321391321519L;

    /**
     * 词的ID列表
     */
    @ApiListField("changed_keyword_ids")
    @ApiField("number")
    private List<Long> changedKeywordIds;

    public void setChangedKeywordIds(List<Long> changedKeywordIds) {
        this.changedKeywordIds = changedKeywordIds;
    }

    public List<Long> getChangedKeywordIds() {
        return this.changedKeywordIds;
    }

}
